package Estudos.Desenvolvimento;
import java.util.Scanner;
public class ImPar {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Digite o numero: ");
    int numero = in.nextInt();

    if ((numero%2)==0) {
        System.out.println(+numero+" é par");  
    }else{
        System.out.println(numero+" é impar");
    }
in.close();}
}