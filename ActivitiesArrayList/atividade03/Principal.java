package ActivitiesArrayList.atividade03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Questão 03:
        // Criar um sistema para cadastrar, selecionar e remover produtos. 
        // Crie uma classe chamada Produto com os atributos nome, marca e valor.

        ArrayList<Produto> info = new ArrayList<Produto>();

        String menu = "O que você gostaria de realizar?\n"; 
               menu += "1) Cadastrar produtos\n"; 
               menu += "2) Selecionar produtos\n"; 
               menu += "3) Remover produtos\n";

        boolean prossegir = true;

        do {
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (escolha) {

                case 1:

                Produto p = new Produto();

                p.nome = JOptionPane.showInputDialog(null, "Por favor, informe o nome que desejas cadastrar: ");
                p.marca = JOptionPane.showInputDialog(null, "Por favor, informe a marca do produto: ");
                p.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor, digite valor do produto: "));

                info.add(p);

                JOptionPane.showMessageDialog(null, "O seu cadastro foi realizado com sucesso!");

                break;

                case 2:

                String lista = "Produtos cadastrados: \n-----------------------\n";

                for (int i = 0; i < info.size(); i++) {

                    lista += "\nNome: " + info.get(i).nome;
                    lista += "\nMarca: " + info.get(i).marca;
                    lista += "\nValor: " + info.get(i).valor;
                    lista += "\n-----------------------";

                }

                JOptionPane.showMessageDialog(null, lista);

                break;

                case 3: 

                String nomes = "Selecione o produto\n";

                for (int i = 0; i < info.size(); i++) {
                    nomes += (i+1) + ")" + info.get(i).nome + "\n";
                }

                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomes));

                info.remove(indice - 1);

                JOptionPane.showMessageDialog(null,"O produto foi removido com sucesso!");

                break;

                case 4:

                JOptionPane.showMessageDialog(null,"Sair");

                prossegir = false;

                break;
            }
        } while (prossegir == true);

    }
}
