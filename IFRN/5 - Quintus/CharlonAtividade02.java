  
import java.util.Scanner;

//Faça um algoritmo que leia um número qualquer, testar se o mesmo é maior ou igual a 7. Se sim, imprimi-lo somando-o ao número 3. Se não, imprimi-lo subtraindo-o do número 2.

public class CharlonAtividade02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero.");
        int num = in.nextInt();
        
        if (num>=7) {
            System.out.println("O resultado final foi: "+(num+3));
            
        } else {
            System.out.println("O resultado final foi: "+(num-2));
            
        }
        in.close();
    }
}
