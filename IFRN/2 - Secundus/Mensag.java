package IFRN.Secundus;
import java.util.Scanner;

//Sistema básico de recolhimento de nome

public class Mensag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Olaaa, seja bem vindo ao codigo de Charlon ;)");
        System.out.println("----------------------------------------------------");

        System.out.println("Como medida de segurança me diga seu nome completo: ");
        String nome = in.nextLine();

        System.out.println("Obrigado, "+nome);
        in.close();
    }
}