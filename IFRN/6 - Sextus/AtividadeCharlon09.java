 
import java.util.Scanner;
public class AtividadeCharlon09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []v = new int [30];
        int []z = new int [30];

        for (int c = 0; c <v.length; c++) {
            System.out.println("Digite o valor do vetor"+c);
            v[c] = in.nextInt();
            z[c] = v[c];
        }
        in.close();

        for (int i = 0; i <z.length; i++) {
            if(i%2==0){
                System.out.println("Vetor "+i+" = "+z[i]*2);
            
            }else{
                System.out.println("Vetor "+i+" = "+z[i]*3); 
            }
       
        }
    }
}
