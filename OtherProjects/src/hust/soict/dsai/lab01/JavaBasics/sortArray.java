package hust.soict.dsai.lab01.JavaBasics;
import java.util.*;  
public class sortArray {
	public static void main(String args[]) {
		int n;
		Scanner sc= new Scanner( System.in);
		System.out.println("number of elements: ");
		n=sc.nextInt();
		int[] array = new int[n];
		System.out.println(" enter element: ");
		for ( int i=0; i<n; i++) {
			array[i]= sc.nextInt();
		}
		System.out.println("sorted array");
		Arrays.sort(array);
		int sum=0;
		for (int i = 0; i < array.length; i++)   
		{       sum+=array[i];
		System.out.println(array[i]); }
		System.out.println("Sum :" + sum);
		double sum1=sum;
		double average=sum1/n;
		System.out.println("average : " + average);
		}
	}


