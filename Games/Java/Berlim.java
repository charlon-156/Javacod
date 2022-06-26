package Games.Java;
import java.util.Random;
public class Berlim {
    public static void main(String[] args) {
        
        Random linz = new Random();

        for(int i = 0; i<3;i++){
            /*
                A-Avestruz B-Aguia
                C-burro    D-borboleta
                E-cachorro F-Cabra
                E-Carneiro F-Camelo
                G-Cobra    H-Coelho
                I-Cavalo   J-Elefante
                K-Galo     L-Gato
                M-Jacaré   N-Leão
                O-Macaco   P-Porco
                Q-Pavão    R-Peru
                S-Touro    T-Tigre
                U-Urso     V-Veado
                W-Vaca

            */
            String projeto = "abcdefghijklmnopqrstuvw";
        
            int viena = linz.nextInt(projeto.length());
            char graz = projeto.charAt(viena);

            // result
            System.out.println("caracteres do bicho foi: " + graz);
        }
    }
}
