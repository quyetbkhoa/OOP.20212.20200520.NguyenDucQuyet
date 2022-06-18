import java.util.*;
import java.io.*;
public class DayOfMonth {
	public static void main(String args[]) {
	ArrayList<String> arr1 = new ArrayList<String>(3);
	ArrayList<String> arr2 = new ArrayList<String>(3);
	ArrayList<String> arr3 = new ArrayList<String>(3);
	ArrayList<String> arr4 = new ArrayList<String>(3);
	ArrayList<String> arr5 = new ArrayList<String>(3);
	ArrayList<String> arr6 = new ArrayList<String>(3);
	ArrayList<String> arr7 = new ArrayList<String>(3);
	ArrayList<String> arr8 = new ArrayList<String>(3);
	ArrayList<String> arr9 = new ArrayList<String>(3);
	ArrayList<String> arr10 = new ArrayList<String>(3);
	ArrayList<String> arr11 = new ArrayList<String>(3);
	ArrayList<String> arr12 = new ArrayList<String>(3);
	arr1.add("January");
	arr1.add("Jan");
	arr1.add("Jan.");
	arr1.add("1");
	arr2.add("February");
	arr2.add("Feb");
	arr2.add("Feb.");
	arr2.add("2");
	arr3.add("March");
	arr3.add("Mar");
	arr3.add("Mar.");
	arr3.add("3");
	arr4.add("April");
	arr4.add("Apr");
	arr4.add("Apr.");
	arr4.add("4");
	arr5.add("May");
	arr5.add("5");
	arr6.add("June");
	arr6.add("Jun.");
	arr6.add("6");
	arr7.add("July");
	arr7.add("Jul.");
	arr7.add("7");
	arr8.add("August");
	arr8.add("Aug");
	arr8.add("Aug.");
	arr8.add("8");
	arr9.add("September");
	arr9.add("Sept.");
	arr9.add("Sep");
	arr9.add("9");
	arr10.add("Oct.");
	arr10.add("Oct");
	arr10.add("October");
	arr10.add("10");
	arr11.add("November");
	arr11.add("Nov.");
	arr11.add("Nov");
	arr11.add("11");
	arr12.add("December");
	arr12.add("Dec.");
	arr12.add("Dec.");
	arr12.add("12");
	HashMap <String, String> my = new HashMap<>();
	my.put("1","31");
	my.put("2","28");
	my.put("3","31");
	my.put("4","30");	
	my.put("5","31");
	my.put("6","30");
	my.put("7","31");
	my.put("8","31");
	my.put("9","30");
	my.put("10","31");
	my.put("11","30");
	my.put("12","31");
	Scanner scan = new Scanner(System.in);
	String month = scan.nextLine();
	Scanner scan1 = new Scanner(System.in);
	int year = scan1.nextInt();
	String month1="";
	if (arr1.contains(month) ) { month1="1";}
	else if (arr2.contains(month)) { month1="2";}
	else if (arr3.contains(month)) { month1="3";}
	else if (arr4.contains(month)) { month1="4";}
	else if (arr5.contains(month)) { month1="5";}
	else if (arr6.contains(month)) { month1="6";}
	else if (arr7.contains(month)) {month1="7";}
	else if ( arr8.contains(month)) { month1="8";}
	else if (arr9.contains(month)) { month1="9";}
	else if ( arr10.contains(month)) { month1="10";}
	else if (arr11.contains(month)) { month1="11";}
	else if (arr12.contains(month)) { month1="12";}
	if ((year%4==0 && year%100!=0) || year%400==0 ) {
		if (month1=="2") {
			System.out.print("29");}
		else { 
			String res = my.get("4");
			System.out.print(res);}
		}
	else {
		String res1= my.get(month1);
		System.out.print(res1);}
	
}}
