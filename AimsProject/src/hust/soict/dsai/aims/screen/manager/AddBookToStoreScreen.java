package hust.soict.dsai.aims.screen.manager;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
import javax.naming.LimitExceededException;
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.book.Book;
import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
	private String title;
	private String category;
	private float cost;
	private Store store ;
	private int length;
	private String author;
	JTextField tfInput;
	JTextField tfInput1;
	JTextField tfInput2;
	JTextField tfInput3;
	JTextField tfInput4;
	JTextField tfInput5;
	private List<String> authors;
	public AddBookToStoreScreen(Store store) {
		this.store = store;
		cp.setLayout(new GridLayout(6,2));
		
		cp.add(new JLabel("Enter Title: "));		
		tfInput= new JTextField(10);
		cp.add(tfInput);
		
		cp.add(new JLabel("Enter category : "));		
		tfInput1= new JTextField(10);
		cp.add(tfInput1);
		
		cp.add(new JLabel("Enter cost : "));		
		tfInput2= new JTextField(10);
		cp.add(tfInput2);
		
		cp.add(new JLabel("Enter authors name(split by comma): "));		
		tfInput3= new JTextField(10);
		cp.add(tfInput3);
		
		cp.add(new JLabel("Enter length: "));		
		tfInput4= new JTextField(10);
		cp.add(tfInput4);

		
		
		
		submitButton();
		
		cancelButton(store);
		setTitle("media info");
		setSize(600, 400);
		setVisible(true);
		
	}
	public Book createBook() {
		Book book= new Book(title, category,cost, authors,length);
		return book;
	}
	public void submitButton() {
		JButton button = new JButton("Add to store");
		cp.add(button);
		button.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//			    if(e.getActionCommand().equals("Add book")) {
				title= tfInput.getText();
				category = tfInput1.getText();
				cost= Float.parseFloat(tfInput2.getText());	
				author = tfInput3.getText();
				String[] tmp = author.split(",");
				authors = Arrays.asList(tmp);
				length= Integer.parseInt(tfInput4.getText());
				
				Book book = createBook();
//			    } 
<<<<<<< HEAD
				try {
					store.addMedia(book);
				} catch (LimitExceededException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
=======
				store.addMedia(book);
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
				new StoreManagerScreen(store);
				}		
			});
	
		}
}
