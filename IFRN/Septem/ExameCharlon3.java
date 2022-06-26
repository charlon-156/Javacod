package IFRN.Septem;
import java.util.*;
public class ExameCharlon3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        int[][] D = new int[3][3];
        
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                System.out.println("Digite o valor do vetor A ["+i+"]["+j+"]");
                A[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                System.out.println("Digite o valor do vetor B ["+i+"]["+j+"]");
                B[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                D[i][j] = A[i][j] * B[i][j];
            }
        }
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                System.out.println("--------------------------------------");
                System.out.println("Valor do Vetor..........A ["+i+"]["+j+"] = "+A[i][j]);
                System.out.println("Valor do Vetor..........B ["+i+"]["+j+"] = "+B[i][j]);
                System.out.println("Aadicão dos Vetores A e B ["+i+"]["+j+"] = "+C[i][j]);
                System.out.println("produto dos Vetores A e B ["+i+"]["+j+"] = "+D[i][j]);
                
            }
        }
        in.close();
    }
}
