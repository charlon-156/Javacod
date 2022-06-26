package Estudos.Anilisando;
import java.util.*;
public class Dado{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random aleatorio = new Random();
    int continuar;
      do{
      int dado = aleatorio.nextInt(6)+1;
      System.out.println("\n");
      System.out.println("Numero da sorte foi ["+dado+"]");
      System.out.println("----------------------------");
      System.out.println("Se deseja continuar digite 1");
      continuar = in.nextInt();
    }while(continuar==1);
    in.close();
  }  
}