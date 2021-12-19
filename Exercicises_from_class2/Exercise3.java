package Exercicises_from_class2;
import javax.swing.JOptionPane;
public class Exercise3 {

    public static void main(String[] args) {
        
        // 3. O usuário informa um número, crie um sistema para implementar a fórmula de Fibonacci.
        // 'Exemplo: Se o cliente informar o número 5, deverá ser exibido o cálculo:
        // 5    X   4 = 20
        // 20   X   3 = 60
        // 60   X   2 = 120
        // 120  X   1 = 120
        // A ideia dessa fórmula é fazer com que o usuário informe um número, o primeiro cálculo é o número menos o antecessor. 
        // Em seguida será feito o cálculo entre os valores geradores e os antecessores, até que chega a 1.
        // Outro exemplo:
        // 6     X   5 = 30
        // 30    X   5 = 150
        // 150   X   4 = 600
        // 600   X   2 = 1200
        // 1200  X   1 = 120

        int number = Integer.parseInt(JOptionPane.showInputDialog("Type in a number: "));

        int outcome = 0;

        for (int i = number - 1; i > 0; i--) {
            if (i == number - 1) {
                outcome = number * i;
                System.out.println(number + " X " + i + " = " + outcome);
            }else{
                System.out.println(outcome + " X " + i +  " = " + (outcome * i));
                outcome = outcome * i;
            }
        }

        }


        

}
    

