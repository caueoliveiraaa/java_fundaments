package ActivitiesOO.ex06;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Person {

    // Atributes
    private String name;
    private double height;
    private double weight;

    // Constructor
    public Person(){

        getData();
        JOptionPane.showMessageDialog(null, message());

    }

    // Method to obtain data
    private void getData(){

        name = JOptionPane.showInputDialog(null, "Type in the name: ");
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Type in the height: "));
        weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Type in the weight: "));

    }

    // Method to calculate BMI
    private double calculateBMI(){

        double outcome;
        outcome = weight/(height*height);
        return outcome;

    }

    // Method to obtain the situation
    private String situationBMI(){

        String text;

        if (calculateBMI() < 18.5){
            text = "underweight!";
        }else if (calculateBMI() >= 18.5 && calculateBMI() < 25){
            text = "normal!";
        }else if (calculateBMI() >= 25 && calculateBMI() < 30){
            text = "overweight!";
        }else if (calculateBMI() >= 30 && calculateBMI() < 35){
            text = "obesity 1!";
        }else if (calculateBMI() >= 35 && calculateBMI() < 40){
            text = "obesity 2!";
        }else{
            text = "obesity 3!";
        }

        return text;

    }

    // Method to display message
    private String message(){

        DecimalFormat df = new DecimalFormat("#.##");
        String text = name+" weighs "+df.format(calculateBMI())+" and the situation is: "+situationBMI()+"!";
        return text;

    }

}