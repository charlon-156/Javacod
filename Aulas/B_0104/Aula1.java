package Aulas.B_0104;
import java.util.*;

public class Aula1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pessoa c1 = new Pessoa();

        System.out.print("Digite seu nome: ");
        c1.setNome(in.nextLine());
        System.out.print("Digite sua data de nascimento: ");
        c1.setData(in.nextLine());
        System.out.print("Digite sua altura: ");
        c1.setAltura(in.nextDouble());
        
        c1.Status();
        c1.Idade();
        in.close();
    }
}
