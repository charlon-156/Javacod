package IFRN.Tertium;
import java.util.Scanner;
public class CharlonQuestao1 {

    //Escrever um algoritmo que leia o nome de dois vendedores de uma loja, o salário fixo de cada um e o total de vendas efetuadas por cada vendedor no mês (em dinheiro). Sabendo que o primeiro vendedor ganha 15% de comissão sobre suas vendas efetuadas e o segundo vendedor ganhar 20% de comissão sobre suas vendas efetuadas, seu programa deverá informar o nome, o salário fixo e salário no final do mês, dos dois vendedores.
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insira o nome do primeiro vendedor: ");
        String vendedor1 = in.nextLine();
        System.out.println(" ");
        
        System.out.println("qual é o valor do seu salário fixo em R$?");
        double salariof1 = in.nextDouble();
        System.out.println(" ");
        
        System.out.println("Suas vendas esse mês?");
        double vendas1 = in.nextDouble();
        System.out.println(" ");
        
        System.out.println("Insira o nome do segundo vendedor: ");
        String vendedor2 = in.next();
        System.out.println(" ");
        
        System.out.println("qual é o valor do seu salário fixo em R$?");
        double salariof2 = in.nextDouble();
        System.out.println(" ");
        
        System.out.println("Suas vendas esse mês?");
        double vendas2 = in.nextDouble();
        System.out.println(" ");

        double comissao1 = vendas1 * 0.15;
        double comissao2 = vendas2 * 0.2;
      

        System.out.println(" ");
        System.out.println("----SALÁRIO DOS FUNCIONARIOS----");
        System.out.println(" ");
        
        System.out.println("vededor "+vendedor1);
        System.out.println("Salario Fixo...."+salariof1);
        System.out.println("Salario Final..."+(comissao1+salariof1));

        System.out.println(" ");
        

        System.out.println("vendedor "+vendedor2);
        System.out.println("Salario Fixo...."+salariof2);
        System.out.println("Salario Final..."+(salariof2+comissao2));
        
        in.close();
    }
}