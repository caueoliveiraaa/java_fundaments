package Exercicises_from_class2;
import javax.swing.JOptionPane;
public class Exercise2 {

    public static void main(String[] args) {
        
        // Ask for a number, return the 10 predecessors and the 10 successors

        int n = Integer.parseInt(JOptionPane.showInputDialog("Type in a number: "));
        int lowestNum = n - 10;
        int greatestNum = n + 10;

        while (lowestNum <= greatestNum) {

            System.out.println(lowestNum + greatestNum);
            lowestNum++;
            greatestNum--;
            
        }

    }
    
}
