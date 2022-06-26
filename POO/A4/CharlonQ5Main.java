package POO.A4; 
  
import java.util.*;

public class CharlonQ5Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Exercicio 1\n");
        CharlonQ1Arq5 c1 = new CharlonQ1Arq5(101, "Flávio");
        CharlonQ1Arq4 c2 = new CharlonQ1Arq4(102, "Olavo");

        c1.exibirDados();
        c2.exibirDados();
        
        System.out.println("\nExercicio 2\n");
        CharlonQ2Arq2 dog = new CharlonQ2Arq2("Desky");
        CharlonQ2Arq3 cat = new CharlonQ2Arq3();
        System.out.println(dog.Late() + "\n" + cat.mia() + "\n" + dog.Caminha() + " e " + cat.Caminha());
     
        CharlonQ2Arq7 r1 = new CharlonQ2Arq7("Ricardo", 23, 50);
        r1.Compras(10);
        CharlonQ2Arq6 p1 = new CharlonQ2Arq6("Chico", 23);
        p1.Trabalha();
        CharlonQ2Arq5 m1 = new CharlonQ2Arq5("Nicolau", 23);
        m1.Mendiga();

        System.out.println("\nExercicio 3\n");
        CharlonQ3Arq1 i = new CharlonQ3Arq1(10);
        System.out.println("Escolha o tipo do ingresso?\n1-Normal\n2-VIP");
        int opc = in.nextInt();

        switch (opc) {
            case 1:
                CharlonQ3Arq3 n = new CharlonQ3Arq3(i.getValor());
                n.ImprimirDados();
                break;

            case 2:
            CharlonQ3Arq2 v = new CharlonQ3Arq2(i.getValor(), 5);
                System.out.println("Agora escolha o local: \nDigite: 1 para Superior ou 2 para Inferior?");
                opc = in.nextInt();

            switch (opc) {
                case 1:
                    CharlonQ3Arq4 sup = new CharlonQ3Arq4(v.getValor(), v.getAdicional(), 7);
                    sup.ImprimirDados();
                    break;
                    
                case 2: 
                    CharlonQ3Arq5 inf = new CharlonQ3Arq5(v.getValor(), v.getAdicional());
                    inf.ImprimirVip();
                    break;

                    default:
                    System.out.println("Valor invalido");
                    break;
            }
            break;
            
                default:
                System.out.println("Valor invalido");
                break;
        }

        System.out.println("\nExercicio 4\n");
        CharlonQ4Arq1 movel = new CharlonQ4Arq1("Rua Laranjeira", 1200);
        System.out.println("1- Casa Nova ou 2- Casa Velha");
        int opc1 = in.nextInt();
        
        switch (opc1) {
            case 1:
                CharlonQ4Arq3 novo = new CharlonQ4Arq3(movel.getEndereço(), movel.getPreco(), 300);
                novo.RelatorioN();
                break;
            
            case 2:
            CharlonQ4Arq2 old = new CharlonQ4Arq2(movel.getEndereço(), movel.getPreco(), 120);
            old.RelatorioV();
            break;

            default:
            System.out.println("Valor invalido");
            break;

        }in.close();
    }
}