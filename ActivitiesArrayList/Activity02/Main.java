package ActivitiesArrayList.Activity02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ArrayList<People> data = new ArrayList<People>();

        // Menu
        String menu = "What do you wish to do?\n";
               menu += "1) Register\n"; 
               menu += "2) List\n"; 
               menu += "3) Remove\n"; 
               menu += "4) Exit\n";

        // Variable to break the loop
        boolean keepGoing = true;

        // Loop
        do {

            // Obtain the opiton of the manu
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));  

            // Choose
            switch (option) {

                case 1: 
                People p = new People(); 
                p.name = JOptionPane.showInputDialog(null, "Inform the name: ");
                p.city = JOptionPane.showInputDialog(null, "Inform the city: ");
                p.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the age: "));
                data.add(p);
                break;

                case 2:

                // List of people
                String list = "PESSOAS CADASTRADAS: \n--------------------";

                // Loop
                for (int i = 0; i < data.size(); i++){

                    list += "\nName: " + data.get(i).name;
                    list += "\nCity: " + data.get(i).city;
                    list += "\nAge: " + data.get(i).age;
                    list += "\n--------------------";

                }

                // Display list
                JOptionPane.showMessageDialog(null, list);
                
                break;

                case 3:

                // List of names
                String names = "SELECT THE PERSON: \n";

                // LOOP
                for (int i = 0; i < data.size(); i++) {

                    names += (i+1) + ")" + data.get(i).name + "\n";

                }        

                // Obtain the index
                int index = Integer.parseInt(JOptionPane.showInputDialog(null, names));

                // Remover
                data.remove(index-1);

                // Mensagem
                JOptionPane.showMessageDialog(null, "PEOPLE REMOVED SUCCESSFULLY!");

                break;

                case 4:

                JOptionPane.showMessageDialog(null, "Exit"); 

                keepGoing = false;

                break;

            }
            
        } while (keepGoing ==  true);

    }
}
