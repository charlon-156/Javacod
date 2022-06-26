//developer: Luanderson Meira De Medeiros

//Polimorfismo é um dos pilares de POO, princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse
//podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos,
//especializados para cada classe derivada, usando para tanto uma referência 
//a um objeto do tipo da superclasse.

//Ex: classe VeAereo tem o metodo mover, só que ele voa,
//a classe VeAquatico tem o metodo mover tambem, só que ele vai ativar a função de navegar

import java.util.*;
public class ListaVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        String nome;

        //array list para operar com cada um dos tipos de veiculos
        ArrayList terrestre = new ArrayList();
        ArrayList aereo = new ArrayList();
        ArrayList aquatico = new ArrayList();

            aereo.add("Jato");
            aquatico.add("Encouraçado");
            terrestre.add("Carreta");

        //menu
        do {
            System.out.println("\n1- imprimir veiculos\n2- adicionar\n3- remover\n4-sair");
            escolha = sc.nextInt();
            
            //imprimir dados
            if (escolha==1) {
                System.out.println("Veiculos Terrestres: "+terrestre);
                System.out.println("Veiculos Aereos: "+aereo);
                System.out.println("Veiculos Aquaticos: "+aquatico);
            
            //adicionar veiculos
            } else if (escolha==2) {
                System.out.println("Qual tipo de veiculo deseja adicionar:\n1-Terrestre\n2-Aereo\n3-Aquatico");
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1: 
                    nome = sc.next();
                    terrestre.add(nome);
                        break;

                    case 2: 
                    nome = sc.next();
                    aereo.add(nome);
                        break;

                    case 3:
                    nome = sc.next();
                    aquatico.add(nome);
                        break;
                }
            
            //remover veiculos
            } else if (escolha == 3){
                System.out.println("Qual tipo de veiculo deseja remover:\n1-Terrestre\n2-Aereo\n3-Aquatico");
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1: 
                        System.out.println("\n"+terrestre+"\nescreva o nome:");
                        nome = sc.next();
                        terrestre.remove(nome);
                        break;

                    case 2:
                        System.out.println("\n"+aereo+"\nescreva o nome:");
                        nome = sc.next();
                        aereo.remove(nome);
                        break;

                    case 3:
                    System.out.println("\n"+aquatico+"\nescreva o nome:");
                    nome = sc.next();
                    aquatico.remove(nome);
                        break;
                }
            }
        } while (escolha!=4);
    }
}