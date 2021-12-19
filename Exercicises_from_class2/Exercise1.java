package Exercicises_from_class2;
import javax.swing.JOptionPane;
public class Exercise1 {

    public static void main(String[] args) {
        
        // 1. Peça um número, retorne a tabuada daquele número;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Type in a number: "));

        for (int i = 1; i < 11; i++) {
            System.out.println("O número selecionado vezes " + i + " será " + (n * i) + "<hr>");
        }

    }
    
}
