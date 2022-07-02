  
import java.util.Scanner;
public class CharlonQuestao7 {

    //Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("--Valor de um produto--");
        double produto = in.nextDouble();

        System.out.println(" ");
        System.out.println("persentual do acréscimo");
        double acrescimo = in.nextDouble();
        double preco = produto * (acrescimo/100);

        System.out.println(" ");
        System.out.println("Valor do produto: "+produto+" R$");
        System.out.println("Valor final.....: "+(preco+produto)+" R$");
        
        in.close();
    }
}