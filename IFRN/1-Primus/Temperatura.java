import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Conversor de Temperatura - in devesenvolvimento

        System.out.println("Progama para converter temperaturas");
        System.out.println("Qual o tipo de temperatura que você que conventer: ");
        System.out.println(" ");
        System.out.println("1-Celsius");
        System.out.println("2-Kelvin");
        System.out.println("3-Fahrenheit");
        int temperatura = in.nextInt();
        double c, f, k;
        switch(temperatura){
            case 1:
                System.out.println("Digite em Celsius pra converter");
                c = in.nextDouble();
                f = (9*c+160)/5;
                k = c - 273;
                System.out.println(" ");
                System.out.println("Valor de Celsius "+c+" C°");
                System.out.println("Valor em Fahrenheit "+f+" F°");
                System.out.println("Valor em Kelvin "+k+"K°");
                break;

            case 2:
            System.out.println("Digite em Celsius pra converter");
            

        } 
        in.close();
        
    }
    }
