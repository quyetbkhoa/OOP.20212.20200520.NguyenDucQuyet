package hust.soict.dsai.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

<<<<<<< HEAD
import javax.naming.LimitExceededException;
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.book.Book;
import hust.soict.dsai.aims.cd.CompactDisc;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreManagerScreen extends JFrame{
	private Store store;
	public JPanel createNorth() {
		JPanel north= new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar()); 
		north.add(createHeader());
		return north;
	}
	JMenuBar createMenuBar() {
		JMenu menu= new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem a =new JMenuItem("Add book");
		smUpdateStore.add(a);
		
		JMenuItem b =new JMenuItem("Add CD");
		smUpdateStore.add(b);
		
		JMenuItem c =new JMenuItem("Add DVD");
		smUpdateStore.add(c);
		c.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//			    if(e.getActionCommand().equals("Add book")) {
			    	new AddDigitalVideoDiscToStoreScreen(store);
					dispose();
//			    } 
			  }
		}
				);
		b.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			    	new AddCompactDiscToStoreScreen(store);
			    	dispose();
//			    } 
			  }
		}
				);
		a.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			    	new AddBookToStoreScreen(store);
					dispose();
//			    } 
			  }
		}
				);
		menu.add(smUpdateStore);
		
		JMenuItem viewStore =new JMenuItem("View Store");
		menu.add(viewStore);
//		JMenuItem logOut =new JMenuItem("Log out");
//		menu.add(logOut);
		
		viewStore.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new StoreManagerScreen(store);
				dispose(); 
			}
		}
		);
//		logOut.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				new LoginScreen(store);
//				dispose(); 
//			}
//		}
//		);
		JMenuBar menuBar= new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu); 
		
		return menuBar;
		
	}

	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN,50)); 
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title); 
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10,10)));
		return header;	
	}
	JPanel createCenter() {
		JPanel center= new JPanel();
		center.setLayout(new GridLayout(3,3,2,2));
		ArrayList<Media> mediaInStore= store.getItemsInStore(); 
		
		for(int i=0; i<mediaInStore.size(); i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		return center;
	}
	public StoreManagerScreen(Store store) {
		this.store= store;
		Container cp= getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setTitle("Store1");
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Khanh");
		authors.add("kHanh2");
		Book book =new Book("Aladin", "Animation", 18.99f, authors);
		CompactDisc cd1 = new CompactDisc("weq","fds","qw", "eweq", 23);
		CompactDisc cd2 = new CompactDisc("q","fds","qwqw", "eqeq", 233);
		
		Store store = new Store();
<<<<<<< HEAD
		try {
			store.addMedia(cd1,cd2,book,disc1,disc2);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
=======
		store.addMedia(cd1,cd2,book,disc1,disc2);
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		new StoreManagerScreen(store);
	}

}
