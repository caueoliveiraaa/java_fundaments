package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise10 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 10:
        // Crie um conversor de moedas. O usuário irá informar o valor, em seguida o tipo de conversão: 
        // real para dólar, real para euro, dólar para real e euro para real.

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

            default: System.out.println("Invalid option. Reboot program." ); break;

        }


        
        }
    }