  
import java.util.Scanner;
;public class CharlonAtividade02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero.");
        int num = in.nextInt();
        if (num>=7) {
            System.out.println("O resultado final foi: "+(num+3));
            
        } else {
            System.out.println("O resultado final foi: "+(num-2));
            
        }
        in.close();
    }
}
