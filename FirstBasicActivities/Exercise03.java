package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise03 {

    // Iniciate the system:
    public static void main(String[] args){
        
        // Exercise 3:
        // Ask for 3 grades, return the student's situation, and their average:
        // The situation will be based on the following rule: If the average is greater than or equal to 7, the student will be approved!
        // or else, the student will flunk:

        int grade1 = Integer.parseInt(JOptionPane.showInputDialog("Type in the first grade: "));
        int grade2 = Integer.parseInt(JOptionPane.showInputDialog("Type in the second grade: "));
        int grade3 = Integer.parseInt(JOptionPane.showInputDialog("Type in the third grade: "));
        float average = (grade1 + grade2 + grade3) / 3;

        if (average >= 7) {
            System.out.println("You have been approved! And the average of your grade is "+ average);
        }else{
            System.out.println("You have flunked! And the average of your grade is "+ average);
        }       

        }
    }
