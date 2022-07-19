package hust.soict.dsai.aims.disc;

<<<<<<< HEAD
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;

public class Disc extends Media{
	public void play() throws PlayerException {
=======
import hust.soict.dsai.aims.media.Media;

public class Disc extends Media{
	public void play() {
>>>>>>> 80e636db6e68b7f6649a34cbda3995e477f28d7b
		
	}

	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	public Disc(String title) {
		super(title);
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public Disc(int length, String director, String title, String category, float cost) {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	private int length;
	private String director;
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
	
}
