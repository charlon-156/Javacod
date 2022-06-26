package IFRN.Septem;
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
    System.out.println("Os matrix que estão contidos na diagonal principal são: "+matrix[0][0]+", "+matrix[1][1]+", "+ matrix[2][2]+", "+matrix[3][3]+", "+matrix[4][4]);
    System.out.println("Os matrix que estão contidos no triângulo superior são: "+matrix[0][1]+", "+matrix[0][2]+", "+ matrix[0][3]+", "+matrix[0][4]+", "+matrix[1][2]+", "+matrix[1][3]+", "+matrix[1][4]+", "+matrix[2][3]+", "+matrix[2][4]+", "+matrix[3][4]);
    System.out.println("Os matrix que estão contidos no triângulo inferior são: "+matrix[1][0]+", "+matrix[2][0]+", "+ matrix[2][1]+", "+matrix[3][0]+", "+matrix[3][1]+", "+matrix[3][2]+", "+matrix[4][0]+", "+matrix[4][1]+", "+matrix[4][2]+", "+matrix[4][3]);
    System.out.println("Tudo, exceto a diagonal principal: "+matrix[0][1]+", "+matrix[0][2]+", "+ matrix[0][3]+", "+matrix[0][4]+", "+matrix[1][0]+", "+matrix[1][2]+", "+matrix[1][3]+", "+matrix[1][4]+", "+matrix[2][0]+", "+matrix[2][1]+", "+matrix[2][3]+", "+matrix[2][4]+", "+matrix[3][0]+", "+matrix[3][1]+", "+matrix[3][2]+", "+matrix[3][4]+", "+matrix[4][0]+", "+matrix[4][1]+", "+matrix[4][2]+", "+matrix[4][3]);
in.close();}
}

