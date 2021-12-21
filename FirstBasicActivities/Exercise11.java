package FirstBasicActivities;
import javax.swing.JOptionPane;

public class Exercise11 {

    // Iniciate the system
    public static void main(String[] args){
        
        // Ask for the three sides of the triangle, return the kind of triangle:
        // a) Isoceles: Two sides are equal and one is different;
        // b) Equilateal: All sides are equal;
        // c) Scalene: All sides are different;

        int side1 = Integer.parseInt(JOptionPane.showInputDialog("Type in the first side of the triangle: "));
        int side2 = Integer.parseInt(JOptionPane.showInputDialog("Type in the second side of the triangle: "));
        int side3 = Integer.parseInt(JOptionPane.showInputDialog("Type in the third side of the triangle: "));

        if (side1 == side2 && side1 != side3) {
            System.out.println("The triangle is isoceles!");
        } else if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.println("The triangle is equilateral!");
        } else if (side1 != side2 && side1 != side3 && side2 != side3) {
            System.out.println("The triangle is scalene!");
        } else if (side1 == side3 && side1 != side2) {
            System.out.println("The triangle is isoceles!");
        } else if (side2 == side3 && side1 != side3) {
            System.out.println("The triangle is isoceles!");
        } else if (side3 == side1 && side2 != side3) {
            System.out.println("he triangle is isoceles!");
        }
    }
}