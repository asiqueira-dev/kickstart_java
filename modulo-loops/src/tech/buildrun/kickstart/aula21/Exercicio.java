package tech.buildrun.kickstart.aula21;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        // 1. Introdução
        System.out.println("# JIRA CLI #");

        // 2. Estrutura Do While
        // Scanner
        // Resposta
        Scanner sc = new Scanner(System.in);
        String resposta = "";

        do {

            // 3. indicar o menu de opçoes
            System.out.println("1 - Criar Tarefa");
            System.out.println("2 - Criar Projeto");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção: ");

            // 4. Ler a respoata do usuario
            resposta = sc.nextLine();

            // 5. Criar inteligencia para verificar a resposta do usuario
            switch (resposta){
                case "1":
                    System.out.println("Digite o nome da tarefa: ");
                    String nomeTarefa = sc.nextLine();
                    System.out.println("Tarefa [" + nomeTarefa + "] criada com sucesso!");
                    break;
                case "2":
                    System.out.println("Digite o nome do projeto: ");
                    String nomeProjeto = sc.nextLine();
                    System.out.println("projeto [" + nomeProjeto + "] criado com sucesso!");
                    break;
                case "3":
                    System.out.println("Finalizando....");
                    break;
                default:
                    System.out.println("Opção esta invalida!");
                    break;
            }

        }while (!resposta.equalsIgnoreCase("3"));
    }
}
