package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise06 {

    // Iniciate the system
    public static void main(String[] args){
        
        // Using Brasília's time zone (just the hour), give the user a list of cities, 
        // Example = México City, New York, Tokyo), then, inform Brasília's time.
        // Return the time of the chosen city

        String menu = "Choose a city";
               menu += "\n1) Lisboa";
               menu += "\n2) Barcelone";
               menu += "\n3) New York";

        int city = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        int time = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform Brasília's time zone"));

        JOptionPane.showMessageDialog(null, city == 1 ? time+3 : city == 2 ? time+4 : time+2);

    }

}