package Aulas.A_1228;
public class Aluno {
    
    //Criação de das variaveis que seram instanciadas na main
    String nome, matricula;
    double n1, n2, tr;

    //Metodo p/ calcular a média do aluno
    public double mediaAluno(double n1, double n2, double tr) {
        double media = (n1 * 2.5 + n2 * 2.5 + tr * 2) / 7;
        return media;
    }

    //Função para determinar a nota final do aluno
    public double calcularFinal(double media) {
        double notaFinal = 10 - media; //A nota nescessaria e calculado por: med - 10
    
        System.out.println("\n\n-------------------------------------------");
        
        if ((media > 3) && (media < 6)) { //caso da media ter cido entre 3 e 6 
            System.out.println("Quase lá!"+nome+". Você ira para a prova final precisando de " + notaFinal);
            return notaFinal;

        } else if (media < 3) { //caso de media menor q 3
            System.out.println("Infelizmente "+nome+" foi reprovado");
            return 0;

        } else { //ultima opção para nenhumas das alternativas anteriores
            System.out.println("Parabéns, "+nome+"!!! Você foi aprovadoh");
            return 0;
            
        }
    }
}
