package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise04 {

    // Iniciate the system
    public static void main(String[] args){
        
        // Ask for a number, return whether or not it is a leap year

        int year = Integer.parseInt(JOptionPane.showInputDialog("Type in a year: "));

        if (year % 4 == 0) {
            System.out.println("The year "+year+" is a leap year");
        }else{
            System.out.println("The year "+year+" isn't a leap year");
        }

    }

}