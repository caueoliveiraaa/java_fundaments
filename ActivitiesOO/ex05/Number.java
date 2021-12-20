package ActivitiesOO.ex05;
import javax.swing.JOptionPane;

public class Number {

    // Atributes
    private int n1, n2, n3;

    // Constructor:
    public Number() {

        obtainNumbers();
        JOptionPane.showMessageDialog(null, message());

    }

    // Method to obtain the 3 numbers:
    private void obtainNumbers() {

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the first number: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the second number: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the third number: "));

    }

    // Method to verify which number is the lowest number:
    private int lowestNumber() {

        int outcome = 0;

        if (n1 <= n2 && n1 <= n3 ){
            System.out.println("The smallest number is "+n1);
            outcome = n1;
        } else if (n2 <= n3 && n2 <= n1) {
            System.out.println("The smallest number is "+n2);
            outcome = n2;
        } else if (n3 <= n1 && n3 <= n2) {
            System.out.println("The smallest number is "+n3);
            outcome = n3;
        }

        return outcome;

    }

    private String message(){

        String text = "The lowest number is " + lowestNumber();
        return text;

    }

}
