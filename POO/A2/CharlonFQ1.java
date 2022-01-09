package POO.A2;
import java.util.*;

public class CharlonFQ1 {

        public static void Add(int []valor, int []quant, int caixa){
            Scanner in = new Scanner(System.in);
                
                //system's para pedir o produto e o N° de produtos que foi comprado pelo mercado
                System.out.println("Escolha o produto para ser adicionado: \n1-Doce\n2-Pão\n3-Chocolate\n4-Café");
                int escolha = in.nextInt();
                System.out.println("\n\n\nInsira o N° de produtos adquiridos para o estoque");
                int n = in.nextInt();
    
                quant[escolha] += n; // quant = quant + n; 
                caixa -= valor[escolha] * n;// caixa = caixa - n;
    
                //estruta de codigos para imprimir o saldo do mercadinho
                System.out.println("\n\n\n-------Saldo do mercado-------");
                for (int i = 1; i < 5; i++) {   //laço de repetição para imprimir o saldo

                    System.out.println("Temos "+quant[i]+" peças do produto "+i+ " Que custa "+valor[i]+" R$");

                }
                //imprimindo valor final 
                System.out.println("O caixa ficou com: "+caixa+" R$");
                in.close();
            }
    
        public static void Vend(int []valor, int []quant, int caixa){ //metodo para calcular a venda
            Scanner in = new Scanner(System.in);
    
            //system's para pedir o produto e o N° de produtos que foi vendido pelo mercado
            System.out.println("Escolha o produto que foi vendido: \n1-Doce\n2-Pão\n3-Chocolate\n4-Café");
            int escolha = in.nextInt();
            System.out.println("Insira o N° de exemplares vendidos");
            int n = in.nextInt();
    
            //metodo para calcular os valores p.s - isso é o inverso da anterior
            quant[escolha] -= n; //quant = quant - n; 
            caixa += valor[escolha] * n; //// caixa = caixa - n;
    
            //estruta de codigos para imprimir o saldo do mercadinho
            System.out.println("\n\n\n-------Saldo do mercado-------");
            for (int i = 1; i < 5; i++) {
                System.out.println("Temos "+quant[i]+" peças do produto "+i+ " Que custa "+valor[i]+" R$");
            }
            System.out.println("O caixa ficou com: "+caixa+" R$");
    
        in.close();
        }
    
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //registro das variaveis: valor, quant e caixa.
        int [] valor = {0, 1, 2, 3, 4};
        int [] quant = {0, 6, 8, 10, 12};
        int caixa = 200; 

        System.out.println("Digite a operação: \n1- Adição no estoque\n2-Venda de produto\n\n\n");
            int opção = in.nextInt();

            //if else para definir os parametros de cada metodo
            if (opção==1) {
                Add(valor, quant, caixa); 
            
            }else if(opção==2) {
                Vend(valor, quant, caixa);

            } else{
            System.out.println("ERRO, valor invalido");
            
        }
   in.close(); }
}

/*- Faça um programa que simule o sistema de um mercado. Determine um conjunto de produtos que terá no seu mercado 
e estabeleça dois vetores, um de preço e um de quantidade no estoque, que contenham as informações dos produtos. 
Crie uma variável que represente o dinheiro no caixa com um valor inicial que desejar. 
Leia um inteiro na função principal que corresponde à ação que se deseja fazer 

(1 - adicionar ao estoque, em caso de compra de um fornecedor, e 
2 - retirar do estoque, em caso de venda a um cliente). 

Faça uma função que implemente cada um desses casos. Ambas as funções devem receber os vetores de preço e quantidade,
assim como o dinheiro no caixa, através de passagem por valor.Elas também devem imprimir um menu com os produtos, 
cada produto representado por um número. Depois que for lido o inteiro do produto escolhido, será lido a quantidade 
comprada ou vendida. Caso seja a função da opção 1, esse valor será adicionado à quantidade no estoque e o dinheiro 
em caixa será decrementado de acordo com o preço do produto e a quantidade comprada. Caso seja a opção 2, a quantidade 
no estoque será diminuída, mas o dinheiro no caixa será incrementado.
Exemplo de menu:

Escolha o produto desejado:
(1) - Arroz
(2) - Feijão
(3) - Biscoito
(4) - Molho de tomate */