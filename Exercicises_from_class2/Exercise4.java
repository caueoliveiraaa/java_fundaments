package Exercicises_from_class2;

import javax.swing.JOptionPane;

public class Exercise4 {

    public static void main(String[] args) {

        // Create an array, ask the user for five numbers and display the numbers backwards

        int [] number = new int[5];

        for (int i = 0; i < number.length; i++){
            number[i] = Integer.parseInt(JOptionPane.showInputDialog("Type in a number: "));
        }
        for (int i = 4 ; i >= 0; i--){
            System.out.println(number[i]);
        }

    }
    
}
