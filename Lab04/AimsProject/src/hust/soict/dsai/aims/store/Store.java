package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public static final int MAX_ITEMS = 40;
	private DigitalVideoDisc itemsInStore[]= new DigitalVideoDisc[MAX_ITEMS];
	private int numberOfDisc = 0;
	public void addDVD(DigitalVideoDisc ... dvds) {
		int count=0;
		for (int i = 0; i < dvds.length; i++) {
		if (this.numberOfDisc + 1 <= Store.MAX_ITEMS) {
			boolean a = true ;
			for (DigitalVideoDisc x: itemsInStore) {
				if (x==dvds[i]){ a = false; }
			}
			if (a) { 
			this.itemsInStore[this.numberOfDisc] = dvds[i];	
			count+=1;
			this.numberOfDisc += 1;}
			else{
				System.out.print(dvds[i]);
				System.out.println("  is already added");
			}}}
		System.out.println(count+ " disc has been added to the store");
		}
	public void removeDVD(String title ) {
		int count=0;
		if ( this.numberOfDisc > 0) {
			for ( int i=0; i< this.numberOfDisc; i++) {
				if (itemsInStore[i].getTitle().equals(title)) {
					count++;
					itemsInStore[i]=null;
					this.numberOfDisc-=1;
							
					for ( int j=i; j < this.numberOfDisc; j++) {
						itemsInStore[j]=itemsInStore[j+1];
						itemsInStore[j+1]= null; }}}	
			}
		if ( count==0) {
		System.out.println("The store is empty");}
		else {
			System.out.println(count+ " disc has been removed");
		}
	}
	@Override
	public String toString() {
		return "Store [itemsInStore=" + Arrays.toString(itemsInStore) + ", numberOfDisc=" + numberOfDisc + "]";
	}
//	Display
	public void print() {
		List< DigitalVideoDisc>	lst= new ArrayList< DigitalVideoDisc>();
		for(DigitalVideoDisc x : this.itemsInStore) {
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
		System.out.println("***********************Store***********************");
		System.out.println("Items in the store: "+ numberOfDisc );
		int cnt = 1;
		for ( DigitalVideoDisc x: lst) {
			if ( x== null) continue;
			System.out.println(cnt + ". " + x);
			cnt++;
		}
		System.out.println("***************************************************");	
	}
	public DigitalVideoDisc searchByTitle( String title) {
		int count=0;
		for (DigitalVideoDisc x : this.itemsInStore) {
			if (x==null) { continue;}	
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
	
	
 }
	

