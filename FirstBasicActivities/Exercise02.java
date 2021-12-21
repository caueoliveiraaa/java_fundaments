package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise02 {

    // Iniciate the system
    public static void main(String[] args){
        
        // An integer will be asked, return whether it is positive or negative
        // Also if it is odd or even
              
        int intNum = Integer.parseInt(JOptionPane.showInputDialog("Inform a number: "));
        
        if (intNum >= 0 && (intNum % 2 == 0)) {
            System.out.println("This number is POSITIVE and EVEN!");
        }else if (intNum >= 0 && (intNum % 2 != 0)) {
            System.out.println("This number is POSITIVE and ODD!");
        }else if (intNum <= 0 && (intNum % 2 == 0)) {
            System.out.println("This number is NEGATIVE and EVEN!");
        }else if (intNum <= 0 && (intNum %2 != 0)) {
            System.out.println("This number is NEGATIVE and ODD!");
        }

    }

}