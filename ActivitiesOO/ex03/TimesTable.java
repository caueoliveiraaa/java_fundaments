package ActivitiesOO.ex03;

import javax.swing.JOptionPane;

public class TimesTable {

    // Atributes
    private int number;
    private int i = 1;

    // Constructor
    public TimesTable() {

        obtainNumber();
        JOptionPane.showMessageDialog(null, message());

    }

    // Method to obtain number:
    private void obtainNumber() {

        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the number: "));

    }

    // Method to calculate:
    private String calculate() {

        String structcure = "";

        while(i <= 10){

            structcure += number + " X " + i + " = " + (number*i) + "\n";
            i++;

        }
        return structcure;

    }

    // Method to display the timestable
    private String message(){

        String text = "The times table of the number selected is \n"+calculate()+"\n";
        return text;

    }

}