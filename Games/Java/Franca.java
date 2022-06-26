package Games.Java;
import java.util.Random;
public class Franca {
    public static void main(String[] args) {
        Random lyon = new Random();
        for(int i = 1;i<=3;i++){
            
        String[] nice = {"Avetruz","Aguia","Burro","Borboleta","Cachorro","Cabra","Carneiro","Camelo","Cobra","Coelho","Cavalo","Elefante","Galo","Gato","Jacaré","Leão","Macaco","Porco","Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
        int paris = lyon.nextInt(26);

        System.out.println(i+" - "+nice[paris]);
        }

    }
}
