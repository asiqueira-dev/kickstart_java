package tech.buildrun.kickstart.aula10;

public class Main {
    public static void main(String[] args) {

        // Widening Casting (Automático) = byte -> short -> char -> int -> long -> float -> double
        // Narrowing Casting   (Manual) = double -> float -> long -> int -> char -> short -> byte

        // Converter String para Tipos Primitivos e o caminho reverso
        String texto = "50";

        int n2 = Integer.parseInt(texto);
        int n1 = 50;

        System.out.println(n2 + n1);

       // Double.parseDouble("");
      //  Long.parseLong("");
      //  Float.parseFloat("");

        int numero = 50;

        String valorConvertido = String.valueOf(numero);

        System.out.println(valorConvertido);

    }
}
