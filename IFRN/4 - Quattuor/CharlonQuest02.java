  
import java.util.Scanner;
public class CharlonQuest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio da esfera para calcular o V:");
        double raio = in.nextDouble();
        double volume = (4*Math.PI*Math.pow(raio, 3))/3;

        System.out.println("Volume da esfera: "+volume);
        in.close();
    }
}
