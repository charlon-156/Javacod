  
import java.util.Scanner;

//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 0,70% a.m.

public class CharlonQuestao5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" ");
       
        System.out.println("Valor do deposito na poupança");
        double deposito = in.nextDouble();

        double mes1 = deposito * 0.007 ;
        System.out.println("");
        System.out.println("Rendimento a.m "+mes1);
        System.out.println("Poupança atual "+(mes1+deposito));
        
        in.close();
    }
}