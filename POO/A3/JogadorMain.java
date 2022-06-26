package POO.A3;
import java.util.*;

public class JogadorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jogador c1 = new Jogador(); //estanciamento

        //system para pedir valores acompanhados de set para alterarem as variaveis privadas
        System.out.println("Informe seu nome completo: ");
        c1.setNome(in.nextLine());

        System.out.println("Digite sua posição: defesa, meio-campo ou atacante? ");
        c1.setPosition(in.nextLine());

        System.out.println("Digite a data de nascimento -> (dd/MM/yyyy): ");
        c1.setNascimento(in.nextLine());

        System.out.println("Digite a nascionalidade: ");
        c1.setNacionalidade(in.nextLine());

        System.out.println("Digite a altura: ");
        c1.setAltura(in.nextDouble());

        System.out.println("Digite o peso: ");
        c1.setPeso(in.nextDouble());
        
        //chamada das funções
        c1.Status();
        c1.Idade();
        c1.INSS();
        
        in.close();
    }
}
