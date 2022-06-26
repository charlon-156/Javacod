package Estudos.Anilisando;
import java.util.Scanner;

//Codigo sobre estudo do sistema condicional

public class Ifelse{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char chave;
        boolean republica;
        
        System.out.println("digite uma letra para continuar no enigma, se ele for o Certo tu continua...\n");
        chave = in.next().charAt(0);

        
    if(chave=='C'){
        System.out.println("Voce passou pelo primeiro, continuemos...");
        System.out.println("Me diga se essa frase é true ou false?? ");
        System.out.println("A republica deu certo?");
        republica = in.nextBoolean();

        if(republica==false){
            System.out.println("Muito bem!");

        }else{
            System.out.println("deixe de mentir, bixão grande ruim!! kkkkkkkk");

            }

        }
        in.close();
    }
}