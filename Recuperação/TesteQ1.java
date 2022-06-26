//Developer: por Luanderson Meira De Medeiros

import java.util.*;

public class TesteQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //simulando o recolhimento de dados
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();
        System.out.println("Digite seu: titulo ");
        String titulo = sc.next();
        System.out.println("Digite seu apelido: ");
        String apelido = sc.next();
        System.out.println("Digite seu email: ");
        String email = sc.next();
        
        //depois de clicar no botao
        Objeto c1 = new Objeto(nome, sobrenome, titulo, apelido, email);
        System.out.println("Objeto criado com sucesso");
        
    }
}
