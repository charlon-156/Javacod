  
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

    System.out.println("\nDiagona Principal");

    // diagonal principal
    for (int i = 0; i < matrix.length; i++) {
        System.out.println("");
        for ( int j = 0; j < matrix.length; j++) {
            if (j==i) {
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [x] "); 
            }
        }
    }

    System.out.println("\n\nTriangulo superior");
    
    //triangulo superior
    for (int i = 0; i < matrix.length; i++){
        System.out.println("");
        for(int j = 0; j < matrix.length; j++){
            if (j>i){
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [x] ");
            }
        }
    }

    System.out.println("\n\nTriangulo inferior");
    
    //triangulo inferior
    for (int i =0 ; i < matrix.length; i++){
        System.out.println("");
        for(int j = 0; j < matrix.length; j++){
            if (i>j){
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [x] ");
            }
        }
    }

    System.out.println("\n\nTudo menos a identidade");
    
    //exceto a diagonal principal
    for (int i = 0; i < matrix.length; i++){
        System.out.println("");
        for(int j = 0; j < matrix.length; j++){
            if (i!=j){
                System.out.print(" ["+matrix[i][j]+"] ");
            } else {
                System.out.print(" [x] ");
            }
        }
    }
    
in.close();
    }
}

