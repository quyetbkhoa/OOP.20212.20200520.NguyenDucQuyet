package hust.soict.dsai.aims.cd;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.Disc;
import hust.soict.dsai.aims.playable.Playable;
import hust.soict.dsai.aims.track.Track;

public class CompactDisc extends Disc implements Playable{
	public CompactDisc(String title, String category, String artist, String director, float cost) {
		super(title, category, cost, director);
		this.artist = artist;

	}

	public void play() {
	
		System.out.println("Playing CD: "+ this.getTitle());
		System.out.println("CD length: " + this.getLength());
	
		for(Track x: this.tracks) {
			x.play();
		}
	}
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	private int id = super.getId();
	private String artist; 
	private String director;
	private int length = getLength();
	public static final int max_track = 10; 
	private List  <Track> tracks = new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track ... track) {
		int count =0;
		for (int i = 0; i < track.length; i++) {
		if ( this.tracks.size()< CompactDisc.max_track) {
		boolean a = true ;
			for (Track x: this.tracks) {
				if (x==track[i]){ a = false; }
			}
			if (a) { 
			this.tracks.add(track[i]);	
			count+=1;}
			else{
				System.out.print(track[i].getTitle());
				System.out.println("  is already added"); 
        }}
		
		}
	System.out.println(count+ " disc has been added to the cart");
	}
	public void removeTrack(String title) {
		if (this.tracks.size() == 0) {
			System.out.print("CD is empty");
			return ;
		}
		List<Track> toRemove = new ArrayList<Track>();
		for (Track x : this.tracks) {
		    if (x.getTitle().equals(title)) {
		        toRemove.add(x);
		    }
		}
		this.tracks.removeAll(toRemove);
		System.out.print("all media with title :"+ title + " have been remove");
		}
	public void removeMedia( Track track) {
		for (Track x: this.tracks) {
			if (x==track) {
				System.out.println("a media has been removed");
				this.tracks.remove(x);
				return;
			}
		}
	}
	public int getLength() {
		int total_length= 0;
		if (this.tracks== null) {}
		else {
		for (Track x:  this.tracks) {
			total_length+=x.getLength();}
		}
		return total_length;
	}
	@Override
	public String toString() {
		return "CompactDisc:  title=" + getTitle() + ", category=" + getCategory() + ", artist=" + artist
				+ ", director=" + director  +  "length = " + length+", cost=" + getCost() + "Tracks:" + tracks;
	}
}	
	
