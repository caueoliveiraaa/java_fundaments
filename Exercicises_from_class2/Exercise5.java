package Exercicises_from_class2;

import javax.swing.JOptionPane;

public class Exercise5 {
    public static void main(String[] args) {

        // Implement an array to store until 10 names, there can't be duplicate names
        String [] names = new String[10];

        int index = 0;

        do {

            String name = JOptionPane.showInputDialog(null, "Type in the " + (index + 1) + "° name: ");
            boolean exists = false;

            for (int i = 0; i < names.length; i++) {

                if (name.equals(names[i])) {

                    exists = true;

                }

            }

            if (exists == false) {

                names[index] = name;
                index++;

            } else {

                JOptionPane.showMessageDialog(null, "This name already exists. PLease, try again.");

            }    

        } while (index < 10);

    }
    
}
