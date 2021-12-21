package Exercicises_from_class2;
import javax.swing.JOptionPane;

public class Exercise1TimesTable {

    public static void main(String[] args) {
        
        // Ask for a number, return the times table of that same number typed

        int n = Integer.parseInt(JOptionPane.showInputDialog("Type in a number: "));

        for (int i = 1; i < 11; i++) {

            System.out.println("O número selecionado vezes " + i + " será " + (n * i) + "<hr>");
            
        }

    }
    
}
