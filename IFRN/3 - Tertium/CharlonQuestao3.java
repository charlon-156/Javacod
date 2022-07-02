  
import java.util.Scanner;

//Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

public class CharlonQuestao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        double a = in.nextDouble();
        System.out.println("Digite o valor de B");
        double b = in.nextDouble();

        double troca = a;
        a = b;
        b = troca;

        System.out.println("Valor de A é "+a);
        System.out.println("Valor de B é "+b);
        
        in.close();
    }
}