import javax.swing.JOptionPane;
public class systemequations {
	public static void main(String[] args){
		String stra11, stra12, stra21, stra22, strb1, strb2;
		stra11=JOptionPane.showInputDialog(null, " Please input the a11 number: ", " Input",
							     JOptionPane.INFORMATION_MESSAGE);

		stra12=JOptionPane.showInputDialog( null, " Please input the a12 number: ", " Input",
							     JOptionPane.INFORMATION_MESSAGE);
		strb1=JOptionPane.showInputDialog( null, " Please input the b1 number: ", " Input",
							     JOptionPane.INFORMATION_MESSAGE);
		stra21=JOptionPane.showInputDialog( null, " Please input the a21 number: ", " Input",
							     JOptionPane.INFORMATION_MESSAGE);
		stra22=JOptionPane.showInputDialog( null, " Please input the a22 number: ", " Input",
							     JOptionPane.INFORMATION_MESSAGE);
		strb2=JOptionPane.showInputDialog( null, " Please input the b2 number: ", " Input",
							     JOptionPane.INFORMATION_MESSAGE);
		double a11 = Double.parseDouble(stra11);
		double a12 = Double.parseDouble(stra12);
		double a21 = Double.parseDouble(stra21);
		double a22 = Double.parseDouble(stra22);
		double b1= Double.parseDouble(strb1);
		double b2= Double.parseDouble(strb2);
		double D = a11*a22-a12*a21;
		double D1= b1*a22- a12*b2;
		double D2= a11*b2 - b1*a21;
		String ans;
		if (D==0 && ((b1/b2)==(a11/a21 ))){
			ans= "infinite solutions";}
		else if (D==0 && ((b1/b2)!=(a11/a21 ))) {
			ans= "No solution";}
		else{   
			double x1= D1/D;
			double x2=D2/D;
			String strx1=Double.toString(x1);
			String strx2=Double.toString(x2);
			ans= "x1: " + strx1 + "\nx2: " + strx2;}
		JOptionPane.showMessageDialog(null, ans, " result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
