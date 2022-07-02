  
import java.util.Scanner;

//Faça um programa que decida se duas strings lidas do teclado são palíndromas mútuas, ou seja, se uma é igual à outra quando lida de traz para frente. Exemplo: amor e roma.

public class AtividadeCharlon06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String p1 = in.nextLine();

        System.out.println("Digite a primeira palavra: ");
        String p2 = in.nextLine();

        StringBuffer buffer = new StringBuffer(p1);
        String p3 = buffer.reverse().toString();
        
        if (p3.equalsIgnoreCase(p2)) {
        System.out.println("\n"+p1+" e "+p2+" são palíndromas mútuas ");
            
        } else {
        System.out.println("\n"+p1+" e "+p2+" não são palíndromas mútuas");
    
        }
        in.close();
    }
}