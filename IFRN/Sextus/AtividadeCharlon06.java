package IFRN.Sextus;
import java.util.Scanner;
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