package Cod;
import java.util.Scanner;

public class Aula1 {
    public static void main(String []args){

       //Comente o metodo que não for utilizar ;)
        //EstrutBasic();
        //EstruutCondicao();
        Media();
    }
        // Revisão estrutura basica
        public static void EstrutBasic(){
            Scanner in = new Scanner(System.in);
                
            System.out.println("Digite a base: ");  
                double base = in.nextDouble();
            System.out.println("Digite a altura: ");
                double altura = in.nextDouble();

                double area = (base*altura)/2;
            
            System.out.println("A area é: "+area);

            in.close();
        }

        //Revisando estrutura condicional
        public static void EstruutCondicao(){

            Scanner in = new Scanner(System.in);

            System.out.println("Primeiramente digite um número: ");  
            int maior = in.nextInt();
            System.out.println("\nOtimo, agora digite um segundo número: ");  
            int menor = in.nextInt();

                if (maior>menor) {
                    System.out.println("\n\nEntre os dois números ditos: ("+maior+" e "+menor+"), o maior número é "+maior);

                } else {
                    int muda = menor;
                    menor = maior;
                    maior = muda;

                    System.out.println("\n\n\nEntre os dois números ditos: ("+menor+" e "+maior+"), o maior número é "+maior); 
                }
            in.close();    
        }

        //Aula pratica dia 23/11
        public static void Media(){
            Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = in.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = in.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = in.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float nota4 = in.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Sua média é "+media);
        in.close();
        }
    }