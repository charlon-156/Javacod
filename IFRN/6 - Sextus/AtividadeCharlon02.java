package IFRN.Sextus;
import java.util.Scanner;
public class AtividadeCharlon02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome = in.next();
        in.close();
        for(int c = 1;c<=nome.length();c++){
            System.out.println(nome.toUpperCase().substring(0, c));
        } 
    }
}