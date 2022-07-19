package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.Comparator;

import hust.soict.dsai.aims.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.MediaComparatorByTitleCost;


public abstract class Media implements Comparable<Media> {

	public Media(String title) {
		nbMedia ++;
		this.id = nbMedia;
		this.title = title;
	}
	public Media(String title, String category) {
		nbMedia ++;
		this.id = nbMedia;;
		this.title = title;
		this.category = category;
	}
	public Media(String title, String category, float cost) {
		
		super();
		nbMedia ++;
		this.id = nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
			new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
			new MediaComparatorByCostTitle();
	
	public int compareTo(Media other) {
		int cmp = this.getTitle().compareTo(other.getTitle());
		if (cmp!=0)
			return cmp;
		cmp = this.getCategory().compareTo(other.getCategory());
		return cmp;
	}
	@Override
	public boolean equals(Object media1) {
		try{
			if (media1 instanceof Media ){
		}
			Media media2 = (Media) media1;
		if(this.getTitle() == media2.getTitle() && this.getCost()==media2.getCost()) {
			return true;
		}
		}
		catch(Exception e){
			System.out.println("Caught exception: " + e.getMessage());
			
		}
		return false;
	}
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia = 0;
	private LocalDate dateAdded;
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
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public static int getNbMedia() {
		return nbMedia;
	}
	public static void setNbMedia(int nbMedia) {
		Media.nbMedia = nbMedia;
	}
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}
}
