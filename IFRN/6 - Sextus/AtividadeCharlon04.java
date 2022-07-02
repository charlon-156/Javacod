
import java.util.Scanner;
public class AtividadeCharlon04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite ");
        String nome = in.nextLine();
        
        int contador = 0;
        char tempo;
        
        for (int c = 0; c < nome.length(); c++) {
            
            tempo = nome.charAt(c);

            if (tempo == '1'){
                contador++;
            }
        }
        System.out.println("Na String: "+nome +" tem "+ contador + " (1's)");
        in.close();
    }
}
