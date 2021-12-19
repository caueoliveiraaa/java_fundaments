package ObjectOriented.Metodos;

import javax.swing.JOptionPane;

public class Aluno {
    // Atributos 
    private String nome;
    private double nota1, nota2;

    // Construtor
    public Aluno() {
        obterDados();
        double retornoMedia = media();
        String retornoSituacao = situacao(retornoMedia);
        String mensagem = "O aluno "+nome+" obteve média "+retornoMedia+" e está "+retornoSituacao;
        JOptionPane.showMessageDialog(null, mensagem);
    }

    // Método para obter o nome e as notas (usamos void quando não haver retorno)
    private void obterDados () {
        nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 1° nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 2° nota: "));
    }

    // Método para realizar a média
    private double media() {
        return (nota1 + nota2 / 2);
    }

    // Método para realizar a situação
    private String situacao(double media) {
        return media >= 7 ? "Aprovado(a)" : "Reprovado(a)";
    }
}
