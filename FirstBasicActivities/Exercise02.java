package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise02 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 2:
        // And integer will be asked, return whether it is positive or negative, also if it is odd or even:
              
        int intNum = Integer.parseInt(JOptionPane.showInputDialog("Type in a whole number: "));
        
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