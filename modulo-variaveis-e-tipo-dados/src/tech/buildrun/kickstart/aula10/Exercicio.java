package tech.buildrun.kickstart.aula10;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        // 1. Solicitar um numero com ponto flutuante
        System.out.println("Digite um numero com ponto flutuante: ");

        // 2. Ler esse numero e armazenar em uma variavel (String)
        Scanner sc = new Scanner(System.in);
        String valorComPontFlutuante = sc.nextLine();

        // 3. Conveter para Double e Float
        double valorEmDouble = Double.parseDouble(valorComPontFlutuante);
        System.out.println("Convertido para Double: " + valorEmDouble);

        float valorEmFloat = Float.parseFloat(valorComPontFlutuante);
        System.out.println("Convertido para float: " + valorEmFloat);

        // 4. Solicitar um numero inteiro
        System.out.println("Digite um numero inteiro: ");

        // 5. Ler esse numero e armazenar em uma variavel (String)
        String valorInteiro = sc.nextLine();


        // 6. Conveter para Byte, Short, Int e Long
        byte valorEmByte = Byte.parseByte(valorInteiro);
        System.out.println("Convertido para byte: " + valorEmByte);

        short valorEmShort = Short.parseShort(valorInteiro);
        System.out.println("Convertido para Short: " + valorEmShort);

        int valorEmInt = Integer.parseInt(valorInteiro);
        System.out.println("Convertido para Int: " + valorEmInt);

        long valorEmLong = Long.parseLong(valorInteiro);
        System.out.println("Convertido para Long: " + valorEmLong);
    }
}
