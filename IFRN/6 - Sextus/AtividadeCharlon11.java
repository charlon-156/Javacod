
import java.util.*;

//Faça um programa que leia um vetor de 20 posições inteiras e o coloque em ordem crescente.

public class AtividadeCharlon11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []num = new int[20];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite");
            num[i] = in.nextInt();
        }

        in.close();
  
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}