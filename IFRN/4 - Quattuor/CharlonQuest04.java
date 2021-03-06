  
import java.util.Scanner;

//Escreva um algoritmo que solicita ao usuário as 3 notas de um aluno e uma letra. Se a letra for A a função calcula a média aritmética das notas do aluno e se for P, a sua média ponderada (pesos: 5, 3 e 2). A média calculada também deve ser exibida em uma mensagem.

public class CharlonQuest04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Nota do 1º prova: ");
        double t1 = in.nextDouble();

        System.out.println("Nota do 2º prova: ");
        double t2 = in.nextDouble();
        
        System.out.println("Nota do 3º prova: ");
        double t3 = in.nextDouble();
        
        double mediasimples = (t1+t2+t3)/3;
        double mediacomposta = (t1*5+t2*3+t3*2)/(5+3+2);

        System.out.println("Informe o tipo de média");
        System.out.println("a-Simples");
        System.out.println("p-Ponderada");
        String tipo = in.next();

        switch (tipo) {
            case "a":
                System.out.println("Sua média simples foi "+mediasimples);
                break;

            case "p":
                System.out.println("Sua média ponderada foi "+mediacomposta);
                break;

            default:
                System.out.println("Sintax invalida");
                break;
        }
        in.close();
    }
    
}