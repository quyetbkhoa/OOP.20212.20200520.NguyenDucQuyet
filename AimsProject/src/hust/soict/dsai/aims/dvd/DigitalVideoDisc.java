package hust.soict.dsai.aims.dvd;
import hust.soict.dsai.aims.disc.Disc;
<<<<<<< HEAD
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.playable.Playable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
=======
import hust.soict.dsai.aims.playable.Playable;
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
public class DigitalVideoDisc extends Disc implements Playable{
		public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director);
		this.length = length;

	}
<<<<<<< HEAD
		public void play() throws PlayerException {
		 if (this.getLength()>0) {
				
			System.out.println("Playing DVD: "+ this.getTitle()+ " with length: "+ this.getLength());
		}
			else {
			  
				throw new PlayerException("ERROR: : DVD length is non-positive!");
				
			}
		          
			
=======
		public void play() {
			if (this.getLength()>0) {
			System.out.println("Playing DVD: "+ this.getTitle()+ " with length: "+ this.getLength());
		}
			else {
				System.out.println("DVD can not be played");
			}
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		}
		private String director;
		private int length;
		public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);

		
		
	}
		public DigitalVideoDisc(String title) {
		super(title);
		

	}
		public DigitalVideoDisc() {
		super();		
	}
		
		public String getDirector() {
			return director;
		}
		public int getLength() {
			return length;
		}
		@Override
		public String toString() {
			return "DVD - " + getTitle() + " -  "+ getCategory() + " - " + this.director
					+ " - " + this.length + " :  "+ getCost()+ "$";
		}
		
}
