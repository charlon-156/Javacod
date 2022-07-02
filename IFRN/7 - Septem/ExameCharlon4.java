  
import java.util.*;
public class ExameCharlon4 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int[][] matrix = new int[5][5];

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.println("Informe o matrix do vetor: "+"("+i+","+j+")");
            matrix[i][j] = in.nextInt();    
        }
    }

    // diagonal principal
    for (int i = 0; i < matrix.length; i++) {
        
        for ( int j = 0; j < matrix.length; j++) {
            if (j==i) {
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [ x ] "); 
            }
        }
    }

    
    //triangulo superior
    for (int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix.length; j++){
            if (j>i){
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [ x ] ");
            }
        }
    }
    
    //triangulo inferior
    for (int i =0 ; i < matrix.length; i++){
        for(int j = 0; j < matrix.length; j++){
            if (i>j){
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [ x ] ");
            }
        }
    }
    
    //exceto a diagonal principal
    for (int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix.length; j++){
            if (i!=j){
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [ x ] ");
            }
        }
    }
    
in.close();
    }
}

