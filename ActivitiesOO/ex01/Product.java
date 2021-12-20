package ActivitiesOO.ex01;
import javax.swing.JOptionPane;

public class Product {

    // Atributes
    private String name;
    private double value;
    private int purchaseType;

    
    // Constructor
    public Product() {

        obtainData();
        JOptionPane.showMessageDialog(null, message());

    }

    // Methods:

    // Obtain information
    private void obtainData (){

        name = JOptionPane.showInputDialog(null, "Inform the product: ");
        purchaseType = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, choose purchase type: \n1) Type 1 for Cash\n2) Type 2 for Credit Card"));
        value = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the value of the purchase: "));

    }

    // Calculation
    private double calculation(){

        double total;
        if (value >= 500 && purchaseType == 1){
            total = value * 0.9;
        }else{
            total = value;
        }
        return total;
    }

    private String message(){

        String texto = "The product "+name+" will cost R$"+calculation()+" reais.";
        return texto;

    }
}
