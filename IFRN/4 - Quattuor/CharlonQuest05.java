  
import java.util.Scanner;

//Faça um algoritmo que leia um número inteiro n. Escrever a soma e o produto de todos os números de 1 até n.

public class CharlonQuest05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int n = in.nextInt();
    
        in.close();
        
        for (int c = 1; c <= n; c++) {
            
            System.out.println("Soma: "+(n + c)+" Multiplicação: "+(n*c));
        }
    }
}