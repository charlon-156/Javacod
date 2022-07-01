package IFRN.Primus;
import java.util.Scanner;
public class Area {
    /*
    Escreva um algoritmo que solicitar ao usuário que digite os valores da base (b) e
da altura (h). Em seguida, calcular a área (A) com a fórmula: A= (b. h)/2. Por último,
exiba o valor da área (A). 
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = in.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = in.nextDouble();

        double area = (base*altura)/2;

        System.out.println("Area = "+area);
        
in.close();}
}
