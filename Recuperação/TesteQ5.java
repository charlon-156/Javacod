//Developer: por Luanderson Meira De Medeiros

import java.util.*;

public class TesteQ5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int escolha;

        //criação das classes - Gerente e Programador
        Gerente g1 = new Gerente("Carlos", 1000);
        Programador p1 = new Programador("Pedro", 900);
        
        //do while para manter um menu
        do {
            System.out.println("\n1- imprimir dados\n2- aumentar salario\n3- sair");
            escolha = sc.nextInt();

            //imprime dados
            if (escolha == 1) {
                System.out.println("\nImprimir dados de quem?\n1- Gerente\n2- Programador");
                escolha = sc.nextInt();

                switch (escolha) {
                    //dados do gerente
                    case 1:
                        System.out.println("Nome: "+ g1.getNome());
                        System.out.println("Salario: " + g1.getSalario());
                        break;

                    case 2:
                    //dados do programador
                        System.out.println("Nome: "+ p1.getNome());
                        System.out.println("Salario: " + p1.getSalario());
                        break;
                }

            //aumenta salario
            } else if (escolha == 2) {
                System.out.println("\nAumentar o sálario de quem?\n1- Gerente\n2- Programador");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                    //aumentar do gerente
                        g1.aumentaSalario();
                        break;

                    case 2:
                    //aumenta do programador
                        p1.aumentaSalario();
                        break;
                }
            } 
        }while (escolha!=3);
    }
}