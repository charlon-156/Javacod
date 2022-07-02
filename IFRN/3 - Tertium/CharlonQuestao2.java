  
import java.util.Scanner;

//Escrever um algoritmo que leia o nome de dois vendedores de uma loja, o salário fixo de cada um e o total de vendas efetuadas por cada vendedor no mês (em dinheiro). Sabendo que o primeiro vendedor ganha 15% de comissão sobre suas vendas efetuadas e o segundo vendedor ganhar 20% de comissão sobre suas vendas efetuadas, seu programa deverá informar o nome, o salário fixo e salário no final do mês, dos dois vendedores.

public class CharlonQuestao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String aluno = in.nextLine();
        
        System.out.println("Nota do 1º prova: ");
        double t1 = in.nextDouble();
        System.out.println("Valor maximo da Prova 1° ");
        double nm1 = in.nextDouble();

        System.out.println("Nota do 2º prova: ");
        double t2 = in.nextDouble();
        System.out.println("Valor maximo da Prova 2° ");
        double nm2 = in.nextDouble();

        System.out.println("Nota do 3º prova: ");
        double t3 = in.nextDouble();
        System.out.println("Valor maxino da Prova 3° ");
        double nm3 = in.nextDouble();

        double media1 = (t1+t2+t3)/3;
        double media2 = (nm1+nm2+nm3);

        System.out.println("O aluno "+aluno);
        System.out.println(" teve uma média de "+media1+"/"+media2);
        in.close();
    }
}