package ActivitiesOO.ex07;

import javax.swing.JOptionPane;

public class Numeros {
    private int n1, n2;
    int positive = 0;
    int negative = 0;
    int odds = 0;
    int even = 0;

        // Methods:

        // Constructor:
    public Numeros() {  
        getData();
        JOptionPane.showMessageDialog(null, message()); 
    }

    // obtain data:
    private void getData() {
       

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the first number: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the second number: "));

        if (n1 > n2) {
            while (n1 > n2) {
                odds += amountOdd(n2);
                even += amountEven(n2);
                positive += amountPostitive(n2);
                negative += amountNegative(n2);
                n2++;
            }
        }else{
            while (n1 < n2) {
                odds += amountOdd(n1);
                even += amountEven(n1);
                positive += amountPostitive(n1);
                negative += amountNegative(n1);
                n1++;
            }
        }
        
    }

    // ammount of even numbers:
    private int amountEven(int number){
        return number % 2 != 0 ? 1 : 0;
    }

    // amount of odd numbers:
    private int amountOdd(int number){
        return number % 2 == 0 ? 1 : 0;
    }

    // amount of positive numbers:
    private int amountPostitive(int number){
        if (number >= 0){
           return 1;
        }else{   
            return 0;
        }
    }

    // amount of negative numbers:
    private int amountNegative(int number){
        if (number < 0){
            return 1;
         }else{   
             return 0;
         }
    }
    
    // mensagem:void
    private String message(){
        String text = "The amount of even numbers is "+even+"\n";
               text += "The amount of odd numbers is "+odds+"\n";
               text += "The amount of positive numbers is "+positive+"\n";
               text += "The amount of negative numbers is "+negative+"\n";
        return text;
    }
}
