package ActivitiesArrayList.Activity04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Develop a system, whete it's possible register and select students
        // Create a class Students with the following atributes: name, grade1, grade2, average and situation
        // Important: The average and the situation won't be informed by the user, it must be done automatically
        //   7 - 10: Approved
        //   5 - 6.9: Summer school
        //   0 - 5.9: Flunked

        ArrayList<Students> info = new ArrayList<Students>();

        String menu = "-----------------------------------\n";
               menu += "-- What do you intend to do?\n";
               menu += "1 - Register a student\n";
               menu += "2 - Select a student\n";
               menu += "3 - Exit the program\n";
               menu += "-----------------------------------\n";

        
        boolean keepGoing = true;

        do {
            
            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (choice) {

                // Register the student
                case 1 :
  
                Students a = new Students();

                a.name = JOptionPane.showInputDialog(null, "Inform the name:\n");
                a.garde1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the first grade:\n"));
                a.grade2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform the second grade:\n"));

                a.average = (a.garde1 +  a.grade2) / 2;

                if (a.average > 7 && a.average < 10) {
                    a.situation = "Approved!";
                }
                if ((a.average >=  5) && (a.average < 6.9)) {
                    a.situation = "Summer school!";
                }
                if (a.average < 5){
                    a.situation = "Flunked!";
                }

                info.add(a);
                
                break;

                // Select student 
                case 2 :

                String list = "List of students!\n--------------------\n";

                for (int i = 0; i < info.size(); i++){

                    list += "\nName: " + info.get(i).name;
                    list += "\nAverage: " + info.get(i).average;
                    list += "\nSituation: " + info.get(i).situation;
                    list += "\n--------------------";

                }

                JOptionPane.showMessageDialog(null, list);

                break;

                // Exit the program
                case 3 :

                JOptionPane.showMessageDialog(null, "Exit");

                keepGoing = false;

                break;

            }

        } while (keepGoing == true);

               
        
    }
}
