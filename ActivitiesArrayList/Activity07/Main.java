package ActivitiesArrayList.Activity07;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Create a list of contacts, where it will be possible to register, select, alter, filter and delete data
        // The class Contact will have the following attributes:
        // name, age, city, state, telephone, e-mail, addreess (neighborhood, street, number e extraInfo)
        // Only search through the name

        ArrayList<Contact> data = new ArrayList<Contact>();

        String menu = "What do you intend to do?\n";
               menu += "1) Register\n"; 
               menu += "2) List\n"; 
               menu += "3) Alter\n";  
               menu += "4) Filter\n";  
               menu += "5) Delete\n"; 
               menu += "6) Exit\n";

        boolean keepGoing = true;

        do {

            int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (option) {

                // Register
                case 1 : 

                Contact c = new Contact(); 
                c.name = JOptionPane.showInputDialog(null, "Inform the name: ");
                c.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the age: "));
                c.city = JOptionPane.showInputDialog(null, "Inform the city: ");
                c.state = JOptionPane.showInputDialog(null, "Inform the state: ");
                c.telephone = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the telephone: "));
                c.email = JOptionPane.showInputDialog(null, "Inform the e-mail: ");
                c.neighborhood = JOptionPane.showInputDialog(null, "Inform the neighborhood");
                c.street = JOptionPane.showInputDialog(null, "Inform the street");
                c.number = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the number of the address"));
                c.extraInfo = JOptionPane.showInputDialog(null, "Inform the extra information about the address");
                data.add(c);

                break; 
                
                // List
                case 2:

                String list = "Registered contacts: \n--------------------\n";

                for (int i = 0; i < data.size(); i++){

                    list += "\nName: " + data.get(i).name;
                    list += "\nAge: " + data.get(i).age;
                    list += "\nCity: " + data.get(i).city;
                    list += "\nState: " + data.get(i).state;
                    list += "\nTelephone: " + data.get(i).telephone;  
                    list += "\nEmail: " + data.get(i).email;  
                    list += "\nNeighborhood: " + data.get(i).neighborhood;  
                    list += "\nStreet: " + data.get(i).street;  
                    list += "\nNumber: " + data.get(i).number;  
                    list += "\nExtra information: " + data.get(i).extraInfo;   
                    list += "\n--------------------";

                }

                JOptionPane.showMessageDialog(null, list);

                break; 
                
                // Alter
                case 3:

                String nameContact = "Select the name of the contact you wish to alter: \n";

                for (int i = 0; i < data.size(); i++) {

                    nameContact += (i+1) + ")" + data.get(i).name + "\n";

                }       

                int index = Integer.parseInt(JOptionPane.showInputDialog(null, nameContact));

                Contact contact = new Contact(); 
                contact.name = JOptionPane.showInputDialog(null, "Inform the new name: ");
                contact.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the new age: "));
                contact.city = JOptionPane.showInputDialog(null, "Inform the new city: ");
                contact.state = JOptionPane.showInputDialog(null, "Inform the new state: ");
                contact.telephone = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the telephone: "));
                contact.email = JOptionPane.showInputDialog(null, "Infor the new e-mail: ");
                contact.neighborhood = JOptionPane.showInputDialog(null, "Inform the new neighborhood: ");
                contact.street = JOptionPane.showInputDialog(null, "Inform the new street: ");
                contact.number = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the address number: "));
                contact.extraInfo = JOptionPane.showInputDialog(null, "Inform the new extra information regarding the address: ");
                data.set(index-1, contact);

                break;
                
                // Delete
                case 5:

                String names = "Select the contact you wish to delete: \n";

                for (int i = 0; i < data.size(); i++) {

                    names += (i+1) + ")" + data.get(i).name + "\n";

                }        

                int i = Integer.parseInt(JOptionPane.showInputDialog(null, names));

                data.remove(i-1);

                break; 
                
                //Exit
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
