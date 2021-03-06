package hust.soict.dsai.aims.screen.manager;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.playable.Playable;

public class MediaStore extends JPanel{
	private Media media;
	private Cart cart;
	public MediaStore(Media media) {
		this.media = media;
//		this.cart = cart;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
		title.setAlignmentX(CENTER_ALIGNMENT) ;

		JLabel cost = new JLabel(""+media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT) ;

		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER) );

		if(media instanceof Playable) {
		JButton playButton = new JButton("Play");
			container.add(playButton) ;
			playButton.addActionListener(new ActionListener() { 
				  @Override
				  public void actionPerformed(ActionEvent e) { 
					  JDialog d = new JDialog();
					  
			            // create a label
					  JLabel l = new JLabel("Playing the media name: " + media.getTitle());
					  l.setHorizontalAlignment(JLabel.CENTER);
					  l.setVerticalAlignment(JLabel.CENTER);
					  d.add(l);
			 
			            // setsize of dialog
			  		  d.setSize(400, 200);
			 
			            // set visibility of dialog
		              d.setVisible(true);
					  } 
					} );
			}

			this.add(Box.createVerticalGlue());
			this.add(title);

			this.add(cost);

			this.add(Box.createVerticalGlue());
			this.add(container);

			this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
