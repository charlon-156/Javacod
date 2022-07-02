 
import java.util.*;
public class AtividadeCharlon12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome [] = new String[50];
        double preco [] = new double[50];
        double custo [] = new double[50];
        double lucro [] = new double[50];


        for (int i = 0; i < nome.length; i++) {
        System.out.println("Digite o nome do produto "+i);
        nome[i] = in.nextLine();
        System.out.println("Digite o custo do produto: "+i);
        custo[i] = in.nextDouble();
        System.out.println("Digite o preco produto: "+i);
        preco[i] = in.nextDouble();

        lucro[i] = ((preco[i]-custo[i])*100)/custo[i];
        in.nextLine();
        }
        in.close();
     
        for (int j = 0; j < custo.length; j++) {
             if (lucro[j]<10) {
                System.out.println(nome[j]+" com menos de 10%: "+lucro[j]);
            }
        }
        for (int j = 0; j < custo.length; j++) {
            if ((lucro[j]<10)||(lucro[j]<30)) {
               System.out.println(nome[j]+" entre 10 e 30 de lucro: "+lucro[j]);
           }
       }
       for (int j = 0; j < custo.length; j++) {
        if (lucro[j]>=30) {
           System.out.println(nome[j]+" mais de 30 de lucro: "+lucro[j]);
            }
        }
    }
}
