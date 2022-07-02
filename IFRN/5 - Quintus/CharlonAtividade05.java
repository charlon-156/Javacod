  
import java.util.Scanner;
public class CharlonAtividade05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor maximo: ");
        int max = in.nextInt();
        System.out.println("Digite o valor minimo: ");
        int min = in.nextInt();
        int soma = 0;

        //mágica, não mexa
        for(int c=min;c<=max;c++){
            if(c%2==0){
            soma += c;
            }
        }

        System.out.println("(A soma dos valores de "+min+" até "+max+") foi: "+soma);
        in.close();

    }
}
