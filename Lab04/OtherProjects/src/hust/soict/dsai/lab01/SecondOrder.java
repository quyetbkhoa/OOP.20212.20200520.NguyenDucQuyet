package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class SecondOrder {

    public static void main(String[] args) {
        String a, b, c;
        a = JOptionPane.showInputDialog(null, " Please input the a number: ", " Input",
                JOptionPane.INFORMATION_MESSAGE);

        b = JOptionPane.showInputDialog(null, " Please input the b number: ", " Input",
                JOptionPane.INFORMATION_MESSAGE);
        c = JOptionPane.showInputDialog(null, " Please input the c number: ", " Input",
                JOptionPane.INFORMATION_MESSAGE);
        double A = Double.parseDouble(a);
        double B = Double.parseDouble(b);
        double C = Double.parseDouble(c);
        String ans;
        if (A == 0) {
            if (B == 0) {
                ans = "no solution";
            } else {
                double res = -C / B;
                ans = Double.toString(res);
            }
        }
        else{
            double x1, x2;
            double delta = B*B - 4*A*C;
            if (delta > 0) {
                x1 = (float) ((-B + Math.sqrt(delta)) / (2*A));
                x2 = (float) ((-B - Math.sqrt(delta)) / (2*A));
                ans = "x1: " + x1 + "\n x2: " + x2;
            }
            else if (delta == 0) {
                x1 = (-B / (2 * A));
                x2 = x1;
                ans = "x: " + x1 ;
            }
            else
                ans = "no solution";
        }
        JOptionPane.showMessageDialog(null, ans, " result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
