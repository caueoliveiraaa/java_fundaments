package ObjectOriented.Construtor;

import javax.swing.JOptionPane;

public class Pessoa {
    
    // Construtor (Não existe construtor privato, sempre será public.)
    // (O construtor sempre terá o mesmo nome da classe)
    public Pessoa() {
        JOptionPane.showMessageDialog(null, "Hello world!");
    }

    public Pessoa (String nome) {
        JOptionPane.showMessageDialog(null, "Olá " + nome);
    }

    public Pessoa (String nome, int idade) {
        JOptionPane.showMessageDialog(null, "Olá "+nome+"! você tem "+idade+" anos.");
    }
}
