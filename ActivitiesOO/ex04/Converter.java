package ActivitiesOO.ex04;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Converter {

    // Atributes:
    double value;
    int typeConversion;
    String menu = "Choose the type of conversion\n1) From Reais to Dollars.\n2) From Dollars to Reais.\n3) From Reais to Pounds.\n4) From Pounds to Reais.\n5) Exit program.";


    // constructor:
    public Converter() {
        getData();
        
    }

    //Methods:

    // Method to obtain data:
    private void getData() {
        value = Double.parseDouble(JOptionPane.showInputDialog(null, "Type in the amount of money you wish to convert: "));
        typeConversion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        chooseConversion();
    }

    // Method to choose the conversion:
    private void chooseConversion() {

        DecimalFormat df = new DecimalFormat("#.##");

        switch (typeConversion){
            case 1: 
            JOptionPane.showMessageDialog(null, df.format(convertFromRealToDollar())); 
            break;
            case 2: 
            JOptionPane.showMessageDialog(null, df.format(convertFromDollarToReal()));
            break;
            case 3: 
            JOptionPane.showMessageDialog(null, df.format(convertFromRealToPound()));
             break;
            case 4: JOptionPane.showMessageDialog(null, df.format(convertFromPoundToReal()));
            break;
            case 5: break;
            default:
        }
    }  

    // Method to convert Reais to Dollars:
    private double convertFromRealToDollar(){
        double conversion = value / 5;
        return conversion;
    }

    // Method to convert Dollars to Reais:
    private double convertFromDollarToReal(){
        double conversion = value * 5;
        return conversion;
    }

    // Method to convert Reais to Pounds:
    private double convertFromRealToPound(){
        double conversion = value / 6;
        return conversion;
    }
    // Method  to convert Pounds to Reais:
    private double convertFromPoundToReal(){
        double conversion = value * 6;
        return conversion;
    }
}
