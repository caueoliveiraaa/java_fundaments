package Heritage.activity01;

import javax.swing.JOptionPane;

public class Car extends Vehicle {
    
    // Atributes:

    int year, engine;
    boolean sunRoof, hydraulicSteering;
    String fabricant, model, color;
    double value;

    // Constructor:
    public Car (){

        getData();
        message();

    }

    private void getData(){

        fabricant = JOptionPane.showInputDialog(null, "Inform the fabricant");
        model = JOptionPane.showInputDialog(null, "Inform the model");
        color = JOptionPane.showInputDialog(null, "Inform the color");
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the year"));
        value = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the value"));
        engine = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the cylinder capacity"));
        String sroof = JOptionPane.showInputDialog(null, "Does it have a sunroof? Yes/No");
        sunRoof = sroof.equals("sim") ? true : false;
        String hs = JOptionPane.showInputDialog(null, "Does it have hydraulic steering? Yes/No");
        hydraulicSteering = hs.equals("sim") ? true : false;

    }

    private void message(){

        String text = "Fabricant: "+fabricant;
               text = "\nModel: "+model;
               text = "\nColorr: "+color;
               text = "\nYear: "+year;
               text = "\nValue: "+value;
               text = "\nEngine: "+engine;
               text = "\nSunroof: "+(sunRoof == true ? "Yes" : "No");
               text = "\nHydraulic Steering: "+(hydraulicSteering == true ? "Yes" : "No");

        JOptionPane.showMessageDialog(null, text);

    }

}
