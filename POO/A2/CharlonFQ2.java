package POO.A2;
import java.util.*;

public class CharlonFQ2 {

    public static void Matriz() {
        Scanner in = new Scanner(System.in);
        // registrando o N° de linhas e colunas
        System.out.println("Digite a quantidade de linhas:");
        int lin = in.nextInt();
        System.out.println("Digite o numero de colunas");
        int col = in.nextInt();

        // criação da Matriz e inicialização das variaveis a e b
        // estas que seram utilizadas na formação da nossa matriz
        int[][] matr = new int[lin][col];
        int b = 0;
        int a = 0;

        // criação de uma laço de repetição Do While
        do {
            // usario digita os valores dos elementos
            System.out.println("Digite o elemento da [" + a + "][" + b + "]");
            matr[a][b] = in.nextInt();

            // sistema de condição para as duas formas -1, -2 e 0
            switch (matr[a][b]) {
                case -1:
                    a += 1;
                    b = -1;
                    break;

                case -2:
                    System.out.println("Coluna -> " + b + "\nLinha -> " + a);
                    a++;
                    break;

                case 0:
                    System.out.println("Numero invalido");
            }
            b++;

        } while (b < lin);
        in.close();
    }

    public static void main(String[] args) {
        Matriz(); // chamando o metedo Matriz
    }
}

//Desenvolva um programa que tenha uma função que leia uma matriz de inteiros positivos de dimensões desconhecidas. O seu programa irá ler os números e salvá-los, exceto quando ele for menor que 0. Se o número lido for -1, considere-o como um delimitador que diz o final da linha. Se for -2, a matriz completa foi lida. Além de ler a matriz, a função deve retornar a quantidade de colunas e a quantidade de linhas. As variáveis da matriz, do número de colunas e do número de linhas devem ser passadas por valor. Declare sua matriz utilizando um valor de tamanho máximo. 

//Exemplo de entrada: 356-1456-2
//Colunas: 3, Linhas: 2