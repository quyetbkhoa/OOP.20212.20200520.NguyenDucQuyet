package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class FirstDegreeEquation {
	public static void main(String[] args){
		String stra, strb;
		stra=JOptionPane.showInputDialog(null, " Please input the first number: ", " Input the first number",
							     JOptionPane.INFORMATION_MESSAGE);

		strb=JOptionPane.showInputDialog( null, " Please input the second number: ", " Input the second number",
							     JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(stra);
		double b = Double.parseDouble(strb);
		String ans;
		if(a == 0){
                    if(b == 0)
                        ans = "vo so nghiem";
                    else
                        ans = "vo nghiem";
                }
                else{
                    double res = -b / a;
                    ans = Double.toString(res);
                }
		
		JOptionPane.showMessageDialog(null, ans, " result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
