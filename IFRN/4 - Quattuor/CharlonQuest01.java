  
import java.util.Scanner;

//Faça um algoritmo que solicita ao usuário um valor para base e um para o expoente e retorne o resultado (base elevada ao expoente). Escreva uma mensagem com para mostrar o resultado na tela.

public class CharlonQuest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite a base:");
        double base = in.nextDouble();
        
        System.out.println("Digite o expoente:");
        
        double expoente = in.nextDouble();
        double potencia = Math.pow(base, expoente);

        System.out.println("Resultado de "+base+"^"+expoente);
        
        System.out.println("é: "+potencia);
        in.close();
    }  
}
