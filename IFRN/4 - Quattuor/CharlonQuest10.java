  
import java.util.Scanner;
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
