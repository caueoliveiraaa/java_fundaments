package ActivitiesOO.ex01;

import javax.swing.JOptionPane;

public class Produto {
    // Atributos
    private String nome;
    private double valor;
    private int formaPagamento;

    
    // Constructor
    public Produto() {
        obterDados();
        JOptionPane.showMessageDialog(null, mensagem());
    }
    // Métodos
    // Obter as informações
    private void obterDados (){
        nome = JOptionPane.showInputDialog(null, "Informe o produto: ");
        formaPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a forma de pagamento:\n1) A vista\n2) A prazo"));
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da compra"));
    }
    // Cálculo
    private double calculo(){
        double total;
        if (valor >= 500 && formaPagamento == 1){
            total = valor * 0.9;
        }else{
            total = valor;
        }
        return total;
    }

    private String mensagem(){
        String texto = "O produto "+nome+" irá custar R$"+calculo();
        return texto;
    }
}
