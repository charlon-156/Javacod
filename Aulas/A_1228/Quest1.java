package Aulas.A_1228;
import java.util.*;

public class Quest1{
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aluno c1 = new Aluno(); //estanciamento da func como o nome de "c1"

        System.out.print("Nome: ");
        c1.nome = in.nextLine();
        System.out.print("Matricula: ");
        c1.matricula = in.nextLine();
        
        //recolhimento dos dados do aluno 
        System.out.println("\nAbrindo sistema...\n\nOlá, "+c1.nome+" - "+c1.matricula);
        System.out.print("\nDigite a primeira nota: ");
        c1.n1 = in.nextInt();
        System.out.print("Digite a segunda nota: ");
        c1.n2 = in.nextInt();
        System.out.print("Digite a nota do trabalho: ");
        c1.tr = in.nextInt();

        //quando eu fiz isso só eu e deus entendemos
        //agora só ele sabe
        
        double RMedia = c1.mediaAluno(c1.n1, c1.n2, c1.tr);
        double RFinal = c1.calcularFinal(RMedia);

        System.out.print(RFinal);
        
        in.close();
        
       
    }
}