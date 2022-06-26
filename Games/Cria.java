package Games;
import java.util.*;
public class Cria {
    
    String classe;
    int vida;
    int atk;

    public void Person(){
        Scanner in = new Scanner(System.in);
        Dados d1 = new Dados();

    System.out.println("Qual classe você deseja jogar: \n 1-Arqueiro \n2- Guerreiro\n3- Mago\n4- Assassino\n5- Clérigo\n6- Templario");
         classe = in.nextLine();



    switch (classe) {
        case "1":
            System.out.println("\n\n\n\n\n\n\n\nÓtima escolha! Um arqueiro acerta na mosca.\nAgora vamos definir sua vida, jogue o dado.... \n------------------");
            
                vida = 16 + d1.JD1();
                System.out.println("Sua vida é de: "+vida);
                
                atk = 26 + d1.JD2();
                System.out.println("Uma flechada sua tem isso de dano: "+atk+" PV");
                break;

                case "2":
                    System.out.println("\n\n\n\n\n\n\n\nÓtima escolha! Um guerreiro empunha sua espada com bravura.\nAgora vamos definir sua vida, jogue o dado... \n------------------");
                    
                    vida = 21 + d1.JD2();
                    System.out.println("Sua vida é de: "+vida);
                    
                    atk = 19 + d1.JD2();
                    System.out.println("Sua estocada remove "+atk+" PV");
                    break;

                case "3":
                    System.out.println("\n\n\n\n\n\n\n\nÓtima escolha, Um mago tem habilidades magicas imprecionantes.\n Agora vamos definir sua vida, jogue o dado... \n------------------");
                    
                    vida = 17 + d1.JD2();
                    System.out.println("Sua vida é de: "+vida);
                    
                    atk = 23 + d1.JD2();
                    System.out.println("Seu feitiço de ataque tem  "+atk+" pontos de atk");
                    break; 
                    
                case "4":
                    System.out.println("\n\n\n\n\n\n\n\nÓtima escolha, um guerreiro empunha sua espada com bravura.\n Agora vamos definir sua vida, jogue o dado... \n------------------");
                    
                    vida = 12 + d1.JD2();
                    System.out.println("Sua vida é de: "+vida);
                    
                    atk = 28 + d1.JD2();
                    System.out.println("Sua estocada remove "+atk+" PV");
                    break;
                    
                case "5":
                    System.out.println("\n\n\n\n\n\n\n\nÓtima escolha, um guerreiro empunha sua espada com bravura.\n Agora vamos definir sua vida, jogue o dado... \n------------------");
                    
                    vida = 23 + d1.JD2();
                    System.out.println("Sua vida é de: "+vida);
                    
                    atk = 17 + d1.JD2();
                    System.out.println("Sua estocada remove "+atk+" PV");
                    break;

                case "6":
                    System.out.println("\n\n\n\n\n\n\n\nÓtima escolha, um guerreiro empunha sua espada com bravura.\n Agora vamos definir sua vida, jogue o dado... \n------------------");
                    
                    vida = 28 + d1.JD2();
                    System.out.println("Sua vida é de: "+vida);
                    
                    atk = 12 + d1.JD2();
                    System.out.println("Sua estocada remove "+atk+" PV");
                    break;

                default: System.out.println("ERRO  #_#");break;
        }in.close();
    } 

    public void Cap1(){
        
    }
}
