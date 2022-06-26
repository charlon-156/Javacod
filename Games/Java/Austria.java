package Games.Java;
import java.util.Random;
public class Austria{
    public static void main(String[] args) {
        
        Random linz = new Random();

        for(int i = 0; i<5;i++){
            String projeto = "@#%&";
        
            int viena = linz.nextInt(projeto.length());
            char graz = projeto.charAt(viena);

            // result
            System.out.println("caracter escolhido foi: " + graz);
        }
    }
}