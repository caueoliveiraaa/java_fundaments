package Exercicises_from_class2;
import javax.swing.JOptionPane;
public class Exercise2 {

    public static void main(String[] args) {
        
        // 2. Peça um número, retorne os dez antecessores e os dez sucessores;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Type in a number: "));
        int smallest = n - 10;
        int greatest = n + 10;

        while (smallest <= greatest) {
            System.out.println(smallest + greatest);
            smallest++;
            greatest--;
        }

    }
    
}
