package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class calculator {
	public static void main(String[] args){
		String strNum1, strNum2;
		String strNotification = " You've just entered: ";

		strNum1=JOptionPane.showInputDialog(null, " Please input the first number: ", " Input the first number",
							     JOptionPane.INFORMATION_MESSAGE);

		strNum2=JOptionPane.showInputDialog( null, " Please input the second number: ", " Input the second number",
							     JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double sum = num1+num2;
		double difference = num1-num2;
		double product = num1*num2;
		
		String sum1,difference1, product1, quotient1;
		sum1 = Double.toString(sum); 
		difference1= Double.toString( difference);
		product1= Double.toString(product);
		if ( num2==0){
			quotient1=" cannot calculate cuz divisor equal to zero";
			}
		else{
			double quotient= num1/num2;
			quotient1=Double.toString(quotient);}
		String ans= "Sum: " + sum1 + "\n" + "Difference: " + difference1 + "\n" + "Product: " + product1+ "\n"+ "quotient: " + quotient1; 
		JOptionPane.showMessageDialog(null, ans, " result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
