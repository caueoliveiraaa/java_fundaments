package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Array {

    // Iniciate the system:
    public static void main(String[] args){
        
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value:

        // Array of names:
        String [] names = {"Alice", "Caio", "Luciana", "Paulo"};
        
        // For loop:
        for (int i = 0; i < names.length; i++){
            JOptionPane.showMessageDialog(null, names[i]);
        }
        
        }
    }