package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(" The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		System.out.println(dvd1.getTitle());
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		System.out.println(dvd2.getTitle());
		
		DigitalVideoDisc dvd3 =new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		System.out.println(dvd3.getTitle());
		cart.addMedia(dvd1, dvd2, dvd3);
		cart.print();
		cart.removeMedia("Aladin");
		cart.removeMedia(dvd1);
		cart.print();
		cart.searchById(2);
		cart.empty();
		cart.print();
	}
}
