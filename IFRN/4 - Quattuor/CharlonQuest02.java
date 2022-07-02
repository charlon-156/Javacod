  
import java.util.Scanner;

//Faça um algoritmo que solicita ao usuário o raio de uma esfera e calcula o seu volume,  v = (4 · π · r³)/3.

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
