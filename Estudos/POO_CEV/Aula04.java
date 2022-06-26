package Estudos.POO_CEV;
//metodo get e set
//get -> acessar
//set -> modificar
//construct

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC","Amarela", 0.3);

        
        c1.setModelo("bic");
        c1.setPonta(0.5f);
        c1.Status();
        

        c1.Status();
    }
}