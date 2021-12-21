package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise01{

    // Iniciate the system
    public static void main(String[] args){
        
        // The user will have to type in the name, age and the city where they live
        // Return a message concatenating the values
        
        String name = JOptionPane.showInputDialog(null, "Type in your name: ");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Type in your age: "));

        String city = JOptionPane.showInputDialog("Type in your city: ");

        System.out.println("Hello "+name+", you are "+age+" years old, and you live in "+city+".");

    }

}