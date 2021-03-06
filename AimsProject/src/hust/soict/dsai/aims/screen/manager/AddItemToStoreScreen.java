package hust.soict.dsai.aims.screen.manager;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import hust.soict.dsai.aims.store.Store;

public class AddItemToStoreScreen extends JFrame {
	
	protected Container cp= getContentPane();
	public void cancelButton(Store store) {
		JButton button = new JButton("Cancel");
		cp.add(button);
		button.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    new StoreManagerScreen(store);
			    dispose();
				}		
			});
	
		}
}


