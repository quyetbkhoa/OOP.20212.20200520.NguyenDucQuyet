package hust.soict.dsai.aims.dvd;
import hust.soict.dsai.aims.disc.Disc;
import hust.soict.dsai.aims.playable.Playable;
public class DigitalVideoDisc extends Disc implements Playable{
		public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director);
		this.length = length;

	}
		public void play() {
			if (this.getLength()>0) {
			System.out.println("Playing DVD: "+ this.getTitle()+ " with length: "+ this.getLength());
		}
			else {
				System.out.println("DVD can not be played");
			}
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
