package tech.buildrun.kickstart.aula14;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        System.out.println("**** Sistema de Login - FBI ****");

        System.out.println("Digite o usuário: ");

        Scanner sc = new Scanner(System.in);

        String usuario = sc.nextLine();

        System.out.println("Digite a senha: ");

        String senha = sc.nextLine();

        if(usuario.equalsIgnoreCase("admin") && senha.equals("secret")){
            System.out.println("Acesso concedido");
            System.out.println("Liberando os arquivos secretos...");
        }else{
            System.out.println("#### ALARME #####");
            System.out.println("Agentes do FBI a caminho....");
        }

    }
}
