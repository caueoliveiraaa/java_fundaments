package ActivitiesArrayList.atividade07;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Questão 07:
        // Criar uma agenda de contatos, nela será possível: cadastrar, selecionar, alterar, filtrar e excluir dados.
        // A classe Contato terá os seguintes atributos: 
        // nome, idade, cidade, estado, telefone, e-mail, endereço (bairro, rua, número e complemento).
        // Quando for realizar a pesquisa, faça apenas através do nome.
        ArrayList<Contato> dados = new ArrayList<Contato>();

        String menu = "O que deseja fazer?\n";
               menu += "1) Cadastrar\n"; 
               menu += "2) Listar\n"; 
               menu += "3) Alterar\n";  
               menu += "4) Filtrar\n";  
               menu += "5) Exluir\n"; 
               menu += "6) Sair\n";

        boolean continuar = true;

        do {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (opcao) {
                case 1 : 
                // Cadastrar 
                Contato c = new Contato(); 
                c.nome = JOptionPane.showInputDialog(null, "Informe o nome: ");
                c.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade: "));
                c.cidade = JOptionPane.showInputDialog(null, "Informe a cidade: ");
                c.estado = JOptionPane.showInputDialog(null, "Informe o estado: ");
                c.telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o telefone: "));
                c.email = JOptionPane.showInputDialog(null, "Informe o telefone: ");
                c.bairro = JOptionPane.showInputDialog(null, "Informe o barro");
                c.rua = JOptionPane.showInputDialog(null, "Informe a rua");
                c.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do endereço"));
                c.complemento = JOptionPane.showInputDialog(null, "Informe o complemento");
                dados.add(c);
                break; 
    
                case 2:
                // Listar
                String lista = "Contatos cadastrados: \n--------------------\n";
                for (int i = 0; i < dados.size(); i++){
                    lista += "\nNome: " + dados.get(i).nome;
                    lista += "\nIdade: " + dados.get(i).idade;
                    lista += "\nCidade: " + dados.get(i).cidade;
                    lista += "\nEstado: " + dados.get(i).estado;
                    lista += "\nTelefone: " + dados.get(i).telefone;  
                    lista += "\nEmail: " + dados.get(i).email;  
                    lista += "\nBairro: " + dados.get(i).bairro;  
                    lista += "\nRua: " + dados.get(i).rua;  
                    lista += "\nNúmero: " + dados.get(i).numero;  
                    lista += "\nComplemento: " + dados.get(i).complemento;   
                    lista += "\n--------------------";
                }

                JOptionPane.showMessageDialog(null, lista);
                break; 
    
                case 3:
                // Alterar 
                String nomeContato = "Selecione o nome do contato que desejas alterar: \n";

                for (int i = 0; i < dados.size(); i++) {
                    nomeContato += (i+1) + ")" + dados.get(i).nome + "\n";
                }       

                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomeContato));


                Contato contato = new Contato(); 
                contato.nome = JOptionPane.showInputDialog(null, "Informe o nome do novo cliente: ");
                contato.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o e-mail do novo cliente: "));
                contato.cidade = JOptionPane.showInputDialog(null, "Informe a cidade do novo cliente: ");
                contato.estado = JOptionPane.showInputDialog(null, "Informe o estado do novo cliente: ");
                contato.telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: "));
                contato.email = JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: ");
                contato.bairro = JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: ");
                contato.rua = JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: ");
                contato.numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: "));
                contato.complemento = JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: ");
                
                dados.set(indice-1, contato);
                break;
    
                case 5:
                // Excluir
                String nomes = "Selecione o contato que desejas excluir: \n";

                for (int i = 0; i < dados.size(); i++) {
                    nomes += (i+1) + ")" + dados.get(i).nome + "\n";
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
