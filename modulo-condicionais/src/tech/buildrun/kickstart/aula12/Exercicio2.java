package tech.buildrun.kickstart.aula12;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println("# CALCULADORA #");

        System.out.println("Digite o valor de X: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o valor de Y: ");
        double y = sc.nextDouble();
        sc.nextLine();

        System.out.println("Qual a operação você quer realizar? (+, -, / ou *): ");
        String operacao = sc.nextLine();

        if(operacao.equalsIgnoreCase("+")){

            System.out.println("Resultado de " + x + " + " + y + " = " + (x + y) );

        }else if(operacao.equalsIgnoreCase("-")){

            System.out.println("Resultado de " + x + " - " + y + " = " + (x - y) );

        }else if(operacao.equalsIgnoreCase("/")) {

            System.out.println("Resultado de " + x + " / " + y + " = " + (x / y) );

        }else if(operacao.equalsIgnoreCase("*")){

            System.out.println("Resultado de " + x + " * " + y + " = " + (x * y) );

        }else{
            System.out.println("ERRO: Operação não suportada!");
        }
    }
}
