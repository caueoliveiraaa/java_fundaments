package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise09 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 9:
        // Peça dois valores, se forem iguais realize a soma, caso contrário a multiplicação, retorne o resultado.

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the first number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the second number: "));

        if (n1 == n2) {
            System.out.println("The sum of the two numbers is: "+(n1+n2));
        } else {
            System.out.println("The outcome of the multiplication between the two numbers is: "+(n1*n2));
        }
        
        }
    }