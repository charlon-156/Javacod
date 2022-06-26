package Estudos.Desenvolvimento;
import java.util.Scanner;

public class Media{
	static float notas(int x, int y, int z) 
	{
            float f = x + y + z;
            return ( f ) / 3;
        }
    
	public static void main (String[] args) {
	    Scanner in = new Scanner (System.in);
        
            System.out.println("Digite a primeira nota:");
            int x = in.nextInt();

            System.out.println("Digite a segunda nota:");
            int y = in.nextInt();
        
            System.out.println("Digite a terceira nota:");
            int z = in.nextInt();
        
            System.out.println("");
        
            System.out.println("Resultado: " + notas(x, y, z));
            in.close();
	}
}