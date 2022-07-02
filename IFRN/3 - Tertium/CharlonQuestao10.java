  
import java.util.Scanner;
// Faça um algoritmo que solicita ao usuário a idade de um nadador e exibe uma mensagem com a idade e a categoria desse nadador de acordo com a tabela abaixo:
public class CharlonQuestao10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Classicação de nadador, por idade");
        System.out.println("Digite sua idade:");
        int idade = in.nextInt();

        System.out.println("");
        if(idade>=18){
            System.out.println("você tem "+idade+" anos, Categoria Adulto");
        }else if(idade>=14){
            System.out.println("você tem "+idade+" anos, Categoria Juvenil B");
        }else if(idade>=11){
            System.out.println("você tem "+idade+" anos, Categoria Juvenil A");
        }else if(idade>=8){
            System.out.println("você tem "+idade+" anos, Categoria Infantil B");
        }else if(idade>=5){
            System.out.println("você tem "+idade+" anos, Categoria Infantil A");
        }else{
            System.out.println("você tem "+idade+" anos, não pode participar de nenhuma categoria");
        }
in.close();
    }
}
