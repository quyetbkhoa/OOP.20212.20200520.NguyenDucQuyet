package hust.soict.dsai.test.screen.customer.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.customer.controller.CartController;
import hust.soict.dsai.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewCartScreen extends Application { 
	private static Store store;
	private static Cart cart; 
	@Override 
	public void start(Stage primaryStage) throws Exception { 
		final String CART_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Cart.fxml"; 
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(CART_FXML_FILE_PATH)); 
		CartController cartController = new CartController(store, cart); 
		System.out.println(cart.getItemsOrdered());
		fxmlLoader.setController(cartController); 
		Parent root = fxmlLoader.load(); 
		primaryStage.setTitle("Cart"); 
		primaryStage.setScene(new Scene(root)); 
		primaryStage.show(); 
		} 
		public static void main(String[] args) { 
			store= new Store();
			cart = new Cart();
			DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King",
					"Animation", "Roger Allers", 87, 19.95f);
			
			DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
					"George Lucas", 87, 24.95f);
//			ArrayList<String> authors = new ArrayList<String>();
//			authors.add("Khanh");
//			authors.add("kHanh2");
//			Book book =new Book("Aladin", "Animation", 18.99f, authors);
//			CompactDisc cd1 = new CompactDisc("weq","fds","qw", "eweq", 23);
//			CompactDisc cd2 = new CompactDisc("q","fds","qwqw", "eqeq", 233);
			cart.addMedia(disc1,disc2);
			launch(args); 
			
} 
}

