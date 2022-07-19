package hust.soict.dsai.aims.screen.customer.controller;

import java.io.IOException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.playable.Playable;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ItemController {
	private Media media;
	private Cart cart;
	private Store store;
	public ItemController(Store store, Cart cart) {
		this.cart= cart;
		this.store = store;
		
	}

	
	public void setData(Media media) {
		this.media= media;
		lblTitle.setText(media.getTitle());
		lblCost.setText(media.getCost()+" $");
		if (media instanceof Playable) {
			btnPlay.setVisible(true);
			
		}
		else {
			btnPlay.setVisible(false);
			HBox.setMargin(btnAddToCart, new Insets(0,0,0,60));
			
		}
	}
	@FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblCost;
    


    @FXML
    void btnAddToCartClicked(ActionEvent event) {
    	cart.addMedia(media);
    	store.removeMedia(media);
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
    void btnPlayClicked(ActionEvent event) {
    	try {
    		((Playable) media).play();
    		Alert alert= new Alert(AlertType.INFORMATION);
        	alert.setHeaderText(null);
        	alert.setContentText("Playing" + " the song name: "+ media.getTitle());
        	alert.showAndWait();
    	}
    	catch(Exception e) {
    	Alert alert= new Alert(AlertType.INFORMATION);
    	alert.setHeaderText(null);
    	alert.setContentText("non-positive length");
    	alert.showAndWait();
    	}
    }

}
