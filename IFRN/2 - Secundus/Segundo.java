package IFRN.Secundus;
import java.util.Scanner;

//Conversor de segundos para hora minuto e segundo em Java

public class Segundo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("digite os segundos: ");
        int segundos = in.nextInt();

        int hora = segundos/3600; //primeiro calcula quantas horas tem no total
        segundos %= 3600; //em seguida essas horas seram descontadas do total

        int minutos = segundos / 60; //agr quantos minutos restaram
        segundos %= 60; //e novamente se tira do todo 

        System.out.println("Horas.....:"+hora);
        System.out.println("Minutos...:"+minutos);
        System.out.println("Segundos..:"+segundos);
        
        in.close();   
    }
}
