package ObjectOriented.Metodos;

import javax.swing.JOptionPane;

public class Student {

    // Atributes
    private String name;
    private double grade1, grade2;

    // Construtor
    public Student() {

        obtainData();
        double returnAverage = average();
        String returnSituation = situation(returnAverage);
        String mensagem = "The student "+name+" got the average "+returnAverage+" and the student has "+returnSituation;
        JOptionPane.showMessageDialog(null, mensagem);

    }

    // Method to obtain the name and the grades (we use "void" when the method doesn't return any value)
    private void obtainData () {

        name = JOptionPane.showInputDialog(null, "Inform your name: ");
        grade1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the 1° garde: "));
        grade2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Inform the 2° garde: "));

    }

    // Method to calculate the average
    private double average() {

        return (grade1 + grade2 / 2);

    }

    // Method to get the student's situation
    private String situation(double average) {

        return average >= 7 ? "been approved!" : "flunked!";
        
    }
}
