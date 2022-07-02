  
import java.util.Scanner;

//Escreva um programa que associe um nota qualitativa a uma nota quantitativa ( 1 = Mau, 2 = Medíocre, 3 = Suficiente, 4 = Bom e 5 = Excelente). Exiba uma mensagem informando a nota qualitativa e a nota quantitativa

public class CharlonQuest06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolha = 0;
        
        do{
            System.out.println(" ");
            System.out.println("Digite sua nota qualitativa: ");
        
            int qualitativa = in.nextInt();

        switch (qualitativa) {
            case 1:
                System.out.println("Mau");
                System.out.println(" ");
                break;

            case 2:
                System.out.println("Mediocre");
                System.out.println(" ");
                break;

            case 3:
                System.out.println("Suficiente");
                System.out.println(" ");
                break;

            case 4:
                System.out.println("Bom");
                System.out.println(" ");
                break;

            case 5:
                System.out.println("Exelente");
                System.out.println(" ");
                break;

            default:
                System.out.println("Digite um numero entre 1 e 5.");
                System.out.println(" ");
                System.out.println(" ");
                break;

        }
            System.out.println("Quer recomeçar? digite 1");
            escolha = in.nextInt();

        }while(escolha==1);
        in.close();
    }
}
