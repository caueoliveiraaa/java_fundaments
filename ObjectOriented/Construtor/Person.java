package ObjectOriented.Construtor;
import javax.swing.JOptionPane;

public class Person {
    
    // Construtor (Não existe construtor privato, sempre será public.)
    // (O construtor sempre terá o mesmo nome da classe)

    public Person() {
        JOptionPane.showMessageDialog(null, "Hello world!");
    }

    public Person (String name, int age) {
        JOptionPane.showMessageDialog(null, "Hello "+name+"! you are "+age+" years old.");
    }

}
