package POO.A1;

/*
    Escreva um programa que armazene os dados relacionados a um filme
    (nome, autor, ano, preço) em uma estrutura de dados do tipo registro. 
    Crie funções para ler e para imprimir os dados desse tipo de registro. 
    Crie uma função main para ler e imprimir os dados de 3 diferentes filmes.
*/

import java.util.*;
public class Questao2 {

    String filme; 
    String autor; 
    int data;
    double valor;
        //registro declarados de cada informação

        //função para coleta os dados e armazenamento dos registros 
   public void coleta1(){
        Scanner in = new Scanner(System.in);
            System.out.println("\nNome do filme ");
            filme = in.nextLine();
            System.out.println("\nAutor do filme ");
            autor = in.nextLine();
            System.out.println("\nAno de lançamento do filme ");
            data = in.nextInt();
            System.out.println("\npreço do filme \n\n");
            valor = in.nextDouble();
            in.close();    
   }
        //função para imprimir os dados de cada filme
   public void publicar(){
    System.out.println("\n\n-------Filme-------\nFilme: "+filme);
    System.out.println("Autor: "+autor);
    System.out.println("Ano: "+data);
    System.out.println("Preço: "+valor+"R$");
   }

    //metodo main para chamar as funções em suas respectiveis ordens, primeiro coletar os dados dos três filmes e por fim imprimir em sequência.
    public static void main(String[] args) {

        Questao2 c1 = new Questao2();
        c1.coleta1(); //passo 1
            
        Questao2 c2 = new Questao2();
        c2.coleta1(); //passo 2
        
        Questao2 c3 = new Questao2();
        c3.coleta1(); //passo 3
        
        c1.publicar(); //passo 4
        c2.publicar(); //passo 5
        c3.publicar(); //passo 6
      
        /* Sequência de cada parte:
            passo 1- informar sobre o filme 1
            passo 2- informar sobre o filme 2
            passo 3- informar sobre o filme 3
            passo 4- imprimir do filme 1
            passo 5- imprimir do filme 2
            passo 6- imprimir do filme 3
        */
    }
}
