package ActivitiesArrayList.Activities02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<People> dados = new ArrayList<People>();

        // Menu
        String menu = "O que deseja fazer?\n";
               menu += "1) Cadastrar\n"; 
               menu += "2) Listar\n"; 
               menu += "3) Remover\n"; 
               menu += "4) Sair\n";

        // Variável para sair do laço
        boolean continuar = true;

        // laço
        do {
            // Obter a opção do menu
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));  

            // Escolha
            switch (opcao) {
                case 1: 
                People p = new People(); 
                p.nome = JOptionPane.showInputDialog(null, "Informe o nome: ");
                p.cidade = JOptionPane.showInputDialog(null, "Informe a cidade: ");
                p.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade: "));
                dados.add(p);
                break;

                case 2:

                // Lista de pessoas
                String lista = "PESSOAS CADASTRADAS: \n--------------------";

                // Laço
                for (int i = 0; i < dados.size(); i++){
                    lista += "\nNOME: " + dados.get(i).nome;
                    lista += "\nCIDADE: " + dados.get(i).cidade;
                    lista += "\nIDADE: " + dados.get(i).idade;
                    lista += "\n--------------------";
                }

                // Exibir lista
                JOptionPane.showMessageDialog(null, lista);
                break;

                case 3:

                // Lista de nomes
                String nomes = "SELECIONAR A PESSOA: \n";

                // Laço
                for (int i = 0; i < dados.size(); i++) {
                    nomes += (i+1) + ")" + dados.get(i).nome + "\n";
                }        

                // Obter o indice
                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomes));

                // Remover
                dados.remove(indice-1);

                // Mensagem
                JOptionPane.showMessageDialog(null, "PESSOAS REMOVIDA COM SUCESSO!");

                break;

                case 4:

                JOptionPane.showMessageDialog(null, "Sair"); 

                continuar = false;

                break;

            }
        } while (continuar ==  true);

    }
}
