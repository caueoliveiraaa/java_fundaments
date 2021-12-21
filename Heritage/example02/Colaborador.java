package Heritage.example02;

import javax.swing.JOptionPane;

public class Colaborador {
    
    // Atributes
    String name;
    double wage;
    int absence;

    // Constructor
    public Colaborador() {
        name = JOptionPane.showInputDialog(null, "Type in the name: ");
        wage = Double.parseDouble(JOptionPane.showInputDialog(null, "Type in the wage: "));
        absence = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in the absences: "));
    }




    



}
