package IFRN.Tertium;
import java.util.Scanner;
public class CharlonQuestao6 {
    //A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" "); 

        System.out.println("Sistema da loja Mamão com Açucar");
        System.out.println("Valor da compra:");
        double compra = in.nextDouble();

        double prestacao = compra / 5;

        System.out.println(" ");
        System.out.println("--Valor das prestações--");
        System.out.println("5 parcelas de "+prestacao+" R$");
        
        in.close();
    }
}