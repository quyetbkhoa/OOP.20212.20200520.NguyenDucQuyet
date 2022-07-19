package hust.soict.dsai.test.screen.customer.store;

import java.io.File;
import java.util.ArrayList;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.book.Book;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.cd.CompactDisc;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.customer.controller.ViewStoreController;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application { 
	private static Cart cart; 
	private static Store store; 
	@Override 
	public void start(Stage primaryStage) throws Exception { 
		final String STORE_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml"; 
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH)); 
		ViewStoreController viewStoreController = new ViewStoreController(store, cart); 
		fxmlLoader.setController(viewStoreController); 
		Parent root = fxmlLoader.load(); 
		primaryStage.setTitle("Store"); 
		primaryStage.setScene(new Scene(root)); 
		primaryStage.show(); 
		} 
		public static void main(String[] args) throws LimitExceededException { 
			store = new Store();
			DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King",
					"Animation", "Roger Allers", -56, 19.95f);
			
			DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
					"George Lucas", 87, 24.95f);
			ArrayList<String> authors = new ArrayList<String>();
			authors.add("Khanh");
			authors.add("kHanh2");
			Book book =new Book("Aladin", "Animation", 18.99f, authors);
			CompactDisc cd1 = new CompactDisc("weq","fds","qw", "eweq", 23);
			CompactDisc cd2 = new CompactDisc("q","fds","qwqw", "eqeq", 233);
			store.addMedia(cd1,cd2,book,disc1,disc2);
			cart = new Cart();
			DigitalVideoDisc disc3 = new DigitalVideoDisc("The King",
					"Animation", "Roger Allers", 87, 19.95f);
			
			DigitalVideoDisc disc4 = new DigitalVideoDisc("Star ", "Science Fiction",
					"George Lucas", 87, 24.95f);
//			ArrayList<String> authors = new ArrayList<String>();
//			authors.add("Khanh");
//			authors.add("kHanh2");
//			Book book =new Book("Aladin", "Animation", 18.99f, authors);
//			CompactDisc cd1 = new CompactDisc("weq","fds","qw", "eweq", 23);
//			CompactDisc cd2 = new CompactDisc("q","fds","qwqw", "eqeq", 233);
			cart.addMedia(disc3,disc4);
			launch(args); 
} 
}

