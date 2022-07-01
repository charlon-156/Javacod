package IFRN.Sextus;
import java.util.*;
public class AtividadeCharlon10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num1 = new int [4];
        int[] num2 = new int [4];

        for (int i = 0; i < num2.length; i++) {
            System.out.println("Digite o valor do vetor ["+i+"]");
            num1[i] = in.nextInt();
            num2[i] = num1[i];
        }
        for (int i = num1.length-1; i>=0; i--) {
            System.out.println("Valor do Vetor ["+i+"] = "+num2[i]);
            
        }
        in.close();
    }
}
