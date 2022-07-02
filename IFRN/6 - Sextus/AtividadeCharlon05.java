  
import java.util.*;

//Um anagrama é uma palavra que é feita a partir da transposição das letras de outra palavra ou frase. Por exemplo, “Iracema” é um anagrama para “America”. Escreva um programa que decida se uma string é um anagrama de outra string, ignorando os espaços em branco. O programa deve considerar maiúsculas e minúsculas como sendo caracteres iguais, ou seja, “a” = “A”.

public class AtividadeCharlon05 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = in.nextLine();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = in.nextLine();

        char[]conversor1 = palavra1.toCharArray();
        char[]conversor2 = palavra2.toCharArray();

        Arrays.sort(conversor1);
        Arrays.sort(conversor2);

        String org = new String(conversor1);
        String org1 = new String(conversor2);
        
        if (org.equalsIgnoreCase(org1)) {
            System.out.println("eh uma anagrama");

        } else {
            System.out.println("não eh um anagrama");
            
        }
        in.close();
    }
}
