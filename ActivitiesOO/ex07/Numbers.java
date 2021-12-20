package ActivitiesOO.ex07;
import javax.swing.JOptionPane;

public class Numbers {

    private int n1, n2;
    int positive = 0;
    int negative = 0;
    int odd = 0;
    int even = 0;

    // Constructor:
    public Numbers() {  

        obtainData();
        JOptionPane.showMessageDialog(null, message()); 

    }

    // Methods:
    // Obtain data
    private void obtainData() {
       
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the first number: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the second number: "));

        if (n1 > n2) {

            while (n1 > n2) {

                odd += amountOdd(n2);
                even += amountEven(n2);
                positive += amountPostitive(n2);
                negative += amountNegative(n2);
                n2++;

            }

        }else{
            
            while (n1 < n2) {

                odd += amountOdd(n1);
                even += amountEven(n1);
                positive += amountPostitive(n1);
                negative += amountNegative(n1);
                n1++;

            }

        }   

    }

    // Ammount of even numbers
    private int amountEven(int number){

        return number % 2 != 0 ? 1 : 0;

    }

    // Amount of odd numbers:
    private int amountOdd(int number){

        return number % 2 == 0 ? 1 : 0;

    }

    // Amount of positive numbers
    private int amountPostitive(int number){

        if (number >= 0){

           return 1;

        }else{   

            return 0;

        }

    }

    // Amount of negative numbers
    private int amountNegative(int number){

        if (number < 0){

            return 1;

        }else{   

            return 0;

        }
        
    }
    
    // Message
    private String message(){

        String text = "The amount of even numbers is "+even+"\n";
               text += "The amount of odd numbers is "+odd+"\n";
               text += "The amount of positive numbers is "+positive+"\n";
               text += "The amount of negative numbers is "+negative+"\n";
        return text;

    }

}