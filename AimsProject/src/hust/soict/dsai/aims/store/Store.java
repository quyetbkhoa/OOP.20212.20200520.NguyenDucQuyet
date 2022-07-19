package hust.soict.dsai.aims.store;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Store {
	public static final int MAX_ITEMS = 40;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	public void addMedia(Media ... medias) throws LimitExceededException {
=======
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;

public class Store {
	public static final int MAX_ITEMS = 40;
	private List <Media> itemsOrdered = new ArrayList<Media>();
	public void addMedia(Media ... medias) {
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		int count =0;
		for (int i = 0; i < medias.length; i++) {
		if ( this.itemsOrdered.size()< Cart.MAX_ITEMS) {
		
			if (this.itemsOrdered.contains(medias[i])) { 
				System.out.print(medias[i].getTitle());
				System.out.println("  is already added"); 				
				}
			else{
				this.itemsOrdered.add(medias[i]);
				this.itemsOrdered.get(i).setDateAdded(LocalDate.now());
				count+=1;
				
        }}
<<<<<<< HEAD
		else {
			throw new LimitExceededException("ERROR: The number of media has reach its limit");
		}
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		
		}
	System.out.println(count+ " media has been added to the store");
	}
	public ArrayList<Media> getItemsInStore(){
		ArrayList<Media> b =  new ArrayList<Media>(this.itemsOrdered);
		return b;
	}
	public void removeMedia(String title) {
		if (this.itemsOrdered.size() == 0) {
			System.out.print("cart is empty");
			return ;
		}
		List<Media> toRemove = new ArrayList<Media>();
		for (Media x : this.itemsOrdered) {
		    if (x.getTitle().equals(title)) {
		        toRemove.add(x);
		    }
		}
		this.itemsOrdered.removeAll(toRemove);
		System.out.println("all media with title :"+ title + " have been remove");
		}
<<<<<<< HEAD
	public void removeMedia( Media media) {
		for (Media x: this.itemsOrdered) {
			if (x==media) {
				System.out.println("a media has been removed");
				this.itemsOrdered.remove(x);
				return;
			}
		}
	}
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b

	
//	Display
	public void print() {

		this.itemsOrdered.sort((a,b) -> {
			int cmp = a.getTitle().compareTo(b.getTitle());
			if (cmp!=0)
				return cmp;
			cmp = - Math.round((a.getCost()- b.getCost()));
			return cmp;
		});
		System.out.println("***********************Store***********************");
		System.out.println("Items in the store: "+ this.itemsOrdered.size() );
		int cnt = 1;
		for ( Media x: this.itemsOrdered) {
			if ( x== null) continue;
			System.out.println(cnt + ". " + x);
			cnt++;
		}
		System.out.println("***************************************************");	
	}
	public Media searchByTitle( String title) {
		int count=0;
		for (Media x : this.itemsOrdered) {
			if (x.isMatch(title)) {
				count++;
				System.out.print("Found by title " +"'"+ title+ "' "+ " : ");
				System.out.println(x);
				return x;

			}
					
        }
		if (count==0) {
			System.out.println("no match is found");			
		}
		return null;
		
	}
	public void sortByTitle() {
		this.itemsOrdered.sort((a,b) -> {
			int cmp = a.getTitle().compareTo(b.getTitle());
			if (cmp!=0)
				return cmp;
			cmp = - Math.round((a.getCost()- b.getCost()));
			return cmp;
		});
		System.out.println("Ordered Items by title:");
		this.print();
		}
	
 }
	

