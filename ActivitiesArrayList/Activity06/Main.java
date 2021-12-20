package ActivitiesArrayList.Activity06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        // Develop a system to register, select, alter, filter and delete clients 
        // Create a class called Client with the atributes: name, email, city, state, age e profession
        // In the option to filter, it must open a menu to filter clients through name, state and city
        // Tip: To be able to search if the name has a specifi term, use the function indexOf()

        ArrayList<Client> data = new ArrayList<Client>();

        // Menu
        String menu = "What do you intend to do?\n";
               menu += "1) Register a client\n"; 
               menu += "2) List all clients\n"; 
               menu += "3) Alter a client\n";  
               menu += "4) Filter clients\n"; 
               menu += "5) Delete a client\n"; 
               menu += "6) Exit the program\n";

        boolean keepGoing = true;

        do {

            int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (option) {

                // Register
                case 1 : 

                Client c = new Client(); 
                c.name = JOptionPane.showInputDialog(null, "Inform the name: ");
                c.email = JOptionPane.showInputDialog(null, "Inform the e-mail: ");
                c.city = JOptionPane.showInputDialog(null, "Inform the city: ");
                c.state = JOptionPane.showInputDialog(null, "Inform the state: ");
                c.profession = JOptionPane.showInputDialog(null, "Inform the profession: ");
                c.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the age: "));
                data.add(c);

                break; 
                
                // List
                case 2:

                String list = "Registered clients: \n--------------------\n";

                for (int i = 0; i < data.size(); i++){

                    list += "\nName: " + data.get(i).name;
                    list += "\nEmail: " + data.get(i).email;
                    list += "\nCity: " + data.get(i).city;
                    list += "\nState: " + data.get(i).state;
                    list += "\nProfissão: " + data.get(i).profession;  
                    list += "\nAge: " + data.get(i).age;  
                    list += "\n--------------------";

                }

                JOptionPane.showMessageDialog(null, list);

                break; 
                
                // Alter
                case 3:

                String namesClients = "Select the client: \n";

                for (int i = 0; i < data.size(); i++) {
                    
                    namesClients += (i+1) + ")" + data.get(i).name + "\n";
                    
                }       

                int index = Integer.parseInt(JOptionPane.showInputDialog(null, namesClients));

                Client c1 = new Client(); 
                c1.name = JOptionPane.showInputDialog(null, "Inform the new name: ");
                c1.email = JOptionPane.showInputDialog(null, "Inform the new e-mail: ");
                c1.city = JOptionPane.showInputDialog(null, "Inform the new city: ");
                c1.state = JOptionPane.showInputDialog(null, "Inform the new state: ");
                c1.profession = JOptionPane.showInputDialog(null, "Inform the new profession: ");
                c1.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the age: "));
                data.set(index-1, c1);

                break;
                
                // Filter
                case 4:

                int typeOfFilter = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Name \n2)City\n3)State"));

                switch (typeOfFilter){
                    
                    case 1:

                    String termName = JOptionPane.showInputDialog("Inform the term you are looking for:");

                    String listNames = "";

                    for (int i = 0; i < data.size(); i++) {

                        if(data.get(i).name.indexOf(termName) != -1){

                            listNames += data.get(i).name + "\n";
                            listNames += data.get(i).city + "\n";
                            listNames += data.get(i).state + "\n---------------\n";

                        }

                    }

                    JOptionPane.showMessageDialog(null, listNames);

                    break;

                    case 2:

                    String termCity = JOptionPane.showInputDialog("Inform the term you are looking for");

                    String listCities = "";

                    for (int i = 0; i < data.size(); i++) {

                        if (data.get(i).city.indexOf(termCity) != -1) {

                            listCities += data.get(i).name + "\n";
                            listCities += data.get(i).city + "\n";
                            listCities += data.get(i).state + "\n---------------\n";

                        }

                    }

                    JOptionPane.showMessageDialog(null, listCities);

                    break;

                    case 3:

                    String termState = JOptionPane.showInputDialog("Inform the term you are looking for");

                    String listState = "";

                    for (int i = 0; i < data.size(); i++) {

                        if (data.get(i).state.indexOf(termState) != -1) {

                            listState += data.get(i).name + "\n";
                            listState += data.get(i).city + "\n";
                            listState += data.get(i).state + "\n---------------\n";

                        }

                    }

                    JOptionPane.showMessageDialog(null, listState);

                    break;

                }
    
                break; 
    
                // Delete
                case 5:

                String names = "Select the client you wis to remove: \n";

                for (int i = 0; i < data.size(); i++) {

                    names += (i+1) + ")" + data.get(i).name + "\n";

                }        

                int i = Integer.parseInt(JOptionPane.showInputDialog(null, names));

                data.remove(i-1);

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

        } while (keepGoing== true);

        
    }
}
