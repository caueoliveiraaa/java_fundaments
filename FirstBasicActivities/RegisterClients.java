package FirstBasicActivities;
import javax.swing.JOptionPane;

public class RegisterClients {

    // Iniciate the system
    public static void main(String[] args){
        
        // Array String for clients:
        String[] clientes = new String[10];

        // Counter variable
        int counter = 0;

        // Loop
        do {

            clientes[counter] = JOptionPane.showInputDialog(null, "Inform the client's name: ");
            int moveOn = JOptionPane.showConfirmDialog(null, "Do you wish to continue?");
            
            if (moveOn == 0){
                counter++;
            }else{
                counter = 10;
            }

        }while(counter < 10);

        // List of registered clients:
        String message = "Clientes cadastrados:\n";
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null){
                message += clientes[i] + "\n";
            } 
        }
        
        // Display registered clients:
        JOptionPane.showMessageDialog(null, message);
        
    }
}