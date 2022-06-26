package POO.A4; 

public class CharlonQ3Arq5 extends CharlonQ3Arq2 {
    //classe vip inferior que recebe de Vip
    public CharlonQ3Arq5(double vip, double adicional) {
        super(vip, adicional);  
    }

    //imprimir vip
    @Override
    public void ImprimirVip(){
        System.out.println("O preço do ingresso vip com o é "+(getValor()+getAdicional())+" R$");
        System.out.println("Local: terreo(inferior)");
    }
}