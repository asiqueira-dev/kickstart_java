package tech.buildrun.kickstart.aula20;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        // 1. introdução
        System.out.println("## Montanha Russa da Disney ##");
        System.out.println("Sistema inializado com sucesso");
        System.out.println("Para sair, digite 'Finalizar'");
        System.out.println("");
        System.out.println("--------------------------------------------");

        Scanner sc = new Scanner(System.in);

        String resposta = "";

        // 2. Ciar o loop de ciclo de vida
        while (!resposta.equalsIgnoreCase("finalizar")){

            // 2.1 Solicitar a altura do passageiro
            System.out.println("Qual a altura do passageiro em CM?: ");

            // 2.2 Ler a altura do passageiro
            resposta = sc.nextLine();

            // 2.3 Verificar se a resposta foi finalizado
            if(!resposta.equalsIgnoreCase("finalizar")){

                // 2.4 converter a resposta para inteiro
                int altura = Integer.parseInt(resposta);

                // 2.5 Verificar se a autura é maior que 160
                if(altura > 160){
                    System.out.println("** Viagem liberada ** ");
                }else{
                    System.out.println("** Viagem negada ** ");
                }
            }
        }

        System.out.println("Sistema finalizado com sucesso");
    }
}
