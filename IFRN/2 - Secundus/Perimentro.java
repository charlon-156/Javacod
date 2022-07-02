import java.util.Scanner;

//Calculadora de perimetro de um circulo em java 

public class Perimentro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Programa para calcular o perimetro de um circulo");
        System.out.println("Primeiramente, me diga o valor de raio:");
        double raio = in.nextDouble();
        
        double pi = Math.PI;
        double perimetro = 2 * pi * raio;

        System.out.println("Valor do perimetro = "+ Math.round(perimetro*100)/100);
        
        in.close();
    }
}
