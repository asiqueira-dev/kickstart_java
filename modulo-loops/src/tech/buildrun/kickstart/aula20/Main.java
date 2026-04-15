package tech.buildrun.kickstart.aula20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite um número: ");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while (numero > 0){
            System.out.println(numero);

            numero--;
        }

        System.out.println("Feliz Ano Novo!");

    }
}
