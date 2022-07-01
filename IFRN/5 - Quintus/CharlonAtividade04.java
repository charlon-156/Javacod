package IFRN.Quintus;
import java.util.*;
public class CharlonAtividade04 {
    public static void main(String[] args) {
        double cx1,x1,cx2,x2;
        Scanner in = new Scanner(System.in);
            System.out.println("Digite o valor de A");
            double a = in.nextDouble();
            System.out.println("Digite o valor de B");
            double b= in.nextDouble();
            System.out.println("Digite o valor de C");
            double c= in.nextDouble();
            System.out.println(" ");
            
            double delta = (Math.pow(b, 2)) - (4*a*c);

            x1 = (-b) + (Math.sqrt(delta));
            cx1 =(x1)/(2*a);

            x2 = (-b) - (Math.sqrt(delta));
            cx2 = (x2)/(2*a);

            if(delta>0){
                System.out.println("O discriminante foi maior que 0");
                System.out.println("Primeira raíz é "+cx1);
                System.out.println("Segunda raíz é "+cx2);
            }else if(delta==0){
                System.out.println("O discriminante foi igual a 0");
                System.out.println("Unica Raíz é "+cx1);
            }else{
                System.out.println("delta deu negativo");
                
            }  in.close();
    }
}
