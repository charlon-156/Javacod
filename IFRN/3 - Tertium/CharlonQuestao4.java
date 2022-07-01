package IFRN.Tertium;
import java.util.Scanner;

//Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

public class CharlonQuestao4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("<<<<< Conversor de dinheiro >>>>>");
        System.out.println("qual moeda quer converter?");
        System.out.println(" ");
        System.out.println("1-Dolar");
        System.out.println("2-Real");
        System.out.println("");
         
        int escolha = in.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Converter Dolar, digite a quantidade: ");
                double dolar = in.nextDouble();

                System.out.println(" ");
                System.out.println("Cotação do Dolar:");
                double cotação = in.nextDouble();
                double result1 = dolar * cotação;

                System.out.println(" ");
                System.out.println("Valor em Real: "+result1+" R$");
                System.out.println("Valor da cotação: "+cotação);
                System.out.println("Valor em Dolar: "+dolar+" US$");
                break;
                
            case 2:
                System.out.println("Converter Real, digite a quantidade: ");
                double real = in.nextDouble();

                System.out.println(" ");
                System.out.println("Cotação do Real:");

                double cotação1 = in.nextDouble();
                double result2 = real / cotação1;

                System.out.println(" ");
                System.out.println("Valor em Real: "+real+" R$");
                System.out.println("Valor da cotação: "+cotação1);
                System.out.println("Valor em Dolar: "+result2+" US$");break;

        }
        in.close();    
    }
}