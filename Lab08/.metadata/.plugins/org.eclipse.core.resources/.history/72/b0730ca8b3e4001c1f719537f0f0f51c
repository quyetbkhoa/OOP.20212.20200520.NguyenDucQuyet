package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED	=20;
	private DigitalVideoDisc itemsOrdered[]=
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered < Cart.MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.println("A disc has been added to cart");
			}
		else 
			{System.out.println("Your cart is full.");}}
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		if (this.qtyOrdered + dvdList.length <= Cart.MAX_NUMBERS_ORDERED) {
//			for (int i = 0; i < dvdList.length; i++) {
//				this.itemsOrdered[this.qtyOrdered + i] = dvdList[i];
//				}
//			this.qtyOrdered += dvdList.length;
//			System.out.println("The list has been added");
//			}
//		else {System.out.println("There are not enough empty slot");
//		}
//	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (this.qtyOrdered +1 <= Cart.MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered] = dvd1;
			this.qtyOrdered += 1;
			if (this.qtyOrdered +1 <= Cart.MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered] = dvd2;
			this.qtyOrdered += 1;
			System.out.println("two discs has been added.");}
			else { System.out.println("one disc has been added to the cart.");}
			
			}
		else 
			{System.out.println("Your cart is full.");}}
	
	public void addDigitalVideoDisc(DigitalVideoDisc ... dvds) {
		int count=0;
		for (int i = 0; i < dvds.length; i++) {
		if (this.qtyOrdered + 1 <= Cart.MAX_NUMBERS_ORDERED) {
			boolean a = true ;
			for (DigitalVideoDisc x: itemsOrdered) {
				if (x==dvds[i]){ a = false; }
			}
			if (a) { 
			this.itemsOrdered[this.qtyOrdered] = dvds[i];	
			count+=1;
			this.qtyOrdered += 1;}
			else{
				System.out.print(dvds[i]);
				System.out.println("  is already added");
			}}}
		System.out.println(count+ " disc has been added to the cart");
		}
	public void removeDigitalVideoDisc(String title) {
		if ( this.qtyOrdered > 0) {
			for ( int i=0; i< this.qtyOrdered; i++) {
				if (itemsOrdered[i].getTitle().equals(title)) {
					itemsOrdered[i]=null;
					this.qtyOrdered-=1;
							
					for ( int j=i; j < this.qtyOrdered; j++) {
						itemsOrdered[j]=itemsOrdered[j+1];
						itemsOrdered[j+1]= null; }}}
				
					System.out.println("disc has been removed");
		
			}
			
		else { System.out.println("The cart is empty");
	}
    }
//	public void sortByCost() {
//		List< DigitalVideoDisc>	lst= new ArrayList< DigitalVideoDisc>();
//		for(DigitalVideoDisc x : this.itemsOrdered) {
//			if(x != null)
//				lst.add(x);
//		}					
//		Collections.sort( lst, ((a,b) -> 
//		Float.compare(a.getCost(), b.getCost())));
//		this.itemsOrdered = lst.toArray(new DigitalVideoDisc[lst.size()]);
//	}
//	public void sortBytitle() {
//		List< DigitalVideoDisc>	lst= new ArrayList< DigitalVideoDisc>();
//		for(DigitalVideoDisc x : this.itemsOrdered) {
//			if(x != null)
//				lst.add(x);
//		}						
//		Collections.sort( lst, ((a,b) -> 
//	     (a.getTitle().compareTo(b.getTitle()))));
//		this.itemsOrdered = lst.toArray(new DigitalVideoDisc[lst.size()]);
//	}
	public void print() {
		List< DigitalVideoDisc>	lst= new ArrayList< DigitalVideoDisc>();
		for(DigitalVideoDisc x : this.itemsOrdered) {
			if(x != null)
				lst.add(x);
		}
		lst.sort((a,b) -> {
			int cmp = a.getTitle().compareTo(b.getTitle());
			if (cmp!=0)
				return cmp;
			cmp = - Math.round((a.getCost()- b.getCost()));
			if ( cmp!=0) 
				return cmp;
			cmp=b.getLength() - a.getLength();
			return cmp;
		});
		this.itemsOrdered = lst.toArray(new DigitalVideoDisc[lst.size()]);
		this.display();		
	}
		
	public void searchById(int id1) {
		int count=0;
		for (DigitalVideoDisc x : this.itemsOrdered) {
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
		for ( int i=0; i< this.qtyOrdered; i++) {
			s+=itemsOrdered[i].getCost();
		}
		return s;
	}	
	@Override
	public String toString() {
		return "Cart [itemsOrdered=" + Arrays.toString(itemsOrdered) + ", qtyOrdered=" + qtyOrdered + "]";
	}
//	Search By Title
	public void searchByTitle( String title) {
		int count=0;
		for (DigitalVideoDisc x : this.itemsOrdered) {
			if (x==null) { continue;}	
			if (x.isMatch(title)) {
				count++;
				System.out.print("Found by title " +"'"+ title+ "' "+ " : ");
				System.out.println(x);
			}
					
        }
		if (count==0) {
			System.out.println("no match is found");
			
		}
		
		
	}
	public void sortByTitle() {
		List< DigitalVideoDisc>	lst= new ArrayList< DigitalVideoDisc>();
		for(DigitalVideoDisc x : this.itemsOrdered) {
			if(x != null)
				lst.add(x);
		}
		lst.sort((a,b) -> {
			int cmp = a.getTitle().compareTo(b.getTitle());
			if (cmp!=0)
				return cmp;
			cmp = - Math.round((a.getCost()- b.getCost()));
			return cmp;
		});
		this.itemsOrdered = lst.toArray(new DigitalVideoDisc[lst.size()]);
		System.out.println("Ordered Items by title:");
		this.display();
		}
	public void sortByCost() {
		List< DigitalVideoDisc>	lst= new ArrayList< DigitalVideoDisc>();
		for(DigitalVideoDisc x : this.itemsOrdered) {
			if(x != null)
				lst.add(x);
		}
		lst.sort((a,b) -> {
			int cmp = - Math.round((a.getCost()- b.getCost()));
			if ( cmp!=0) 
				return cmp;		
		    cmp = a.getTitle().compareTo(b.getTitle());
			return cmp;		
	               });
		System.out.println("Ordered Items by Cost:");
		this.itemsOrdered = lst.toArray(new DigitalVideoDisc[lst.size()]);
		this.display();
	}
	public void display() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		float tt = 0;
		int cnt = 1;
		for ( DigitalVideoDisc x: this.itemsOrdered) {
			if ( x== null) continue;
			System.out.println(cnt + ". " + x);
			tt+=x.getCost();
			cnt++;
		}
		System.out.println("number of dvds: " + this.qtyOrdered);
		System.out.println("Total cost: " + tt);
		System.out.println("***************************************************");
        }
	public void empty() {
		for ( DigitalVideoDisc x: this.itemsOrdered) {
			x=null;
		}
	}
}	
