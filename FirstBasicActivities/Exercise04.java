package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise04 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 4:
        // Peça um ano, retorne se é bissexto ou não.

        int year = Integer.parseInt(JOptionPane.showInputDialog("Type in a year: "));

        if (year % 4 == 0) {
            System.out.println("The year "+year+" is a leap year");
        }else{
            System.out.println("The year "+year+" isn't a leap year");
        }

        }
    }