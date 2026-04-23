package tech.buildrun.kickstart.aula22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("## Sistema de Tabuada ##");
        System.out.println("Digite um numero: ");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();


        for (int c = 1; c <= 10; c++){

            System.out.println(numero + "x" + c + " = " + (numero *c));
        }
    }
}
