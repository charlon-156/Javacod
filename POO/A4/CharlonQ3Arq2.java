package POO.A4; 
   
public class CharlonQ3Arq2 extends CharlonQ3Arq1 {
    //classe vip que recebe de ingresso
    private double adicional;
    
    public CharlonQ3Arq2(double vip, double adicional) {
        super(vip);
        this.adicional = adicional;
    }
    
    public void ImprimirVip(){
        System.out.println("O preço do ingresso vip é "+(getValor()+adicional)+" R$");
    }

    //get e set
    public double getAdicional() {
        return this.adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    } 
}