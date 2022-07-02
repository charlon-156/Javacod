package IFRN.Secundus;
import java.util.Scanner;

//Conversor de Celsius para Fahrenheit

public class Celsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite em Celsius pra converter para Fº");
        double c = in.nextDouble();
        double f = (9*c+160)/5;

        System.out.println(" ");
        System.out.println("Valor de Celsius "+c);
        System.out.println("Valor em Fahrenheit "+f);

        in.close();
    }    
}