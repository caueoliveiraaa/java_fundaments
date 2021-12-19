package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise07 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 7:
        // Criar um sistema, onde o usuário informa um dia do mês de setembro, 
        // retorne qual o dia da semana representa aquela data. Valide caso o número informado seja inferior a 1 e superior a 30.

        int day = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, inform a day from Setember, 2021: "));

        if (day == 1 || day == 8 || day == 15 || day == 22 || day == 29) {
            System.out.println("The day you selected is on a Wednesday!");
        } else if (day == 2 || day == 9 || day == 16 || day == 23 || day == 30) {
            System.out.println("The day you selected is on a Thursday!");
        } else if (day == 3 || day == 10 || day == 17 || day == 24) {
            System.out.println("The day you selected is on a Friday!");
        } else if (day == 4 || day == 11 || day == 18 || day == 25) {
            System.out.println("The day you selected is on a Saturday!");
        } else if (day == 5 || day == 12 || day == 19 || day == 26) {
            System.out.println("The day you selected is on a Sunday!");
        } else if (day == 6 || day == 13 || day == 20 || day == 27) {
            System.out.println("The day you selected is on a Monday!");
        } else if (day == 7 || day == 14 || day == 21 || day == 28) {
            System.out.println("The day you selected is on a Tuesday!");
        } else {
            System.out.println("Invalid day! Try a number between 1 and 30!");
        }
    }    
}