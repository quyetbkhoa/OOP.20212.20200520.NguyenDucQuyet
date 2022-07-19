package hust.soict.dsai.aims.screen.customer.controller;

import java.io.IOException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.playable.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CartController {
	private Cart cart; 
	private Store store;
	private int mode;
	public CartController(Store store, Cart cart) {
		this.store= store;
		this.cart = cart;
		
	}
	 @FXML
    private RadioButton radioBtnFilterTitle;
    
    @FXML
    private RadioButton radioBtnFilterId;
    @FXML
    void idMode(ActionEvent event) {
    	mode =1;
    	

    }

    @FXML
    void titleMode(ActionEvent event) {
    	mode = 2;

    }
    private FilteredList<Media> filteredData;
	@FXML 
	private TextField tfFilter;
	public void showFilteredMedia(String value) {
		if (tfFilter.getText().length()==0) {
			filteredData = new FilteredList<>(cart.getItemsOrdered());
		}
		else {
		if ( mode == 2) {
			filteredData = new FilteredList<>(cart.getItemsOrdered(),
                item -> item.getTitle().contains(tfFilter.getText()));
		}
		else {
			try {
			filteredData = new FilteredList<>(cart.getItemsOrdered(),
	                item -> item.getId()== Integer. parseInt(tfFilter.getText()) );
			} catch (Exception e) {
				filteredData = new FilteredList<>(FXCollections.observableArrayList());
				System.out.println("please insert a number");
			}
		}
		}
		tblMedia.setItems(filteredData);
		
		
	}
	@FXML
	public void initialize() {
		tfFilter.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				showFilteredMedia(newValue);
			}
		});	
		colMediaId.setCellValueFactory(new PropertyValueFactory<Media,Integer>("id"));
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media,String>("title"));
		colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media,String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media,Float>("cost"));
		System.out.println("----");
		System.out.println( cart.getItemsOrdered());
		if( cart.getItemsOrdered() !=null ) {
			System.out.print("----");
			tblMedia.setItems(cart.getItemsOrdered());
		}
		
		costLabel.setText(cart.totalCost()+"$");
		
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		
		tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
			public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
				updateButtonBar(newValue);
				
			}
		});
	}
	void updateButtonBar(Media media) {
		if(media == null) {
			btnPlay.setVisible(false);
			btnRemove.setVisible(false);
		}
		else {
			btnRemove.setVisible(true);
			if(media instanceof Playable) {
				btnPlay.setVisible(true);
			}
			else{
				btnPlay.setVisible(false);
			}
		}
	}
	
	
	@FXML
    private TableColumn<Media, Integer> colMediaId;

    @FXML
    private Label costLabel ;


    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;


    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private ToggleGroup filterGroup;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private Button placeOrderButton;
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	try {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	((Playable) media).play();
    	Alert alert= new Alert(AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	
    	alert.setContentText("Playing" + " the song name: "+ media.getTitle());
    	alert.showAndWait();
    	}
    	catch(Exception e) {
    		Alert alert= new Alert(AlertType.INFORMATION);
        	alert.setHeaderText(null);
        	alert.setContentText("this media has non-positive length");
        	alert.showAndWait();
    	}

    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    }

    @FXML
    void btnViewStorePressed(ActionEvent event) {
    	
    	try {
    		final String STORE_FXML_FILE_PATH= "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
    			fxmlLoader.setController(new ViewStoreController(store, cart));
    			Parent root = fxmlLoader.load();
    			Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
    			stage.setScene(new Scene(root));
    			stage.setTitle("Store");
    			stage.show();
    			
    	} catch(IOException e) {
    		e.printStackTrace();
    	}

    }
    @FXML
    void placeOrder(ActionEvent event) {
    	Alert alert= new Alert(AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	alert.setContentText("An order has been made");
    	alert.showAndWait();
    }
    
   
}
