package IFRN.Quattuor;
import java.util.Scanner;
public class CharlonQuest08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 1;

            System.out.println("Digite o valor inicial: ");
            int num = in.nextInt();

            System.out.println("Resultado: "+num+"x");

        for( int i=num; i >0 ; i--){
            result = result * i;
            System.out.print(i +"X");

        }   
            System.out.println(" = "+result);
        in.close();
    }
}