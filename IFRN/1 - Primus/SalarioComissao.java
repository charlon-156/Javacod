
import java.util.Scanner;
public class SalarioComissao {

    /*Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
nome, o salário fixo e salário no final do mês.*/
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Insira o nome do vendedor: ");
    String nome = in.nextLine();
    System.out.println("Insira o valor do salario fixo: ");
    double fixo = in.nextDouble();
    System.out.println("Insira o valor das vendas: ");
    double vendas = in.nextDouble();

    double salario = fixo + (vendas * 0.15);
    
    System.out.println(" ");
    System.out.println("O vendedor "+nome+", vendeu: R$ "+vendas);
    System.out.println("Seu sálario fixo é de R$ "+fixo );
    System.out.println("---------------------------------------");
    System.out.println("Salario final foi de R$ "+salario);
    
    
    in.close();}
}
