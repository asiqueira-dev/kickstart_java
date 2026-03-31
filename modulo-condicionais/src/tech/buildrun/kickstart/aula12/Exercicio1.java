package tech.buildrun.kickstart.aula12;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("***** SISTEMA DE GORJETAS *****");

        System.out.println("");

        System.out.println("VOCÊ GOSTARIA DE FORNECER GORJETA?: ");
        Scanner sc = new Scanner(System.in);

        String resposta = sc.nextLine();

        if(resposta.equalsIgnoreCase("SIM")){ // equalsIgnoreCase compara tanto maiusculo quando minusculo

            System.out.println("QUAL O VALOR: ");
            double valor = sc.nextDouble();

            System.out.println("GORJETA DE R$ " + valor + " REALIZADA COM SUCESSO!");

        }else{
            System.out.println("AGRADECEMOS A VISITA, ATÉ A PROXIMA!");
        }

    }
}
