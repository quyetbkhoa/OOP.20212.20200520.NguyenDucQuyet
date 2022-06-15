package hust.soict.dsai.aims.disc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		dvdWrapper d1= new dvdWrapper(jungleDVD);
		dvdWrapper d2= new dvdWrapper(cinderellaDVD);
		swap1(d1,d2);
		
		System.out.println("jungle dvd title: " +d1.d.getTitle());
		System.out.println("cinderella dvd title: " + d2.d.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		}
	
	public static void swap(Object o1 , Object o2) {
        Object tmp = o1;
		o1= o2;
		o2 = tmp;
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title ) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	public static void swap1(dvdWrapper d1, dvdWrapper d2) {
		DigitalVideoDisc tmp = d1.d;
		d1.d=d2.d;
		d2.d=tmp;
	}
	

}
class dvdWrapper {
    DigitalVideoDisc d;
    dvdWrapper( DigitalVideoDisc d) { this.d =d;}    
}