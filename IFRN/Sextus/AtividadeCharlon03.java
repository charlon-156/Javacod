package IFRN.Sextus;
import java.util.*;
public class AtividadeCharlon03 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("digite seu nome");
    String nome = in.nextLine();
    String nomeFinal = nome.substring(0, 4);

    System.out.println(nomeFinal);
    in.close();
    }
}