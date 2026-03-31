package tech.buildrun.kickstart.aula16;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        System.out.println("### UNIVERSIDADE DE YALE ###");

        System.out.println("Qual a sua idade?: ");

        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual a sua Escolaridade?: ");

        String escolaridade = sc.nextLine();

        if(idade <= 22 && !"ensino fundamental".equalsIgnoreCase(escolaridade)){
            System.out.println("Inscreva-se no concurso agora mesmo!");
        }

        System.out.println("Sistema encerrado!");
    }
}
