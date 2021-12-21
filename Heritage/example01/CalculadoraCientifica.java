package Heritage.example01;
import javax.swing.JOptionPane;

public class CalculadoraCientifica {
    
    // Sine
    public void sine(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in a number? "));
        JOptionPane.showMessageDialog(null, "The sine is :" + Math.sin(n1));
    }

    // Tangent
    public void tangent(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in a number? "));
        JOptionPane.showMessageDialog(null, "The tangent is :" + Math.tan(n1));
    }
















}
