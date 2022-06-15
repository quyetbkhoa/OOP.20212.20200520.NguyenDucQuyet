package hust.soict.dsai.aims.utils;
import java.util.*;
import java.util.Collections;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.lang.Float;
public class DVDUtils {
	public static String compareByCost(DigitalVideoDisc dvd1 , DigitalVideoDisc dvd2 ) {
		if (dvd1.getCost() > dvd2.getCost()){
			return ("The first dvd has higher cost");
		}
		else if ( dvd1.getCost() < dvd2.getCost()) {
			return ("The second dvd has higher cost");
		}
		else {
			return ("Two dvd have the same cost");
		}
	}
	public static String compareByTitle(DigitalVideoDisc dvd1 , DigitalVideoDisc dvd2 ) {
		if (dvd1.getTitle().equals(dvd2.getTitle())){
			return ("Same title");
		}
		else {
			return ("different title");
             }
		
     }
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] dvd) {
		List< DigitalVideoDisc>	lst= Arrays.asList(dvd);							
		Collections.sort( lst, ((a,b) -> 
		Float.compare(a.getCost(), b.getCost())));
		DigitalVideoDisc[] res = lst.toArray(new DigitalVideoDisc[dvd.length]);
		return res;
		
	}
	public  static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] dvd) {
		List< DigitalVideoDisc>	lst= Arrays.asList(dvd);							
		Collections.sort( lst, ((a,b) -> 
	     (a.getTitle().compareTo(b.getTitle()))));
		DigitalVideoDisc[] res = lst.toArray(new DigitalVideoDisc[dvd.length]);
		return res;
	
}}
	
	
	