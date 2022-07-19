package hust.soict.dsai.aims.track;

<<<<<<< HEAD
import hust.soict.dsai.aims.exception.PlayerException;
=======
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
import hust.soict.dsai.aims.playable.Playable;

public class Track implements Playable{

	public Track() {
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD
	public void play() throws PlayerException{
		if (this.getLength()>0 ) {
		System.out.println("Playing Track: "+ this.getTitle()+ " with length:" + this.getLength());
		}
		else {
			throw new PlayerException("ERROR: : track length is non-positive!");
		}
=======
	public void play() {
		if (this.getLength()>0 )
		System.out.println("Playing Track: "+ this.getTitle()+ " with length:" + this.getLength());
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
	}
	@Override
	public boolean equals(Object track1) {
		if (track1 instanceof Track) {
			Track track2= (Track) track1;
			if ( track2.getTitle().equals(this.getTitle()) &&  this.getLength()== track2.getLength()) {
				return true;
			}
			 
		}
		return false;
		
	}
	private String title;
	private int length;
	private String category;
	private float Cost;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return Cost;
	}
	@Override
	public String toString() {
		return "Track [title=" + title + ", length=" + length + "]";
	}
	
}
