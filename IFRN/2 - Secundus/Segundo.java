package IFRN.Secundus;
import java.util.Scanner;
public class Segundo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite os segundos: ");
        int segundos = in.nextInt();
        int hora = segundos/3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;
        System.out.println("Horas.....:"+hora);
        System.out.println("Minutos...:"+minutos);
        System.out.println("Segundos..:"+segundos);
        in.close();   
    }
}
