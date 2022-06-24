package hust.soict.dsai.aims.screen.manager;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.dvd.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
	private String title;
	private String category;
	private float cost;
	private Store store ;
	private int length;
	private String director;
	JTextField tfInput;
	JTextField tfInput1;
	JTextField tfInput2;
	JTextField tfInput3;
	JTextField tfInput4;
	JTextField tfInput5;
	private Container cp= getContentPane();
	public AddDigitalVideoDiscToStoreScreen(Store store) {
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
		
		cp.add(new JLabel("Enter length: "));		
		tfInput3= new JTextField(10);
		cp.add(tfInput3);
		
		cp.add(new JLabel("Enter director: "));		
		tfInput4= new JTextField(10);
		cp.add(tfInput4);

		
		
		
		submitButton();
		cancelButton(store);
		setTitle("media info");
		setSize(600, 400);
		setVisible(true);
		
	}
	public DigitalVideoDisc createDVD() {
		DigitalVideoDisc dvd= new DigitalVideoDisc(title, category,director,length,cost);
		return dvd;
	}
	public void submitButton() {
		JButton button = new JButton("Submit");
		cp.add(button);
		button.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//			    if(e.getActionCommand().equals("Add book")) {
				title= tfInput.getText();
				category = tfInput1.getText();
				cost= Float.parseFloat(tfInput2.getText());	
				length= Integer.parseInt(tfInput3.getText());
				director = tfInput4.getText();
				DigitalVideoDisc dvd = createDVD();
//			    } 
				store.addMedia(dvd);
				new StoreManagerScreen(store);
				}		
			});
	
		}
}
