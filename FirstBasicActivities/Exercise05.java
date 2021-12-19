package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise05 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 5:
        // Criar um sistema, onde o usuário informa o valor de um produto e a forma de pagamento. 
        // Se o pagamento for superior a R$500,00 e a vista, será dado um desconto de 10%, caso contrário, sem desconto.

        int productValue = Integer.parseInt(JOptionPane.showInputDialog("Type in the value of the product: "));
        int paymentChosen = Integer.parseInt(JOptionPane.showInputDialog("Type in how you shall pay: \n1) - Debit card (all at once) \n2) - Credit card (with installments)"));

        if ( (productValue > 500) && (paymentChosen == 1) ) {
            System.out.println("The value of the product is "+ (productValue * 0.9 ) + " with the discount!");
        }else{
            System.out.println("The value of the product is "+ productValue + " without the discount!");
        }



        }
    }