package Aulas.A_0111;

import java.util.*;
public class CanetaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //criação e atribuição dos valores: COR, MARCA e TAMANHO nos objetos
        Caneta c1 = new Caneta("Azul","Bic" ,"7mm");
        Caneta c2 = new Caneta("Verde", "Cib", "5mm");

        //ToString para retornar os atributos ao usuario
        System.out.println(c1.toString());
        System.out.println("");
        System.out.println(c2.toString());
        
        in.close();
    }
}
