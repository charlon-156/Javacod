package IFRN.Tertium;
import java.util.Scanner;
//Faça um algoritmo que verifique se um valor é perfeito ou não. Um valor é dito perfeito quando ele é igual a soma dos seus divisores excetuando ele próprio. (Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são seus divisores). Seu algoritmo deve mostrar o número e a mensagem informando se ele é perfeito ou não.
public class CharlonQuestao8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero para verificar se ele é perfeito: ");  
        int x = in.nextInt();  
        int soma = 0, n = 0;
        in.close();
        
        for (n = 1; n < x; n++) {  
    	    int numero = x%n;       	 
    	
            if (numero==0) {
    	        soma += n;
    	    }
        }
    if (soma == n) {  
        System.out.println("É perfeito.");  
    }else {
        System.out.println("Não é perfeito");
        }
        
    }
}

