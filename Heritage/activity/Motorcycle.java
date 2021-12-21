package Heritage.activity;

import javax.swing.JOptionPane;

public class Motorcycle extends Vehicle {

    // Atributes
    int cylinderCapacity;
    String kindOfStart;

    // Constructor
    public Motorcycle(){
        getData();
        message();
    }

    private void getData(){

        fabricant = JOptionPane.showInputDialog(null, "Inform the fabricant");
        model = JOptionPane.showInputDialog(null, "Inform the model");
        color = JOptionPane.showInputDialog(null, "Inform the color");
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the year"));
        value = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the value"));
        cylinderCapacity = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the cylinder capacity"));
        kindOfStart = JOptionPane.showInputDialog(null, "Inform the kind of start");

    }

    private void message(){
        
        String text = "Fabricant: "+fabricant;
               text = "\nModel: "+model;
               text = "\nColor: "+color;
               text = "\nYear: "+year;
               text = "\nValue: "+value;
               text = "\nCylinder capacity: "+cylinderCapacity;
               text = "\nKind of start: "+kindOfStart;

        JOptionPane.showMessageDialog(null, text);

    }
}
