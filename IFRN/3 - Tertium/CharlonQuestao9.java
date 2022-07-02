  
import java.util.Scanner;

// Faça um algoritmo que solicita ao usuário, a altura (alt) e o sexo de uma pessoa e exibe uma mensagem com o peso ideal. Para homens, calcular o peso ideal usando a fórmula peso ideal = 72.7 x alt - 58 e, para mulheres, peso ideal = 62.1 x alt - 44.7.
public class CharlonQuestao9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
    System.out.println("Calculadora de peso ideal");
    System.out.println(" ");
    System.out.println("Digite sua altura:");
    double altura = in.nextDouble();

    System.out.println("Diga seu sexo");
    System.out.println("masculino ou feminino");
    int sexo = in.nextInt();

    switch (sexo) {
        case 1:
           
            double  pesoM = 72.7 * altura - 58;
            System.out.println("Peso ideal é "+pesoM);
            break;

        case 2:

            double  pesoF = 62.1 * altura - 44.7;
            System.out.println("Peso ideal é "+pesoF);
            break;

        default:
            System.out.println("Insira um sexo valido!!");
            break;
        }
        in.close();
    }
}