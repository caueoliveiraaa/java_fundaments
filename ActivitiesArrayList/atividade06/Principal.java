package ActivitiesArrayList.atividade06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Questão 06:
        // Desenvolver um sistema para: cadastrar, selecionar, alterar, filtrar e excluir clientes. 
        // Crie uma classe chamada Cliente com os atributos: nome, e-mail, cidade, estado, idade e profissão.
        // Na opção filtrar, deverá abrir um menu para filtrar clientes através de: nome (contenha determinado termo), estado e cidade.
        // Dica! Para poder pesquisar se um nome possui algum termo específico, utilize a função indexOf()

        ArrayList<Cliente> dados = new ArrayList<Cliente>();

        // Menu
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
                Cliente c = new Cliente(); 
                c.nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente: ");
                c.email = JOptionPane.showInputDialog(null, "Informe o e-mail do cliente: ");
                c.cidade = JOptionPane.showInputDialog(null, "Informe a cidade do cliente: ");
                c.estado = JOptionPane.showInputDialog(null, "Informe o estado do cliente: ");
                c.profissao = JOptionPane.showInputDialog(null, "Informe a profissão do cliente: ");
                c.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do cliente: "));
                dados.add(c);
                break; 
    
                case 2:
                // Listar
                String lista = "Clientes cadastrados: \n--------------------\n";
                for (int i = 0; i < dados.size(); i++){
                    lista += "\nNome: " + dados.get(i).nome;
                    lista += "\nEmail: " + dados.get(i).email;
                    lista += "\nCidade: " + dados.get(i).cidade;
                    lista += "\nEstado: " + dados.get(i).estado;
                    lista += "\nProfissão: " + dados.get(i).profissao;  
                    lista += "\nIdade: " + dados.get(i).idade;  
                    lista += "\n--------------------";
                }

                JOptionPane.showMessageDialog(null, lista);
                break; 
    
                case 3:
                // Alterar 
                String nomesClientes = "Selecione o cliente: \n";

                for (int i = 0; i < dados.size(); i++) {
                    nomesClientes += (i+1) + ")" + dados.get(i).nome + "\n";
                }       

                int indice = Integer.parseInt(JOptionPane.showInputDialog(null, nomesClientes));


                Cliente c1 = new Cliente(); 
                c1.nome = JOptionPane.showInputDialog(null, "Informe o nome do novo cliente: ");
                c1.email = JOptionPane.showInputDialog(null, "Informe o e-mail do novo cliente: ");
                c1.cidade = JOptionPane.showInputDialog(null, "Informe a cidade do novo cliente: ");
                c1.estado = JOptionPane.showInputDialog(null, "Informe o estado do novo cliente: ");
                c1.profissao = JOptionPane.showInputDialog(null, "Informe a profissão do novo cliente: ");
                c1.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do novo cliente: "));

                dados.set(indice-1, c1);
                break;
    
                case 4:
                // Filtrar
                int tipoFiltragem = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Nome \n2)Cidade\n3)Estado"));

                switch (tipoFiltragem){
                    case 1:
                    String termoNome = JOptionPane.showInputDialog("Informe o termo procurado:");

                    String listaNomes = "";
                    for (int i = 0; i < dados.size(); i++) {
                        if(dados.get(i).nome.indexOf(termoNome) != -1){
                            listaNomes += dados.get(i).nome + "\n";
                            listaNomes += dados.get(i).cidade + "\n";
                            listaNomes += dados.get(i).estado + "\n---------------\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaNomes);
                    break;

                    case 2:
                    String termoCidade = JOptionPane.showInputDialog("Informe o termo procurado");

                    String listaCidades = "";
                    for (int i = 0; i < dados.size(); i++) {
                        if (dados.get(i).cidade.indexOf(termoCidade) != -1) {
                            listaCidades += dados.get(i).nome + "\n";
                            listaCidades += dados.get(i).cidade + "\n";
                            listaCidades += dados.get(i).estado + "\n---------------\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaCidades);
                    break;

                    case 3:
                    String termoEstado = JOptionPane.showInputDialog("Informe o termo procurado");

                    String listaEstados = "";
                    for (int i = 0; i < dados.size(); i++) {
                        if (dados.get(i).estado.indexOf(termoEstado) != -1) {
                            listaEstados += dados.get(i).nome + "\n";
                            listaEstados += dados.get(i).cidade + "\n";
                            listaEstados += dados.get(i).estado + "\n---------------\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaEstados);
                    break;
                }
    
                break; 
                
                case 5:
                // Excluir
                String nomes = "Selecione o cliente que desejas excluir: \n";

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
