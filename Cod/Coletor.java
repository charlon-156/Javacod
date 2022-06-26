package Cod;
import java.util.*;

public class Coletor {
    int n;

    public void escreve(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = in.nextInt();
        in.close();
    }
        //calculo do quadrado
        public void quadrado(){
            System.out.println("O quadrado de "+ n +" é... "+Math.pow(n, 2));
        }

        //calculo do cubo
        public void cubo() {
            System.out.println("O cubo de "+ n +" é... "+Math.pow(n, 3));
        }

        //calculo da raiz quadrada
        public void raiz() {
            System.out.println("A raiz de "+ n +" é... "+Math.sqrt(n));
        }
        public void raizCub() {
            System.out.println("O cubo da raiz "+ n +" é... "+Math.cbrt(n));
        }
}
