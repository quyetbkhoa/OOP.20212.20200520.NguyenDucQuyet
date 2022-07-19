
package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

<<<<<<< HEAD
import javax.naming.LimitExceededException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
import hust.soict.dsai.aims.book.Book;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.cd.CompactDisc;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
<<<<<<< HEAD
import hust.soict.dsai.aims.exception.PlayerException;
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.playable.Playable;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.threads.MemoryDaemon;
public class Aims {
	private static Cart cart = new Cart();
	private static Store store = new Store();	
<<<<<<< HEAD
	static Scanner obj = new Scanner(System.in);
	static Scanner obj1 = new Scanner(System.in);
		
	
	public static void main(String[] args) {
		
=======
		
	
	public static void main(String[] args) {
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		Thread t = new Thread(new MemoryDaemon());
		t.setDaemon(true);
	    t.start();
		
		DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King",
<<<<<<< HEAD
				"Animation", "Roger Allers", -56, 19.95f);
=======
				"Animation", "Roger Allers", 87, 19.95f);
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Khanh");
		authors.add("kHanh2");
		Book book =new Book("Aladin", "Animation", 18.99f, authors);
<<<<<<< HEAD
		try {
			store.addMedia(disc1, disc2, book);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
=======
		store.addMedia(disc1, disc2, book);	
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		CompactDisc cd1 = new CompactDisc("weq","fds","qw", "eweq", 23);
		CompactDisc cd2 = new CompactDisc("q","fds","qwqw", "eqeq", 233);
		CompactDisc cd3 = new CompactDisc("wewq","fds","qqw", "eqeq", 3123);
		CompactDisc cd4 = new CompactDisc("eq","fds","qwe", "ewweq", 2312);
		
		cart.addMedia(cd1,cd2,cd3,cd4);
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
<<<<<<< HEAD
		int choice = obj.nextInt();
=======
		Scanner myObj = new Scanner(System.in);
		int choice = myObj.nextInt();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
//		showMenu
		switch (choice) {
			case 1:
				store.print();
				Aims.storeMenu();
				break;
			case 2:
				System.out.println("1. add media ");
				System.out.println("2. remove media");
				System.out.println("Please choose a number: 1-2");
<<<<<<< HEAD
				int choice5 = obj.nextInt();
=======
				Scanner myObj5 = new Scanner(System.in);
				int choice5 = myObj5.nextInt();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
				switch (choice5) {
				default:
					System.out.println("invalid input");
					System.exit(0);
					break;
				case 1:
					System.out.println("1. DVD ");
					System.out.println("2. Book");
					System.out.println("3. CD");
<<<<<<< HEAD

					int choice50 = obj.nextInt();
					switch( choice50) {
					case 1: 		
						System.out.println("enter dvd title:");
						String choice62 = obj1.nextLine();
						
						System.out.println("enter dvd category:");
						String choice72 = obj1.nextLine();
						
						System.out.println("enter dvd director:");
						String choice8 = obj1.nextLine();
						
						System.out.println("enter dvd length:");
						
						int choice92 = obj.nextInt();
						
						System.out.println("enter dvd cost:");
						float choice102 = obj.nextFloat();
						DigitalVideoDisc disc = new DigitalVideoDisc(choice62, choice72, choice8, choice92, choice102);
						try {
							store.addMedia(disc);
						} catch (LimitExceededException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
=======
					Scanner myObj50 = new Scanner(System.in);
					int choice50 = myObj50.nextInt();
					switch( choice50) {
					case 1: 		
						System.out.println("enter dvd title:");
						Scanner myObj62 = new Scanner(System.in);
						String choice62 = myObj62.nextLine();
						
						System.out.println("enter dvd category:");
						Scanner myObj72 = new Scanner(System.in);
						String choice72 = myObj72.nextLine();
						
						System.out.println("enter dvd director:");
						Scanner myObj8 = new Scanner(System.in);
						String choice8 = myObj8.nextLine();
						
						System.out.println("enter dvd length:");
						
						Scanner myObj92 = new Scanner(System.in);
						int choice92 = myObj92.nextInt();
						
						System.out.println("enter dvd cost:");
						Scanner myObj102 = new Scanner(System.in);
						float choice102 = myObj102.nextFloat();
						DigitalVideoDisc disc = new DigitalVideoDisc(choice62, choice72, choice8, choice92, choice102);
						store.addMedia(disc);
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b

						break;
					case 2:
						System.out.println("enter book title:");
<<<<<<< HEAD
	
						String choice61 = obj1.nextLine();
						
						System.out.println("enter disc category:");
		
						String choice71 = obj1.nextLine();
						
						System.out.println("enter disc cost:");
						Float choice81 = obj.nextFloat();
						
						System.out.println("enter disc authors name ( split by comma) :");
						
						String choice91 = obj1.nextLine();
						List<String> l2 = new ArrayList<>(Arrays.asList(choice91.split(",")));
	
						Book book= new Book(choice61, choice71, choice81, l2);
						try {
							store.addMedia(book);
						} catch (LimitExceededException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 3:
						System.out.println("enter CD title:");
	
						String choice613 = obj1.nextLine();
						
						System.out.println("enter CD category:");
						String choice713 = obj1.nextLine();
						
						System.out.println("enter CD artist:");
						String choice7113 = obj1.nextLine();
						
						System.out.println("enter CD director:");
						String choice813 = obj1.nextLine();
=======
						Scanner myObj61 = new Scanner(System.in);
						String choice61 = myObj61.nextLine();
						
						System.out.println("enter disc category:");
						Scanner myObj71 = new Scanner(System.in);
						String choice71 = myObj71.nextLine();
						
						System.out.println("enter disc cost:");
						Scanner myObj81 = new Scanner(System.in);
						Float choice81 = myObj81.nextFloat();
						
						System.out.println("enter disc authors name ( split by comma) :");
						Scanner myObj91 = new Scanner(System.in);
						
						String choice91 = myObj91.nextLine();
						List<String> l2 = new ArrayList<>(Arrays.asList(choice91.split(",")));
	
						Book book= new Book(choice61, choice71, choice81, l2);
						store.addMedia(book);
						break;
					case 3:
						System.out.println("enter CD title:");
						Scanner myObj613 = new Scanner(System.in);
						String choice613 = myObj613.nextLine();
						
						System.out.println("enter CD category:");
						Scanner myObj713 = new Scanner(System.in);
						String choice713 = myObj713.nextLine();
						
						System.out.println("enter CD artist:");
						Scanner myObj7113 = new Scanner(System.in);
						String choice7113 = myObj7113.nextLine();
						
						System.out.println("enter CD director:");
						Scanner myObj813 = new Scanner(System.in);
						String choice813 = myObj813.nextLine();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
						
//						System.out.println("enter CD length:");
//						Scanner myObj91 = new Scanner(System.in);
//						int choice91 = myObj91.nextInt();
						
						System.out.println("enter CD cost:");
<<<<<<< HEAD
						float choice1013 =  obj.nextFloat();
						CompactDisc cd= new CompactDisc(choice613, choice713, choice7113, choice813, choice1013);
						try {
							store.addMedia(cd);
						} catch (LimitExceededException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
=======
						Scanner myObj1013 = new Scanner(System.in);
						float choice1013 = myObj1013.nextFloat();
						CompactDisc cd= new CompactDisc(choice613, choice713, choice7113, choice813, choice1013);
						store.addMedia(cd);
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
					    break;
					}
					break;
				case 2:
					System.out.println("enter the title of the media you want to remove:");
<<<<<<< HEAD
					String choice11 = obj1.nextLine();
=======
					Scanner myObj11 = new Scanner(System.in);
					String choice11 = myObj11.nextLine();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
					store.removeMedia(choice11);
					break;
					}
				Aims.showMenu();
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
		System.out.println("Do you want to play a media?");
		System.out.println("1.Yes");
		System.out.println("2.No");
<<<<<<< HEAD
		int choice = obj.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the name of media you want to play");
			String choice470 = obj1.nextLine();
			Media media1=store.searchByTitle(choice470);
			if ( media1 instanceof Playable) {
				try {
					((Playable) media1).play();
				} catch (PlayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
=======
		Scanner myObj3 = new Scanner(System.in);
		int choicen = myObj3.nextInt();
		switch(choicen) {
		case 1:
			System.out.println("enter the name of media you want to play");
			Scanner myObj47 = new Scanner(System.in);
			String choice47 = myObj47.nextLine();
			myObj47.close();
			Media media1=store.searchByTitle(choice47);
			if ( media1 instanceof Playable) {
				((Playable) media1).play();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
				
			}
			else {
				System.out.println("cant play");
			}
			break;
		case 2:
			break;
		default:
			System.out.println("invalid input");
<<<<<<< HEAD
			break;
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		}


		
		System.out.println("Options: ");
		System.out.println("-------------------------------------");
		System.out.println("1. See a Media details");
		System.out.println("2. Add a Media to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Back");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		
<<<<<<< HEAD
		
		int choice1 = obj.nextInt();
		switch (choice1) {
	case 1:
		System.out.println("enter the title of the DVD");
		
		String choice2 = obj1.nextLine();
		Media media = store.searchByTitle(choice2);
		if ( media instanceof Playable) {
			try {
				((Playable) media).play();
			} catch (PlayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
=======
		Scanner myObj1 = new Scanner(System.in);
		int choice1 = myObj1.nextInt();
		switch (choice1) {
	case 1:
		System.out.println("enter the title of the DVD");
		Scanner myObj2 = new Scanner(System.in);
		String choice2 = myObj2.nextLine();
		Media media = store.searchByTitle(choice2);
		if ( media instanceof Playable) {
			((Playable) media).play();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		}
		else {
			System.out.println("cant play");
		}
		Aims.decideToAdd();
<<<<<<< HEAD
		
		int choice3 = obj.nextInt();
=======
		Scanner myObj35 = new Scanner(System.in);
		int choice3 = myObj35.nextInt();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		switch (choice3) {
		case 1:
			cart.addMedia(media);
			break;
		case 2:
			break;
		default:
			System.out.println("invalid input");
			System.exit(0);
			break;
			}
		Aims.showMenu();
		break;
	case 2:
		System.out.println("enter the title of the media");
<<<<<<< HEAD
		
		String choice4 = obj1.nextLine();
=======
		Scanner myObj4 = new Scanner(System.in);
		String choice4 = myObj4.nextLine();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		Media dvd1= store.searchByTitle(choice4);
		
		if ( dvd1 == null) {
			Aims.showMenu();
	    }
		else {
			System.out.println("media found:" + dvd1);
			cart.addMedia(dvd1);
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
		System.out.println("Do you want to play a media?");
		System.out.println("1.Yes");
		System.out.println("2.No");
<<<<<<< HEAD
		int choicen = obj.nextInt();
		switch(choicen) {
		case 1:
			System.out.println("enter the name of media you want to play");
			String choice47 = obj1.nextLine();
			Media media1= cart.searchByTitle(choice47);
			
			if ( media1 instanceof Playable) {
				try {
					((Playable) media1).play();
				} catch (PlayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
=======
		Scanner myObj3 = new Scanner(System.in);
		int choicen = myObj3.nextInt();
		switch(choicen) {
		case 1:
			System.out.println("enter the name of media you want to play");
			Scanner myObj47 = new Scanner(System.in);
			String choice47 = myObj47.nextLine();
			myObj47.close();
			Media media1= cart.searchByTitle(choice47);
			if ( media1 instanceof Playable) {
				((Playable) media1).play();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
				
			}
			else {
				System.out.println("cant play");
			}
			break;
		case 2:
			break;
		default:
			System.out.println("invalid input");
		}
		System.out.println("Options: ");
		System.out.println("-------------------------------------");
		System.out.println("1. Filter media in cart");
		System.out.println("2. Sort media in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Place order");
		System.out.println("0. Back");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
<<<<<<< HEAD

		int choice12 = obj.nextInt();
=======
		
		Scanner myObj12 = new Scanner(System.in);
		int choice12 = myObj12.nextInt();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
//		cartMenu
		switch(choice12) {
		default:
			System.out.println("invalid input");
			System.exit(0);
			break;
		case 1:
			System.out.println("1. Filter by id");
			System.out.println("2. filter by title");
<<<<<<< HEAD
		
			int choice13 = obj.nextInt();
=======
			Scanner myObj13 = new Scanner(System.in);
			int choice13 = myObj13.nextInt();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
			switch (choice13) {
			default:
				System.out.println("invalid input");
				System.exit(0);
			case 1:
				System.out.println("enter the id you want to filter");
<<<<<<< HEAD
			
				int choice14 = obj.nextInt();
=======
				Scanner myObj14 = new Scanner(System.in);
				int choice14 = myObj14.nextInt();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
				cart.searchById(choice14);
				break;
			case 2:
				System.out.println("enter the title you want to filter");
<<<<<<< HEAD
				String choice15 = obj1.nextLine();
=======
				Scanner myObj15 = new Scanner(System.in);
				String choice15 = myObj15.nextLine();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
				cart.searchByTitle(choice15);
				break;
			}
			break;
		case 2:
			System.out.println("1. sort by title");
			System.out.println("2. sort by cost");
<<<<<<< HEAD
	
			int choice16 = obj.nextInt();
=======
			Scanner myObj16 = new Scanner(System.in);
			int choice16 = myObj16.nextInt();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
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
<<<<<<< HEAD
		
			String choice17 = obj1.nextLine();
=======
			Scanner myObj17 = new Scanner(System.in);
			String choice17 = myObj17.nextLine();
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
			cart.removeMedia(choice17);
			break;
		case 4:
			Media item = cart.getLuckyItem();
			System.out.print("this item is free: ");
			System.out.println(item);
			cart.removeMedia(item);
			System.out.println(cart.totalCost());
			System.out.println("an order is created");
			cart.empty();
			break;
		case 0:
			Aims.showMenu();
			break;
			
		
		
	}
	Aims.showMenu();
}}