  
import java.util.Scanner;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:Tabuada de 5:5 X 1 = 55 X 2 = 10...5 X 10 = 50

public class CharlonQuest10 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Você quer a tábuada de multipliçao de qual número?");

        int valor = in.nextInt();
        int c = 0;
        in.close();

        for(c=1;c<=10;c++){
            System.out.println(valor+" x "+c+" = "+(valor*c));
        }
    }
}
