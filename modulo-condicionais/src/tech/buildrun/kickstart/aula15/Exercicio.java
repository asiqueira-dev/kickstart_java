package tech.buildrun.kickstart.aula15;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        System.out.println("*** Antes de você assistir ***");

        System.out.println("Qual a sua idade: ");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Você tem permissão dos seus pais?: ");
        String resposta = sc.nextLine();

       if(idade > 17 || resposta.equalsIgnoreCase("sim")){
           System.out.println("Acesso Liberado");
       } else{
           System.out.println("Acesso Negado!");
       }
    }
}
