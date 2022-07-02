package IFRN.Secundus;
import java.util.Scanner;

//Claculadora de Bhaskara in Java

public class Bhaskara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        double a,b,c,delta,cx1,x1,cx2,x2;

            System.out.println("Digite o valor de A");
            a = in.nextDouble();
            System.out.println("Digite o valor de B");
            b= in.nextDouble();
            System.out.println("Digite o valor de C");
            c= in.nextDouble();
            
            
            delta = Math.pow(b, 2) - 4*a*c;

            x1 = -b + Math.sqrt(delta);
            cx1 = x1/(2*a);

            x2 = -b - Math.sqrt(delta);
            cx2 = x2/(2*a);

            if(delta>=0){
                System.out.println("x1 é"+cx1);
                System.out.println("x2 é"+cx2);
            }else{
                System.out.println("delta deu negativo");
                
            }  in.close();
        }
    }
