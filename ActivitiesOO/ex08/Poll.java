package ActivitiesOO.ex08;

import javax.swing.JOptionPane;

public class Poll {

    // Atributes:
    private int candidate1, candidate2, candidate3, candidate4;

    private String menu = "Choose the candidate:\n1) To vote for candidate 1.\n2) To vote for candidate 2.\n3) To vote for candidate 3.\n4) To vote for candidate 4.\n5) To exit the poll.\n";

    // Construtor:
    public Poll() {
        loop();
        JOptionPane.showMessageDialog(null, message());
    }

    // Methods:

    // Method for the loop:
    private void loop() {
        int poll = 0;

        while (poll != 5){
            poll = Integer.parseInt(JOptionPane.showInputDialog(menu));
            voteCounter(poll);
        }
    }

    // Method to count the votes:
    private void voteCounter(int poll){

        switch (poll) {
            case 1: candidate1++; break;
            case 2: candidate2++; break;
            case 3: candidate3++; break;
            case 4: candidate4++; break;
            case 5: break;
            default:
            }

    } 

    // Method to display final message:
    private String message(){
        String text = "The candidate 1 has :"+candidate1+" votes.\n The candidate 2 has :"+candidate2+" votes.\n The candidate 3 has :"+candidate3+" votes.\n The candidate 4 has :"+candidate4+"  votes.\n";
        return text;
    }
}

    

