package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise08 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 8:
        // Informe três números, retorne o menor informado.

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the first number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the second number: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the third number: "));

        if (n1 <= n2 && n1 <= n3 ){
            System.out.println("The smallest number is "+n1);
        } else if (n2 <= n3 && n2 <= n1) {
            System.out.println("The smallest number is "+n2);
        } else if (n3 <= n1 && n3 <= n2) {
            System.out.println("The smallest number is "+n3);
        }




        }
    }