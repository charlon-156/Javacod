  
import java.util.Scanner;

//Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).

public class CharlonQuestao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String aluno = in.nextLine();
        
        System.out.println("Nota do 1º prova: ");
        double t1 = in.nextDouble();
        System.out.println("Valor maximo da Prova 1° ");
        double nm1 = in.nextDouble();

        System.out.println("Nota do 2º prova: ");
        double t2 = in.nextDouble();
        System.out.println("Valor maximo da Prova 2° ");
        double nm2 = in.nextDouble();

        System.out.println("Nota do 3º prova: ");
        double t3 = in.nextDouble();
        System.out.println("Valor maxino da Prova 3° ");
        double nm3 = in.nextDouble();

        double media1 = (t1+t2+t3)/3;
        double media2 = (nm1+nm2+nm3);

        System.out.println("O aluno "+aluno);
        System.out.println(" teve uma média de "+media1+"/"+media2);
        in.close();
    }
}