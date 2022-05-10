
public class Cart {
	public static final int MAX_NUMBERS_ORDERED	=20;
	private DigitalVideoDisc itemsOrdered[]=
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered < Cart.MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.println("The disc has been added.");
			}
		else 
			{System.out.println("Your cart is full.");}}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if (this.qtyOrdered + dvdList.length <= Cart.MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < dvdList.length; i++) {
				this.itemsOrdered[this.qtyOrdered + i] = dvdList[i];
				}
			this.qtyOrdered += dvdList.length;
			System.out.println("The list has been added");
			}
		else {System.out.println("There are not enough empty slot");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (this.qtyOrdered +1 < Cart.MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered] = dvd1;
			this.itemsOrdered[this.qtyOrdered] = dvd2;
			this.qtyOrdered += 2;
			System.out.println("The disc has been added.");
			}
		else 
			{System.out.println("Your cart is full.");}}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if ( this.qtyOrdered > 0) {
			for ( int i=0; i< this.qtyOrdered; i++) {
				if (itemsOrdered[i]==disc) {
					itemsOrdered[i]=null;
					this.qtyOrdered-=1;
							
					for ( int j=i; j < this.qtyOrdered; j++) {
						itemsOrdered[j]=itemsOrdered[j+1];}}}
				
					System.out.println("disc has been removed");
		
			}
			
		else { System.out.println("The cart is empty");
	}
    }
	public float totalCost() {
		float s=0;
		for ( int i=0; i< this.qtyOrdered; i++) {
			s+=itemsOrdered[i].getCost();
		}
		return s;
	}
	}
	
	
