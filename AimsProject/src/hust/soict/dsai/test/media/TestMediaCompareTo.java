package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hust.soict.dsai.aims.book.Book;
import hust.soict.dsai.aims.cd.CompactDisc;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
public class TestMediaCompareTo {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 =new DigitalVideoDisc("Aladin", "Animation", 
				30.99f);
		List<Media> collection = new ArrayList<Media>();
		collection.add(dvd2);
		collection.add(dvd1);
		collection.add(dvd3);
		Iterator<Media> iterator = collection.iterator();
		System.out.println("------------------------------------------");
		System.out.println("The DVDs currently in the order are:");
		
		while (iterator.hasNext()) {
			DigitalVideoDisc a =((DigitalVideoDisc)iterator.next());
			System.out.println(a.getTitle()+" "+ a.getCost()+"$");
			
		}
		java.util.Collections.sort(collection, Media.COMPARE_BY_COST_TITLE);
		iterator= collection.iterator();
		
		System.out.println("------------------------------------------");
		System.out.println("COMPARE_BY_COST_TITLE");
		System.out.println("The DVDs currently in the order are:");
		
		while (iterator.hasNext()) {
			DigitalVideoDisc a =((DigitalVideoDisc)iterator.next());
			System.out.println(a.getTitle()+" "+ a.getCost()+"$");
			
		}
		java.util.Collections.sort(collection, Media.COMPARE_BY_TITLE_COST);
		iterator= collection.iterator();
		
		System.out.println("------------------------------------------");
		System.out.println("COMPARE_BY_TITLE_COST");
		System.out.println("The DVDs currently in the order are:");
		
		while (iterator.hasNext()) {
			DigitalVideoDisc a =((DigitalVideoDisc)iterator.next());
			System.out.println(a.getTitle()+" "+ a.getCost()+"$");
			
		List<Media> media= new ArrayList<Media>();
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Khanh");
		authors.add("kHanh2");
		Book book =new Book("Aladin", "Animation", 18.99f, authors);
		DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		CompactDisc cd1 = new CompactDisc("weq","fds","qw", "eweq", 23);
		media.add(book);
		media.add(cd1);
		media.add(disc1);
		for ( Media m : media) {
			System.out.println(m.toString());
		}
	
    }
}
}
