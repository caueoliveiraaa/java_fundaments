package ActivitiesArrayList.atividade04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Questão 04:
        // Desenvolver um sistema, onde seja possível: cadastrar e selecionar alunos.
        // Crie uma classe Aluno com os seguintes atributos: nome, nota1, nota2, media e situação. 
        // Importante, a média e a situação não será o usuário que informa, deve ser feito de maneira automática.
        // 7 - 10: Aprovado(a)
        // 5 - 6.9: Em exame
        // 0 - 5.9: Reprovado(a)

        ArrayList<Alunos> info = new ArrayList<Alunos>();

        String menu = "-----------------------------------\n";
               menu += "O QUE VOCÊ DESEJA FAZER?\n";
               menu += "1) - DIGITE 1 PARA CADASTRAR O ALUNO!\n";
               menu += "2) - DIGITE 2 PARA SELECIONAR O ALUNO!\n";
               menu += "3) - PRESSIONE 3 PARA SAIR!\n";
               menu += "-----------------------------------\n";

        
        boolean prossegir = true;

        do {
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (escolha) {
                case 1 :
                // Cadastrar aluno
                Alunos a = new Alunos();

                a.nome = JOptionPane.showInputDialog(null, "POR FAVOR, INFORME O NOME DO ALUNO:\n");
                a.nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "POR FAVOR, DIGITE A PRIMEIRA NOTA:\n"));
                a.nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "POR FAVOR, DIGITE A SEGUNDA NOTA:\n"));

                a.media = (a.nota1 +  a.nota2) / 2;

                if (a.media > 7 && a.media < 10) {
                    a.situacao = "O ALUNO(A) ESTÁ APROVADO(A)!";
                }
                if ((a.media >=  5) && (a.media < 6.9)) {
                    a.situacao = "O ALUNO(A) ESTÁ DE EXAME!";
                }
                if (a.media < 5){
                    a.situacao = "O ALUNO(A) ESTÁ REPROVADO!";
                }

                info.add(a);
                
                break;

                // Selecionar aluno    
                case 2 :

                String lista = "LISTA DE ALUNOS(AS)!\n--------------------\n";

                for (int i = 0; i < info.size(); i++){
                    lista += "\nNOME: " + info.get(i).nome;
                    lista += "\nMÉDIA: " + info.get(i).media;
                    lista += "\nSITUAÇÃO: " + info.get(i).situacao;
                    lista += "\n--------------------";
                }

                JOptionPane.showMessageDialog(null, lista);

                break;

                case 3 :

                JOptionPane.showMessageDialog(null,"Sair");

                prossegir = false;

                break;

            }

        } while (prossegir == true);

               
        
    }
}
