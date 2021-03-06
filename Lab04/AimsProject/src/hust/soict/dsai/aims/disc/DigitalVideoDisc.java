package hust.soict.dsai.aims.disc;
import java.time.LocalDate;
public class DigitalVideoDisc {
		public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
//		this.dateAdded = dateAdded;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
		private String title;
		private String category;
		private String director;
		private int length;
		private float cost;
		private int id;
		private static int nbDigitalVideoDiscs = 0;
		public void setTitle(String title) {
			this.title = title;
		}
		public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
		public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
		public DigitalVideoDisc() {
		super();
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
		
		public String getTitle() {
			return title;
		}
		public String getCategory() {
			return category;
		}
		public String getDirector() {
			return director;
		}
		public int getLength() {
			return length;
		}
		public float getCost() {
			return cost;
		}
		@Override
		public String toString() {
			return "DVD - " + title + " -  "+ category + " - " + director
					+ " - " + length + " :  "+ cost+ "$";
		}
		public int getId() {
			return id;
		}
		public boolean isMatch(String title) {
			String s1 = this.getTitle();
			String s2= " " +  s1 + " ";
			String title1 = " " + title +" ";
			if (s2.contains(title1)){
				return true;}
			return false;		
		}
}
