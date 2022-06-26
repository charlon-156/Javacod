package Cod;
import java.util.*;
public class Coletor1 {
    float nota1;
    float nota2;
    float nota3;
    String letra; 

    public void escreve1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua 1° nota, entre 0 e 100: ");
            nota1 = in.nextFloat();
        System.out.println("Digite sua 2° nota, entre 0 e 100: ");
            nota2 = in.nextFloat();
        System.out.println("Digite sua 3° nota, entre 0 e 100: ");
            nota3 = in.nextFloat();
        System.out.println("Digite o parametro P ou A\n(A) - Média Aritmética;\n(P) - Média Ponderada;");
            letra = in.next();
            in.close();
    }
    public void calc() {
        switch (letra) {
            case "A":
                System.out.println("Média Aritmédica-> "+(nota1+nota2+nota3)/3);
                break;
            case "P":
                System.out.println("Média Ponderada-> "+(nota1*5+nota2*3+nota3*2)/10);
                break;
            default:
                System.out.println("Parametro invalido!!!!");
                break;
        }
    }
}
