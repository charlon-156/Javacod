package IFRN.Primus;
import java.util.Scanner;
public class Produto {

    /* Faça um algoritmo que leia o código de um produto e exibir seu nome
    de acordo com a tabela a seguir: 
    */
    
    public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    int Produto;
        System.out.println("Digite o codigo do produto:");
        Produto = in.nextInt();

    switch(Produto){
        case 1: System.out.println("Caderno"); break;
        case 2: System.out.println("Lapis");   break;
        case 3: System.out.println("Boracha"); break;
        default:System.out.println("Diversos");break;
        }
        in.close();
    } 
}