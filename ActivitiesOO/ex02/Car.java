package ActivitiesOO.ex02;
import javax.swing.JOptionPane;

@SuppressWarnings("all")
public class Car {

    // Atributes
    private String model;
    private double value;

    // Constructor
    public Car() {

        obtainData();
        JOptionPane.showMessageDialog(null, message());

    }

    // Mtethods
    // Obtain information
    private void obtainData (){

        model = JOptionPane.showInputDialog(null, "Inform the model: ");
        value = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the value: "));

    }

    // Calculation
    private double calculate(){

        double total;

        if (value <= 10000){
            total = value * 0.10;
        }else if(value > 10000 && value < 20000) {
            total = value * 0.15;
        }else{
            total = value * 0.20;
        }
        return total;

    }

    // Calculate the tax value
    private double tax(){

        double total;

        if (value <= 10000){
            total = value - (value * 0.10);
        }else if(value > 10000 && value < 20000) {
            total = value - (value * 0.15);
        }else{
            total = value - (value * 0.20);
        }
        return total;

    }

    // Return the final message
    private String message(){

        String text = "The car whose model is "+model+" will cost R$"+tax()+" with "+calculate()+" of taxes with it.";
        return text;

    }

}