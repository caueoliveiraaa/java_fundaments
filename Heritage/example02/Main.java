package Heritage.example02;

import javax.swing.JOptionPane;

@SuppressWarnings("all")

public class Main {

    public static void main(String[] args) {
        boolean goOn = true;

        do {
            String menu = "Select the professinal: \n";
            menu += "1) - Manager\n";
            menu += "2) - Atendent\n";
            menu += "3) - Desenveloper\n";
            menu += "4) - Exit the program\n";

        int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        if (option == 1){
           Gerente g = new Gerente();
        }else if(option == 2){
             Atendente a = new Atendente();
        }else if(option == 3){
             Desenvolvedor d = new Desenvolvedor();
        }else if(option == 4){
            goOn = false;
        }
        } while (goOn == true);
    }
}
