//Developer: Luanderson Meira De Medeiros

import java.util.*;

public class TesteQ4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //recolhimento dos dois numero digitados pelo usuario

        System.out.println("Efetuando divisão \nDigite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();

        
        //metodo try catch para lancar excessoes


        //try vai analisar as sentencas dentro do seu bloco
        try {
            int resultado = n1 / n2;
            System.out.println(resultado);
            //supondo o segundo numero sendo 0, um erro sera lancado
        }
        
        //caso apresente erro, o catch vai lancar a excessao do "AritmeticException"
        catch (ArithmeticException e) {
            
            e.printStackTrace();
            //printStack -> é um metodo do tipo void
            //retorno: java.lang.ArithmeticException: / by zero
            //at Questao4.TesteQ4.main(teste.java:25)

            //ele retorna o tipo do erro; o arquivo e a linha que apresenta defeito
            
            System.out.println(e.getMessage());
            //printStack -> é um metodo do tipo String
            //retorno: / by zero
            
            // este tem um retorno mais sintetico comparado ao anterior
        }
    }
}