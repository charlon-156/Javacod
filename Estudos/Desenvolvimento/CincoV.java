package Estudos.Desenvolvimento;
import java.util.*;

//Organizador 

public class CincoV {
    public static void main(String[] args) {
        System.out.println("Iniciando organizador...\n\nDigite 5 num");
        Org();

    }

    public static void Org() {
        Scanner in = new Scanner(System.in);
        int min = 2147483647, max = -2147483648;

        for (int c = 0; c < 5; c++) {
            int num = in.nextInt();

            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("Maior -> (" + max + ")\nMenor -> (" + min+")");
        in.close();
    }
}
