package IFRN.Primus;
import java.util.Scanner;

public class Triangulo {

    /* 
    Faça um algoritmo que receba três valores fornecidos pelo usuário que representarão
    os lados de um triângulo. Verifique se os valores formam um triângulo e classifique esse triângulo como:
    a)Equilátero: três lados iguais.
    b)Isósceles: dois lados iguais.
    c)Escaleno: três lados diferentes.
    Lembre-se de que, para formar um triângulo, nenhum dos lados pode ser igual a zero,
     um lado não pode ser maior do que a soma dos outros dois.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L1,L2,L3;

        System.out.println("Digite o lado um:");
        L1 = in.nextInt();

        System.out.println("Digite o lado dois:");
        L2 = in.nextInt();

        System.out.println("Digite o lado tres:");
        L3 = in.nextInt();
        System.out.println(" ");

        if(L1<=0||L2<=0||L3<=0){
            System.out.println("Isso não é um triangulo");

        }else if(L1>(L2+L3)||L2>(L1+L3)||L3>(L2+L1)){
            System.out.println("Isso não é um triangulo");

        }else if(L1==L2&&L2==L3){
            System.out.println("Triangulo equilatero");

        }else if(L1!=L2&&L2!=L3&&L1!=L3){
            System.out.println("Triangulo escaleno");

        }else if((L1==L2)||(L2==L3)||(L3==L1)){
            System.out.println("Triangulo Isosceles");
        }
        in.close();
    }
}