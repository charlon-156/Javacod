  
import java.util.*;

//Dada uma matriz 5 x 5, elabore um programa que escreva: 


public class ExameCharlon1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [][] num1 = new int [5][5];
        int [] soma1 = new int [5];
        int [] soma2 = new int [5];
        
            //digitação de valores
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                System.out.println("Digite o valor do vetor....["+i+"]["+j+']');
                num1[i][j] = in.nextInt();
                }
            }
        

        for (int i = 0; i < num1.length; i++) {
            System.out.println("");
            
            for (int j = 0; j < num1.length; j++) {
                System.out.print(" ["+num1[i][j]+"] ");
            }
                
        }

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                soma1[i]+=num1[i][j];
            }
            System.out.println("Resultado da soma da linha "+(i+1)+" = "+soma1[i]);
        }    
      
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1.length; j++) {
            soma2[i]+=num1[j][i];
            }
            System.out.println("Resultado da soma da coluna "+(i+1)+" = "+soma2[i]);
        }
       in.close();
        }
    }
