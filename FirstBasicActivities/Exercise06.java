package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise06 {

    // Iniciar o sistema
    public static void main(String[] args){
        
        // Exercise 6:
        // Utilizando como base o horário de Brasília (apenas a hora), faça com que o usuário tenha uma lista de cidades, 
        // exemplo: (Cidade do México, Nova Iorque, Tóquio), 
        // em seguida informe a hora atual de Brasília. Retorne o horário da cidade escolhida

        String menu = "Choose a city";
               menu += "\n1) Lisboa";
               menu += "\n2) Barcelone";
               menu += "\n3) Nova Iorque";

        int city = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        int time = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform Brasília's time zone"));

        JOptionPane.showMessageDialog(null, city == 1 ? time+3 : city == 2 ? time+4 : time+2);


        }
    }