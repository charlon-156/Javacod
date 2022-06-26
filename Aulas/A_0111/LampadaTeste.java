package Aulas.A_0111;
public class LampadaTeste { 
    public static void main(String[] args) {
    
    //foi criada duas lampadas, cada uma com suas caracteristicas 
    Lampada c1 = new Lampada("Led","Vermelha","Tesla", 220, 12, 15, true);
    Lampada c2 = new Lampada("Florecente","Azul","Beijamin-Franklin", 110, 10, 20, false);
    
        //Chamando metodo ToString para os dois objetos
        System.out.println(c1.toString());
        System.out.println("\n"+c2.toString());
        
    //Sistema de condições para definir quem tem maior potência
    if (c1.getPotência() > c2.getPotência()) {
        System.out.println("A lampada 1 tem mais potência que a 2;");
    
    } else if (c2.getPotência() > c1.getPotência()){
        System.out.println("A lampada 2 tem mais potência que a 1;");

    } else{
        System.out.println("Tem a mesma potência!");
        
    }

    //Condições para analisar pgetPreço das lampadas
    if (c1.getPreço() > c2.getPreço()) {
        System.out.println("A lampada 1 é mais cara que 2;");
    
    } else if (c2.getPreço() > c1.getPreço()){
        System.out.println("A lampada 2 é mais cara que a 1;");
        
    } else {
        System.out.println("Tem o mesmo pgetPreço!!");
        
    }

    }
}
