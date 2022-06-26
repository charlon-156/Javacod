package Games.Java;
import java.util.*;

public class PPT{
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int opc;

        int [] valores = {0, 1, 2, 3};
        int aux = rd.nextInt(3)+1;

        do{
            System.out.println("\n\n\nEscolha:\n1- Pedra\n2- Papel\n3- Tesoura");
            opc = in.nextInt();

            int pc = valores[aux];
            int p1 = valores[opc];
         
            System.out.println("você escolheu "+p1+"\nO pc escolheu "+pc+"\n-----------------------------");
     
             if(p1==pc){
                 System.out.println("Empate");
                 
             } else if(p1==1 && pc==3){
                 System.out.println("Você venceu");
                 
             } else if(pc==1 && p1==3){
                 System.out.println("I.A venceu");
                 
             } else if(p1>pc){
                 System.out.println("Você venceu");
                 
             } else{
                 System.out.println("A I.A venceu ;)");
                 
             }
        } while((opc <= 3 && opc >=1));

        in.close();
    }
}