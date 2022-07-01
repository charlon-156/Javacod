package IFRN.Primus;
import java.util.Scanner;

//Codigo recebe três notas e retorna media de aluno

public class Aluno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String aluno = in.nextLine();
        System.out.println("Nota do 1º prova: ");
        int b1 = in.nextInt();
        System.out.println("Nota do 2º prova: ");
        int b2 = in.nextInt();
        System.out.println("Nota do 3º prova: ");
        int b3 = in.nextInt();

        int media = (b1+b2+b3)/3;
        System.out.println("O aluno "+aluno+"teve uma média de "+media);
        //hello
        
    in.close();}
}
