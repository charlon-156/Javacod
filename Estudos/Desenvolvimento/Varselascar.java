package Estudos.Desenvolvimento;
import java.util.Scanner;
public class Varselascar {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Observe os seguintes valores: ");
        System.out.println("@=a,#=b,$=c,%=d,¨=e\n");
        System.out.println("O que é essa frase?");
        System.out.println("#@#¨?");

        String senha = in.next();
        
    if(senha.equals("babe")){
        System.out.println("Voce acertou mizeravi, mais um ano pro deudoro");
    
    }else{
        System.out.println("Voce é burro, parece Dom Pedro, estude mais");
          
        }
        in.close();  
    }
}