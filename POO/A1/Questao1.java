package POO.A1;

/*
Defina uma estrutura de dados para agrupar e representar os dados de um automóvel
(marca do fabricante, modelo, ano de fabricação e quantidade máxima de passageiros).
Essa questão já foi trabalhada em sala de aula. Quem fez na sala, acrescenta a
descrição de como fez para resolvê-la.
*/ 

import java.util.Scanner;
    public class Questao1{
     public static void main(String[] args) {
         // Primeiro criei o scanner para armazenar e imprimir os dados que foram atribuídos abaixo. Utilizei String como tipo variável para os atributos de marca e modelo, e utilizei o tipo de variável int para ano de fabricação e quantidade de passageiros.
            Scanner in = new Scanner(System.in);
            String marca = in.nextLine();
            String modelo = in.nextLine();
            int ano = in.nextInt();      
            int passageiros = in.nextInt();

            // É depois adicionei o System para imprimir todos os dados em um único espaço, algo que facilita bastante pelo fato da correria do dia a dia. Possibilitando todas as informações estarem em lugar só.
            System.out.println("Marca do Fabricante: "+marca+ "\nModelo: "+modelo+ "\nAno de fabricação: "+ano+ "\nNúmero de passageiros: "+ passageiros);
        in.close();
        }
    }
