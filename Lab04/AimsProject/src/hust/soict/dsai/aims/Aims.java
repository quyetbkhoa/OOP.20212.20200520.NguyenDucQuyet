
package hust.soict.dsai.aims;
import java.util.*;
import hust.soict.dsai.aims.cart.Cart;
import java.io.Console;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
public class Aims {
	private static Cart cart = new Cart();
	private static Store store = new Store();	
		
	
	public static void main(String[] args) {
		DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		
		DigitalVideoDisc disc3 =new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store.addDVD(disc1, disc2, disc3);	
		Aims.showMenu();
	}
		

	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("-------------------------------------");
		System.out.println("1. ViewStore");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		Scanner myObj = new Scanner(System.in);
		int choice = myObj.nextInt();
//		showMenu
		switch (choice) {
			case 1:
				store.print();
				Aims.storeMenu();
				break;
			case 2:
				System.out.println("1. add DVD ");
				System.out.println("2. remove DVD");
				System.out.println("Please choose a number: 1-2");
				Scanner myObj5 = new Scanner(System.in);
				int choice5 = myObj5.nextInt();
				switch (choice5) {
				default:
					System.out.println("invalid input");
					System.exit(0);
					break;
				case 1:
					System.out.println("enter disc title:");
					Scanner myObj6 = new Scanner(System.in);
					String choice6 = myObj6.nextLine();
					
					System.out.println("enter disc category:");
					Scanner myObj7 = new Scanner(System.in);
					String choice7 = myObj7.nextLine();
					
					System.out.println("enter disc director:");
					Scanner myObj8 = new Scanner(System.in);
					String choice8 = myObj8.nextLine();
					
					System.out.println("enter disc length:");
					Scanner myObj9 = new Scanner(System.in);
					int choice9 = myObj9.nextInt();
					
					System.out.println("enter disc cost:");
					Scanner myObj10 = new Scanner(System.in);
					float choice10 = myObj10.nextFloat();
					DigitalVideoDisc disc = new DigitalVideoDisc(choice6, choice7, choice8, choice9, choice10);
					store.addDVD(disc);
					break;
				case 2:
					System.out.println("enter the title of the disc you want to remove:");
					Scanner myObj11 = new Scanner(System.in);
					String choice11 = myObj11.nextLine();
					store.removeDVD(choice11);
					break;
					}
				break;
			case 3:
				cart.print();
				Aims.cartMenu();
				break;
			case 0:
				System.out.print("Finished");
				System.exit(0);
				break;
			default:
				System.out.println("invalid input");
				System.exit(0);
				break;
			
		}
		
	}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("-------------------------------------");
		System.out.println("1. See a DVD's details");
		System.out.println("2. Add a DVD to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Back");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		
		Scanner myObj1 = new Scanner(System.in);
		int choice1 = myObj1.nextInt();
		switch (choice1) {
	case 1:
		System.out.println("enter the title of the DVD");
		Scanner myObj2 = new Scanner(System.in);
		String choice2 = myObj2.nextLine();
		DigitalVideoDisc dvd= store.searchByTitle(choice2);
		if ( dvd == null) {
			System.out.println("invalid title");
			System.exit(0);
		}
		else{
		Aims.decideToAdd();
		Scanner myObj3 = new Scanner(System.in);
		int choice3 = myObj3.nextInt();
		switch (choice3) {
		case 1:
			cart.addDigitalVideoDisc(dvd);
			break;
		case 2:
			break;
		default:
			System.out.println("invalid input");
			System.exit(0);
			break;
			}
		}
		Aims.showMenu();
	break;
	case 2:
		System.out.println("enter the title of the DVD");
		Scanner myObj4 = new Scanner(System.in);
		String choice4 = myObj4.nextLine();
		DigitalVideoDisc dvd1= store.searchByTitle(choice4);
		
		if ( dvd1 == null) {
			System.exit(0);
	    }
		else {
			cart.addDigitalVideoDisc(dvd1);
			cart.print();
		}
		Aims.showMenu();
		break;
	case 3:
		cart.print();
		Aims.cartMenu();
		break;
	case 0 :
		Aims.showMenu();
		break;
	default:
		System.out.println("invalid input");
		System.exit(0);
		}
	}
	public static void decideToAdd() {
		System.out.println("Do you want to add this DVD to your cart?");
		System.out.println("1. Yes ");
		System.out.println("2. No");
		System.out.println("Please choose a number: 1-2");
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("-------------------------------------");
		System.out.println("1. Filter DVDs in cart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place order");
		System.out.println("0. Back");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		
		Scanner myObj12 = new Scanner(System.in);
		int choice12 = myObj12.nextInt();
//		cartMenu
		switch(choice12) {
		default:
			System.out.println("invalid input");
			System.exit(0);
			break;
		case 1:
			System.out.println("1. Filter by id");
			System.out.println("2. filter by title");
			Scanner myObj13 = new Scanner(System.in);
			int choice13 = myObj13.nextInt();
			switch (choice13) {
			default:
				System.out.println("invalid input");
				System.exit(0);
			case 1:
				System.out.println("enter the id you want to filter");
				Scanner myObj14 = new Scanner(System.in);
				int choice14 = myObj14.nextInt();
				cart.searchById(choice14);
				break;
			case 2:
				System.out.println("enter the title you want to filter");
				Scanner myObj15 = new Scanner(System.in);
				String choice15 = myObj15.nextLine();
				cart.searchByTitle(null);
				break;
			}
			break;
		case 2:
			System.out.println("1. sort by title");
			System.out.println("2. sort by cost");
			Scanner myObj16 = new Scanner(System.in);
			int choice16 = myObj16.nextInt();
			switch (choice16) {
			default:
				System.out.println("invalid input");
				System.exit(0);
			case 1:
				cart.sortByTitle();
				break;
			case 2:
				cart.sortByCost();
				break;						
			}
			break;
		case 3:
			System.out.println("enter the title of dvd you want to remove");
			Scanner myObj17 = new Scanner(System.in);
			String choice17 = myObj17.nextLine();
			cart.removeDigitalVideoDisc(choice17);
			break;
		case 4:
			System.out.print("an order is created");
			cart.empty();
			cart.display();
			break;
		case 0:
			Aims.showMenu();
			break;
			
		
		
	}
}}