package IFRN.Secundus;
import java.util.Scanner;
public class Bem_Vindo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String Aluno = in.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
        System.out.println("Digite sua matricula:");
        String matri = in.next();

        System.out.print("Seja bem aluno, "+Aluno );
        System.out.print(" de "+idade+" anos, matricula: "+matri);
        in.close();
    }
}