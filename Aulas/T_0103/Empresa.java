package Aulas.T_0103;
import java.util.*;
public class Empresa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Empregado c1 = new Empregado();

        System.out.print("Digite seu nome: ");
        c1.nome = in.nextLine();
        System.out.print("Digite seu departamento: ");
        c1.departamento = in.nextLine();
        System.out.print("Digite quantas horas de trabalho: ");
        c1.horas_trabalho = in.nextInt();
        System.out.print("Digite seu sálario diario: ");
        c1.salarioD = in.nextDouble();

        c1.MostrarDados();
        c1.CalcSalario(c1.horas_trabalho, c1.salarioD);
        
        in.close();
    }
}