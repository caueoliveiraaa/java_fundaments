package ActivitiesArrayList.atividade05;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Questão 05:
        // Criar um sistema para poder: cadastrar, selecionar, alterar e remover carros. 
        // Os atributos da classe Carro serão: modelo, fabricante, valor, ano, cor.

        ArrayList<Carro> dados = new ArrayList<Carro>();

        // Menu
        String menu = "O que deseja fazer?\n";
               menu += "1) Cadastrar\n"; 
               menu += "2) Listar\n"; 
               menu += "3) Alterar\n";  
               menu += "4) Exluir\n"; 
               menu += "5) Sair\n";

        boolean continuar = true;

        do {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (opcao) {
                case 1 : 
                // Cadastrar 
                Carro c = new Carro(); 
                c.modelo = JOptionPane.showInputDialog(null, "Informe o modelo do carro: ");
                c.fabricante = JOptionPane.showInputDialog(null, "Informe o fabricante do carro: ");
                c.cor = JOptionPane.showInputDialog(null, "Informe a cor do carro: ");
                c.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do carro: "));
                c.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a profissão do cliente: "));
                dados.add(c);
                break; 
    
                case 2:
                // Listar
                String lista = "Carros cadastrados: \n--------------------\n";
                for (int i = 0; i < dados.size(); i++){
                    lista += "\nModelo: " + dados.get(i).modelo;
                    lista += "\nFabricante: " + dados.get(i).fabricante;
                    lista += "\nCor: " + dados.get(i).cor;
                    lista += "\nValor: " + dados.get(i).valor;
                    lista += "\nAno: " + dados.get(i).ano;  
                    lista += "\n--------------------";
                }

                JOptionPane.showMessageDialog(null, lista);
                break; 
    
                case 3:
                // Alterar 
                String nomesCarros = "Selecione o modelo carro: \n";

                for (int i = 0; i < dados.size(); i++) {
                    nomesCarros += (i+1) + ")" + dados.get(i).modelo + "\n";
                }       

                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomesCarros));


                Carro c1 = new Carro(); 
                c1.modelo = JOptionPane.showInputDialog(null, "Informe o nome do novo cliente: ");
                c1.fabricante = JOptionPane.showInputDialog(null, "Informe o e-mail do novo cliente: ");
                c1.cor = JOptionPane.showInputDialog(null, "Informe a cidade do novo cliente: ");
                c1.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o estado do novo cliente: "));
                c1.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: "));
                
                dados.set(indice-1, c1);
                break;
    
                case 5:
                // Excluir
                String nomes = "Selecione o carro que desejas excluir: \n";

                for (int i = 0; i < dados.size(); i++) {
                    nomes += (i+1) + ")" + dados.get(i).modelo + "\n";
                }        

                int indice2 = Integer.parseInt(JOptionPane.showInputDialog(null, nomes));

                dados.remove(indice2-1);
                break; 
    
                case 6:
                // Sair
                JOptionPane.showMessageDialog(null, "Sair"); 
                continuar = false;
                break;

                default:
                JOptionPane.showMessageDialog(null, "Digite um número válido! (1 - 6)");
                break;
            }

        } while (continuar == true);
    }
}
