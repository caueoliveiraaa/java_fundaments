package ActivitiesArrayList.Activity03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Create a system to register, select and remove products 
        // Create a class called Product with the atributes name, brand and value

        ArrayList<Product> info = new ArrayList<Product>();

        String menu = "What do you intend to do?\n"; 
               menu += "1) Register products\n"; 
               menu += "2) Select products\n";  
               menu += "3) Remove products\n";
               menu += "4) Exit\n";


        boolean keepGoing = true;

        do {

            int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (escolha) {

                case 1:

                Product p = new Product();

                p.name = JOptionPane.showInputDialog(null, "Please, inform the product's name: ");
                p.brand = JOptionPane.showInputDialog(null, "Por favor, inform the product's brand: ");
                p.value = Double.parseDouble(JOptionPane.showInputDialog(null, "Please, inform the product's value: "));

                info.add(p);

                JOptionPane.showMessageDialog(null, "You have registered the product successfully!");

                break;

                case 2:

                String list = "Registered products: \n-----------------------\n";

                for (int i = 0; i < info.size(); i++) {

                    list += "\nName: " + info.get(i).name;
                    list += "\nBrand: " + info.get(i).brand;
                    list += "\nValue: " + info.get(i).value;
                    list += "\n-----------------------";

                }

                JOptionPane.showMessageDialog(null, list);

                break;

                case 3: 

                String names = "Select the product: \n";

                for (int i = 0; i < info.size(); i++) {
                    names += (i+1) + ")" + info.get(i).name + "\n";
                }

                int index = Integer.parseInt(JOptionPane.showInputDialog(null, names));

                info.remove(index - 1);

                JOptionPane.showMessageDialog(null,"The product was removed successfully!");

                break;

                case 4:

                JOptionPane.showMessageDialog(null, "Exit!");

                keepGoing = false;

                break;
            }
            
        } while (keepGoing == true);

    }
}
