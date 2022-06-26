package Estudos.Repetição;
import java.util.Scanner;
public class Iam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = in.nextLine();

        for(int p = 0;p<5;p++){
            System.out.println(nome+", vocês são grandes progamadores!!");
        }in.close();
    }
}
