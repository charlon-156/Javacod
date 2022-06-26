package Aulas.T_0103;
public class Empregado{
    
    /*
        Escreva um modelo Empregado que represente um empregado de uma empresa qualquer. 
        Considere que os atributos nome, departamento, horasTrabalhadasNoMês e salárioPorHora 
        devam ser representados, e que ao menos as operações mostraDados e calculaSalárioMensal
        sejam implementadas. 
    */

    String nome, departamento;
    int horas_trabalho;
    double salarioD, salarioM;

    public void MostrarDados(){
        System.out.println("\n\nBem vindo ao sistema da nossa empresa, "+nome+" do departamento "+departamento);
        System.out.println("Seu sálario diario é de: "+salarioD+"\ne suas horas de trabalho foram de "+horas_trabalho+"h");
    }
    
    public void CalcSalario(int horas_trabalho, double salarioD){
        double salarioM = salarioD * horas_trabalho;
        System.out.println("\nSeu sálario mensal foi de "+salarioM+" R$");
    }

}