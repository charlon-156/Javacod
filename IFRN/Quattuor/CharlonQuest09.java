package IFRN.Quattuor;
import java.util.Scanner;
public class CharlonQuest09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: entre 1000 e 1999");
        int n = in.nextInt();
        int soma = 0;
        int c = 1;
        int c2= 1;
        int conta = 0;
        in.close();

        if(n<1000||n>1999){
            System.out.println("Você escreveu um valor invalido, tente novamente.");
        }else{
        
            for(c=1;c<=n;c++){
                soma = soma + c;
            }
            for(c2=1;c2<=n;c2++){
                if(c2%11==5){
                    conta = conta + 1;
                }
            }
            System.out.println(" ");
            System.out.println("Média aritmética: "+soma/n);
            System.out.println("Valores Positivos: "+n);
            System.out.println("Número divididos por 11 resta 5: "+conta);
            System.out.println("Valores Negativos: 0");
            
        }
    }
}