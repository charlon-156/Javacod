import java.util.*;

public class Exerc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContaBanco c1 = new ContaBanco();
        int escolha;

        System.out.println("Bem vindo ao banco Charlonista");

        do {
            System.out.println("\nQual função deseja executar?");
            System.out.println("1-Abrir conta.\n2-Fechar conta.\n3-Fazer deposito.\n4-Saque\n5-Pagar mensalidade\n6-Extrato\n7-Sair do Banco");
            escolha = in.nextInt();
            System.out.println("");
            
            if (escolha==1) {
                c1.AbrirConta();

            } else if (escolha==2) {
                c1.FecharConta();

            } else if (escolha==3) {
                c1.Depositar();

            } else if (escolha==4) {
                c1.Sacar();

            } else if (escolha==5) {
                c1.PagarMensal();

            } else if (escolha==6) {
                c1.Extrato();

            }else{}
            
        } while ((escolha!=6) || (escolha<6) || (escolha>0));

        in.close();
    }
}
