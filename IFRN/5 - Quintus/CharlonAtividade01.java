  
import java.util.Scanner;

//Faça um algoritmo que leia um número e verificar se o mesmo é par ou ímpar, mostrando-o em seguida.

public class CharlonAtividade01 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite o numero: ");
    int numero = in.nextInt();

    if ((numero%2)==0) {
        System.out.println(+numero+" é par"); 

    }else{
        System.out.println(numero+" é impar");
    
    }
    in.close();
   } 
}
