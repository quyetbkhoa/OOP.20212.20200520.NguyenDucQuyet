package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_ITEMS = 20;
	private List <Media> itemsOrdered = new ArrayList<Media>();
	public void addMedia(Media ... medias) {
		int count =0;
		for (int i = 0; i < medias.length; i++) {
		if ( this.itemsOrdered.size()< Cart.MAX_ITEMS) {
		
			if (this.itemsOrdered.contains(medias[i])) { 
			this.itemsOrdered.add(medias[i]);	
			count+=1;}
			else{
				System.out.print(medias[i].getTitle());
				System.out.println("  is already added"); 
        }}
		
		}
	System.out.println(count+ " disc has been added to the cart");
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
	public void removeMedia( Media media) {
		for (Media x: this.itemsOrdered) {
			if (x==media) {
				System.out.println("a media has been removed");
				this.itemsOrdered.remove(x);
				return;
			}
		}
	}
	public Media getLuckyItem() {
		if (this.itemsOrdered.size() >= 5) {
			int max = this.itemsOrdered.size();
			int min = 0;
			int rand = (int) Math.random()*( max - min);
			Media chu = this.itemsOrdered.get(rand);
		    return chu;
			
		}
		else {
			System.out.println("number of items is less than 5");
			return null;
		}
	}
	public void print() {
		this.itemsOrdered.sort((a,b) -> {
			int cmp = a.getTitle().compareTo(b.getTitle());
			if (cmp!=0)
				return cmp;
			cmp = - Math.round((a.getCost()- b.getCost()));
			return cmp;
		});
		this.display();		
	}
		
	public void searchById(int id1) {
		int count=0;
		for (Media x : this.itemsOrdered) {
			if (x==null) { continue;}			
			if (x.getId() == id1) {
				count++;
				System.out.print("Found by id " + id1 + " : ");
				System.out.println(x);	
			}			
		}
		if (count==0) {
			System.out.println("no match is found");			
		}		
	}
	public float totalCost() {
		float s=0;
		for ( Media x: this.itemsOrdered) {
			s+= x.getCost();			
		}
		return s;
	}	
//	Search By Title
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
			return null;
			
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
		this.display();
		}
	public void sortByCost() {
		this.itemsOrdered.sort((a,b) -> {
			int cmp = - Math.round((a.getCost()- b.getCost()));
			if ( cmp!=0) 
				return cmp;		
		    cmp = a.getTitle().compareTo(b.getTitle());
			return cmp;		
	               });
		System.out.println("Ordered Items by Cost:");
		this.display();
	}
	public void display() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		float tt = 0;
		int cnt = 1;
		for (Media x: this.itemsOrdered) {
			if ( x== null) continue;
			System.out.println(cnt + ". " + x);
			tt+=x.getCost();
			cnt++;
		}
		System.out.println("number of dvds: " + this.itemsOrdered.size());
		System.out.println("Total cost: " + tt);
		System.out.println("***************************************************");
        }
	public void empty() {
		this.itemsOrdered.removeAll(itemsOrdered);
		}
}	
