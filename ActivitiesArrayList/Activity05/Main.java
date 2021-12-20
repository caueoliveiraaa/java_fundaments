package ActivitiesArrayList.Activity05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Develop a system to register, select, alter and remove car 
        // The atributes of the class Car will be: model, manufacturer, value, year, and color.

        ArrayList<Car> data = new ArrayList<Car>();

        // Menu
        String menu = "What would you like to do?\n";
               menu += "1) To register\n"; 
               menu += "2) To list\n"; 
               menu += "3) To alter\n";  
               menu += "4) To delete\n"; 
               menu += "5) To exit\n";

        boolean keepGoing = true;

        do {

            int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (option) {

                // Register 
                case 1 : 

                Car c = new Car(); 
                c.model = JOptionPane.showInputDialog(null, "Inform the model: ");
                c.manufacturer = JOptionPane.showInputDialog(null, "Inform the manufacturer: ");
                c.color = JOptionPane.showInputDialog(null, "Inform the color: ");
                c.value = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the value: "));
                c.year = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the year: "));
                data.add(c);
                
                break; 
                
                // List
                case 2:
                
                String list = "Cars cadastrados: \n--------------------\n";
                for (int i = 0; i < data.size(); i++){

                    list += "\nModel: " + data.get(i).model;
                    list += "\nManufacturer: " + data.get(i).manufacturer;
                    list += "\nColor: " + data.get(i).color;
                    list += "\nValue: " + data.get(i).value;
                    list += "\nYear: " + data.get(i).year;  
                    list += "\n--------------------";

                }

                JOptionPane.showMessageDialog(null, list);

                break; 
                
                // Alter
                case 3:

                String carNames = "Select the model: \n";

                for (int i = 0; i < data.size(); i++) {

                    carNames += (i+1) + ")" + data.get(i).model + "\n";

                }       

                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, carNames));


                Car c1 = new Car(); 
                c1.model = JOptionPane.showInputDialog(null, "Inform the model");
                c1.manufacturer = JOptionPane.showInputDialog(null, "Inform the manufacturer: ");
                c1.color = JOptionPane.showInputDialog(null, "Inform the color: ");
                c1.value = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the value: "));
                c1.year = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the year: "));
                data.set(indice-1, c1);

                break;
                
                // Remove
                case 5:
                
                String names = "Select the car you wish to delete: \n";

                for (int i = 0; i < data.size(); i++) {

                    names += (i+1) + ")" + data.get(i).model + "\n";

                }        

                int index = Integer.parseInt(JOptionPane.showInputDialog(null, names));

                data.remove(index-1);

                break; 
                
                // Exit
                case 6:

                JOptionPane.showMessageDialog(null, "Exit"); 
                
                keepGoing = false;

                break;

                default:

                JOptionPane.showMessageDialog(null, "Type a valid number! (1 - 6)");

                break;

            }

        } while (keepGoing == true);
    }
}
