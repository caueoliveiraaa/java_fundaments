package ActivitiesOO.ex06;

@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        //6) Implementar um sistema de IMC, crie uma classe chamada Pessoa com as características:

	    // Atributos
	    // nome, peso, altura

	    // Métodos
	    //Construtor
	    //obterDados():void
	    // calculoImc():double
	    // situacaoImc(imc):String
	    // mensagem():String

        // Método obterDados: Pede o nome, peso e altura
        // Método calculoImc: Retorna o IMC (índice de massa corporal). O cálculo é: peso / (altura * altura)
        // Método situacaoImc: Através do parâmetro IMC, iremos retornar a situação através do cálculo realizado no método anterior, segue a tabela:
        // Até 18.5 - Abaixo do peso
        // Até 25 - Peso normal
        // Até 30 - Acima do peso
        // Até 35 - Obesidade I
        // Até 40 - Obesidade II
        // 40 ou mais - Obesidade III
        // 
        // Método mensagem: Crie uma mensagem com o nome, imc e situação.

        Person p = new Person();
    }
}
