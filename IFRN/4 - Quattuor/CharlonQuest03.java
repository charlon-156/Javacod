  
import java.util.Scanner;

//Faça um algoritmo que recebe um valor inteiro e verifica se o valor é positivo ou negativo. Seu algoritmo deve mostrar uma mensagem informando o número e se ele é positivo ou negativo.

public class CharlonQuest03 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Digite um numero para verificar se e´postivo ou negativo:");
        int num = in.nextInt();

        if (num>0) {
            System.out.println(num+" é positivo!");
            
        } else if(num<0){
            System.out.println(num+" é negativo!");
            
        } else{
            System.out.println("Esse numero é O");
        }
        in.close();
    }
}
