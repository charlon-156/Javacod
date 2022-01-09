package POO.A1;

/*
    Faça uma função que leia um número não determinado de valores positivos 
    e retorne a média aritmética dos mesmos
*/

import java.util.*;
public class Questao3{

    //função para calcular a média dos números
    static float media(int n1, int n2, int n3, int n4){
        float f = n1 + n2 + n3 + n4;
        return (f)/4;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Sequência de System.out.println para coletar os números

        System.out.println("Digite o primeiro número: ");
            int n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
            int n2 = in.nextInt();
    
        System.out.println("Digite o terceiro número: ");
            int n3 = in.nextInt();

        System.out.println("Digite o quarto número: ");
            int n4 = in.nextInt();

            //metodo condicional para determinar se o número é par ou impar

    if (n1<=0 || n2<=0 || n3<=0 || n4<=0) {
        System.out.println("Erro, você digitou número impar ");

    } else {
    
        //função para imprimir o resultado:

        System.out.println("/n Resultado: " + media(n1, n2, n3, n4));
        in.close();
        }
    }
}