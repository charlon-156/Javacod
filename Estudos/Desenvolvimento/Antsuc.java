package Estudos.Desenvolvimento;
import java.util.Scanner;

//Cod para calcular o sucesso e o antecessor de um number

public class Antsuc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite um número:");
        int n = in.nextInt();

        System.out.println("O antecessor é "+(n-1));
        System.out.println("O sucessor é "+(n+1));
        in.close();
    }
}
