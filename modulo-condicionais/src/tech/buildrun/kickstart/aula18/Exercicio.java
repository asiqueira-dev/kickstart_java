package tech.buildrun.kickstart.aula18;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        System.out.println("#### BEM VINDO AO AMAZON GO ####");

        System.out.println("Cliente Retirou o item da pratileira?: ");

        Scanner sc = new Scanner(System.in);

        String resposta = sc.nextLine();

        String resultado = resposta.equalsIgnoreCase("sim")
                ? "Item adicionado ao carrinho de comprar com sucesso"
                : "Seu carrinho de comprar ainda vazio";

        System.out.println(resultado);
    }
}
