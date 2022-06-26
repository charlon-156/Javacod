package IFRN.Quintus;
import java.util.Scanner;
public class CharlonAtividade06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ctrl c e ctrl v
        System.out.println("Digite um valor: (1/4)");
        int valor1 = in.nextInt();
        System.out.println("Digite um valor: (2/4)");
        int valor2 = in.nextInt();
        System.out.println("Digite um valor: (3/4)");
        int valor3 = in.nextInt();
        System.out.println("Digite um valor: (4/4)");
        int valor4 = in.nextInt();
        System.out.println("\n");
        

        System.out.println("Soma de todos: "+(valor1+valor2+valor3+valor4));
        System.out.println("Produto do 1° pelo 3°: "+(valor1*valor3));
        if ((valor2==0)||(valor4==0)) {
            System.out.println("\n-------- E R R O --------");
            System.out.println("IMPOSIVEL DIVISÃO POR 0!!");
        } else {
        System.out.println("queciente do 2° pelo 4°: "+(valor2/valor4));
            
        }
        in.close();
    }
}
