package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise10 {

    // Iniciar o sistema
    public static void main(String[] args){

        // Create a currency converter
        // The user informs the value, then the type of conversion 
        // reais to dollars, reais to pounds, 
        // dollars to reias and pounds to reais

        int money = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the amount of money that is going to be converted: "));

        String option = "Please, now choose the type of conversion: ";
               option += "\n1)Real to Dollar";
               option += "\n2)Real to Euro";
               option += "\n3)Dollar to Real";
               option += "\n4)Euro to Real";
  
        String optionSelected = JOptionPane.showInputDialog(null, option);

        switch (optionSelected) {
            case "1": System.out.println("The conversion selected is: " + (money / 5.5)); break;

            case "2": System.out.println("The conversion selected is: " + (money / 6.5)); break;

            case "3": System.out.println("The conversion selected is: " + (money / 5.5)); break;

            case "4": System.out.println("The conversion selected is: " + (money * 6.5)); break;

            default: System.out.println("Invalid option. Restart the program." ); break;

        }    
    }
}