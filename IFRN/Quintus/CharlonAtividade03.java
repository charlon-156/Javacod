package IFRN.Quintus;
import java.util.Scanner;
public class CharlonAtividade03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valor1 = in.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = in.nextInt();

        if (valor1>=valor2) {
            System.out.println(valor1+" ^ "+valor2+" = "+(Math.pow(valor1, valor2)));
        } else {
            System.out.println(valor1+" x "+valor2+" = "+(valor1*valor2));
        }
        in.close();
    }
}
