package IFRN.Septem;
import java.util.*;
public class ExameCharlon2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][]notas = new int[10][3];
        int menor = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Aluno "+(j+1)+" tirou quanto na prova "+(i+1));
                notas[j][i] = in.nextInt();
                }
            }   
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (notas[j][i] <= menor) {
                    menor = notas[j][i];
                    System.out.println("A menor nota do aluno"+(j+1)+", foi na prova "+(i+1)+" = "+menor);
                }
            }
        }
        in.close();
    }
}
