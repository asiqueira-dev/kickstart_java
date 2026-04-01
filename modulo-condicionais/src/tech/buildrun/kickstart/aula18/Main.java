package tech.buildrun.kickstart.aula18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // condição logica ? verdadeira : falso;
        System.out.println(" Digite a quantidade de itens que você comprou: ");

        Scanner sc = new Scanner(System.in);

        int qtdItens = sc.nextInt();

        String percentualDesconto = qtdItens > 100 ? "10%" : "5%";

        System.out.println("Você terá o desconto de "+ percentualDesconto);
    }
}
