package IFRN.Primus;
import java.util.Scanner;
public class Orga1 {

    /*
        Escreva um algoritmo para determinar o maior de dois números dados.
        Suponha que o primeiro deles é o maior, armazenando-o em uma variável
        MAIOR e depois, compare se o maior procurado é o segundo dos números dados,
        neste caso o conteúdo da variável MAIOR deve ser alterado.
    */ 
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int a, b, maior;

        System.out.println("Digite o primeiro numero:");
        a = in.nextInt();

        System.out.println("Digite o segundo numero:");
        b = in.nextInt();
        maior = a;
        if(a > b) {
        System.out.println("O maior numero é o primeiro:" + maior);
        } else{
        maior = b;
        System.out.println("O maior numero é o segundo:" + maior);
        }
        in.close();
    }
}