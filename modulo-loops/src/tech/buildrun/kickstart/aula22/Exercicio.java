package tech.buildrun.kickstart.aula22;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        // 1. Introdução
        System.out.println("### Desempenhos - Oracle PeopleSoft ###");

        // 2. Perguntar a quantidade demembros dentro da equipe
        System.out.println("Qual a quantidade de membros dentro do time? ");

        Scanner sc = new Scanner(System.in);
        int qtdMembros = sc.nextInt();
        sc.nextInt();

        int quantidadetotalDeNotas = 0;

        // 3. Perguntar a nota individual de cada membro
        for (int c = 1; c <= qtdMembros; c++){
            // codigo a ser repetido
            System.out.println("Digite a nota do membro " + c + ": ");

            quantidadetotalDeNotas = quantidadetotalDeNotas + sc.nextInt();
        }

        // 4. Calcular a nota de desempenho medio do time
        System.out.println("Gerando média do time...");
        System.out.println("Resultado de desempenho médio: " + (quantidadetotalDeNotas / qtdMembros));

    }
}
