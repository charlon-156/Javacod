package POO.A3;
import java.util.*;

public class ElevadorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Elevador c1 = new Elevador(); //estanciamento 
        int escolha; 
        
        //dei a liberdade do usario informar o total de andares e a capacidade, nem todo elevador cabe o mesmo tanto e nem todo prédio tem o mesmo N° de andares
        System.out.println("Primeiramente, digite o total de andar nesse predio: ");
        c1.setTotalAndar(in.nextInt());
        System.out.println("Agora, digite o número de pessoas que o  elevador suporta: ");
        c1.setTotalCapacidade(in.nextInt());
        
        //sistema de operação para que o usario posso executar n ações em uma única execução 
        do {
        System.out.println("\n1- Adicionar Pessoa");
        System.out.println("2- Remover Pessoa");
        System.out.println("3- Subir um andar");
        System.out.println("4- Descer um andar");
        System.out.println("5- Sair\n");
        
        escolha = in.nextInt();
        
        //sistema de codição para selecionar a ação
        switch (escolha) {
            case 1:
                c1.AcrescentarPessoa();
                break;

            case 2:
                c1.RemoverPessoa();
                break;

            case 3:
                c1.Subir();
                break;

            case 4:
                c1.Descer();
                break;

            case 5: 
                break;

            default:
                System.out.println("Função invalida!!");
                
        }
        } while (escolha!=5); //final do DoWhile
        in.close();
    }
}
