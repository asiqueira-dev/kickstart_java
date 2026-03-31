package tech.buildrun.kickstart.aula11;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        System.out.println("## SITEMA DE ARQUITETURA##");

        System.out.println("");

        System.out.println("Vamos calcular o metro quadrado? ");

        System.out.println("");

        System.out.println("Digite a largura em M²: ");
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();

        System.out.println("");

        System.out.println("Digite altura em M²: ");

        double altura = sc.nextDouble();

        System.out.println("");

        double resultado = altura * largura;

        System.out.println("Calculando o metro quadrado....");

        System.out.println("Resultado: " + resultado + " M²");


    }
}
