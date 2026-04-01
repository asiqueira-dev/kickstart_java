package tech.buildrun.kickstart.aula17;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        System.out.println("*** Tela de estação do Ano ***");

        System.out.println("Digite o mÊs atual: ");
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();

        switch (mes){


            case 1:
            case 2:
            case 3:
                System.out.println("Verão!");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Outono!");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Inverno!");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("Primavera!");
                break;
        }
    }
}
