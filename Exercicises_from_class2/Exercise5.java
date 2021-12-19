package Exercicises_from_class2;

import javax.swing.JOptionPane;

public class Exercise5 {
    public static void main(String[] args) {
        // 2. Implementar um vetor para armazenar até 10 nomes, não poderá haver repetição dos nomes cadastrados.
        String [] names = new String[10];

        int indice = 0;

        do {
            String name = JOptionPane.showInputDialog(null, "Type in the " + (indice + 1) + "° name: ");
            boolean exists = false;

            for (int i = 0; i < names.length; i++) {
                if (name.equals(names[i])) {
                    exists = true;
                }
            }

            if (exists == false) {
                names[indice] = name;
                indice++;
            } else {
                JOptionPane.showMessageDialog(null, "This name already exists. PLease, try again.");
            }            
        } while (indice < 10);

    }
}
