package Estudos.Desenvolvimento;
import java.util.Scanner;
public class Boleto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.print("Digite o valor do boleto: ");
        double Boleto = in.nextDouble();
        System.out.print("Digite o valor da multa: ");
        double Multa = in.nextDouble();
        System.out.print("Digite o valor do atraso ao dia: ");
        double porcen = in.nextDouble();
        System.out.print("Quantos dias de atraso: ");
        double dias = in.nextDouble();

        double atraso = dias * porcen;

        System.out.println("-------------------------");
        System.out.println("Valor total a pagar: "+(Boleto+atraso+Multa));
        System.out.println("-------------------------");
in.close();
    }
}
