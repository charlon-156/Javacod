  
import java.util.Scanner;

//O usario deve digitir um valor para A e uma para B, depois os valores devem ser trocados 

public class Troca {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int a = in.nextInt();

        System.out.println("Digite o valor de B");
        int b = in.nextInt();

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Valor de A fica "+ a);
        System.out.println("Valor de B fica "+ a);
        

        
in.close();}
}
