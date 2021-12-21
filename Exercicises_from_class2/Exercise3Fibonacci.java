package Exercicises_from_class2;
import javax.swing.JOptionPane;

public class Exercise3Fibonacci {

    public static void main(String[] args) {
        
        // The user will inform a number, develop a system to implement the Fibonacci formula
        // Example: if the user types 5 the system should return:
        // 5    X   4 = 20
        // 20   X   3 = 60
        // 60   X   2 = 120
        // 120  X   1 = 120

        int number = Integer.parseInt(JOptionPane.showInputDialog("Type in a number: "));

        int outcome = 0;

        for (int i = number - 1; i > 0; i--) {

            if (i == number - 1) {

                outcome = number * i;
                System.out.println(number + " X " + i + " = " + outcome);

            }else{

                System.out.println(outcome + " X " + i +  " = " + (outcome * i));
                outcome = outcome * i;

            }
            
        }

    }


        

}
    

