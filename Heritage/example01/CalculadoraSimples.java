package Heritage.example01;

import javax.swing.JOptionPane;

public class CalculadoraSimples extends CalculadoraCientifica {
    // Addition
    public void addition(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the first number? "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the second number? "));
        JOptionPane.showMessageDialog(null, "The outcome of the addition is " + (n1+n2));
    }

    // Subtraction
    public void subtraction(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the first number? "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the second number? "));
        JOptionPane.showMessageDialog(null, "The outcome of the subtraction is " + (n1-n2));
    }

    // Multiplication
    public void multiplication(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the first number? "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the second number? "));
        JOptionPane.showMessageDialog(null, "The outcome of the multiplication is " + (n1*n2));
    }

    // Division:
    public void division(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the first number? "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the second number? "));
        JOptionPane.showMessageDialog(null, "The outcome of the division is " + (n1/n2));
    }
}
