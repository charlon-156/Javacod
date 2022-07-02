
import java.util.Scanner;
public class AtividadeCharlon07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] x = new int[6];
        int [] y = new int[6];
        int [] z = new int[6];

        for (int c = 0; c < x.length; c++) {
            System.out.println("Digite o valor do 1° vetor "+"["+(c+1)+"]");
            x[c] = in.nextInt();
            System.out.println("Digite o valor do 2° vetor "+"["+(c+1)+"]");
            y[c] = in.nextInt();
        }
        System.out.println("\n");
        
        for (int c = 0; c < z.length; c++) {
            z[c] = x[c] + y[c];
            System.out.println("O valor da soma dos votores da posição "+c+" foi de "+z[c]);
            
        }
        in.close();
    }
}
