package Aulas.A_1214;
import java.util.*;
public class Aulap3 {
    public static void main(String [] args){
        tempo();

    }
    public static void tempo(){
        Scanner in = new Scanner(System.in);
        System.out.println("digite os segundos: ");
        int segundos = in.nextInt();
        while (segundos<0) {
            System.out.println("Valores negativos invalidos, digite corretamenta");
            segundos = in.nextInt();
        }

        int hora = segundos/3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;


        System.out.println("Horas.....: "+hora);
        System.out.println("Minutos...: "+minutos);
        System.out.println("Segundos..: "+segundos);

        in.close();   
    }
    
}
