package Games;
import java.util.*;
public class Dados {
    public int JD1(){
       //vida
        Random aleatorio = new Random();
        int dado = aleatorio.nextInt(6);
        return dado;

    }
    public int JD2(){
        //ataque
        Random aleatorio = new Random();
        int dado = aleatorio.nextInt(6);
        return dado;

    }
}
