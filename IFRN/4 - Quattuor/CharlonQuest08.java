  
import java.util.Scanner;

//Escreva um algoritmo que leia um valor inicial A e imprima a sequência de valores do cálculo de A! e o seu resultado. Exemplo: 5! = 5 X 4 X 3 X 2 X 1 = 120.

public class CharlonQuest08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 1;

            System.out.println("Digite o valor inicial: ");
            int num = in.nextInt();

            System.out.println("Resultado: "+num+"x");

        for( int i=num; i >0 ; i--){
            result = result * i;
            System.out.print(i +"X");

        }   
            System.out.println(" = "+result);

        in.close();
    }
}