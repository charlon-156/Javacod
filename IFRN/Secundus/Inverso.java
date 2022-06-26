package IFRN.Secundus;
import java.util.Scanner;
public class Inverso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int num = in.nextInt();

            System.out.println("Seu número é fracional? Digite: ");
            System.out.println("");
            System.out.println("1-Sim, ele é fracional ");
            System.out.println("2-Não, ele não é fracional");
            int fracao = in.nextInt();
        switch (fracao) {
            case 1:
                System.out.print("diga o denominador"); int denominador = in.nextInt();
                System.out.println("O numero inverso é: "+denominador+"/"+num); break;

            case 2:
                System.out.println("O numero inverso é: 1/"+num); break;

            default: 
                System.out.println("ERRO, escolha 1 ou 2");
                
            }
        in.close();    
    }
}
