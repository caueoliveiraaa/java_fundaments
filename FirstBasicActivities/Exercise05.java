package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise05 {

    // Iniciate the system
    public static void main(String[] args){
        

        // Develop a system, where the user informs the value of a product and they way they'll pay 
        // If the value is greater than R$500,00 and the option Cash gets chosen, 
        // there will be a discount of 10%, otherwise, no discount

        int productValue = Integer.parseInt(JOptionPane.showInputDialog("Type in the value of the product: "));
        int paymentChosen = Integer.parseInt(JOptionPane.showInputDialog("Type in how you shall pay: \n1) - Cash n2) - Credit card"));

        if ( (productValue > 500) && (paymentChosen == 1) ) {

            System.out.println("The value of the product is "+ (productValue * 0.9 ) + " with the discount!");

        }else{

            System.out.println("The value of the product is "+ productValue + " without the discount!");

        }

    }

}