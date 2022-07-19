package hust.soict.dsai.test.store;

import java.util.ArrayList;

<<<<<<< HEAD
import javax.naming.LimitExceededException;

=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
import hust.soict.dsai.aims.book.Book;
import hust.soict.dsai.aims.cd.CompactDisc;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
<<<<<<< HEAD
	public static void main(String[] args) throws LimitExceededException {
=======
	public static void main(String[] args) {
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(" The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		CompactDisc cd = new CompactDisc("weqwq","fds","qweqw", "eqwweq", 23123);
		
		DigitalVideoDisc dvd3 =new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Khanh");
		authors.add("kHanh2");
		Book book =new Book("Aladin", "Animation", 18.99f, authors);
		System.out.println(book.getTitle());
		store.addMedia(dvd1, cd,  dvd3, book);
		store.print();
		store.sortByTitle();
		store.removeMedia("Aladin");
		store.print();
		store.searchByTitle("Th");
//		

}
}