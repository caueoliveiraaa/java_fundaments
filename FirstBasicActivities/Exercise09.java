package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise09 {

    // Iniciate the system
    public static void main(String[] args){
        
        // Ask for two values, if they are equal do a sum, otherwise do a multiplication, return the outcome

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the first number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the second number: "));

        if (n1 == n2) {
            System.out.println("The sum of the two numbers is: "+(n1+n2));
        } else {
            System.out.println("The outcome of the multiplication between the two numbers is: "+(n1*n2));
        }
    }
}