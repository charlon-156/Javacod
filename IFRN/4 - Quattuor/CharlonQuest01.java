  
import java.util.Scanner;
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
