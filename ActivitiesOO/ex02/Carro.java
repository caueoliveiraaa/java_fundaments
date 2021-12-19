package ActivitiesOO.ex02;

import javax.swing.JOptionPane;

@SuppressWarnings("all")

public class Carro {
    private String modelo;
    private double valor;

    // Constructor
    public Carro() {
        obterDados();
        JOptionPane.showMessageDialog(null, mensagem());
    }
    // Métodos
    // Obter as informações
    private void obterDados (){
        modelo = JOptionPane.showInputDialog(null, "Informe o modelo do carro: ");
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do carro: "));
    }
    // Cálculo
    private double calculo(){
        double total;
        if (valor <= 10000){
            total = valor * 0.10;
        }else if(valor > 10000 && valor < 20000) {
            total = valor * 0.15;
        }else{
            total = valor * 0.20;
        }
        return total;
    }

    private double imposto(){
        double total;
        if (valor <= 10000){
            total = valor - (valor * 0.10);
        }else if(valor > 10000 && valor < 20000) {
            total = valor - (valor * 0.15);
        }else{
            total = valor - (valor * 0.20);
        }
        return total;
    }

    private String mensagem(){
        String texto = "O carro cuja o modelo é "+modelo+" irá custar R$"+imposto()+" com "+calculo()+" de impostos sobre o memso.";
        return texto;
    }
}
