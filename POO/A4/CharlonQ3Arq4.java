package POO.A4; 
 
public class CharlonQ3Arq4 extends CharlonQ3Arq2{
    //class vipSuperior 
    private double taxaAdional;

    public CharlonQ3Arq4(double vip, double adicional, double taxa) {
    super(vip, adicional);
    this.taxaAdional = taxa;
    }

    public void ImprimirDados(){
        System.out.println("Local: salão superior");
        System.out.println("Valor do ingresso: "+(getValor()+getAdicional()+taxaAdional)+" R$");  
    }

    //get e set
    public double getTaxaAdional() {
    return this.taxaAdional;
    }

    public void setTaxaAdional(double taxaAdional) {
    this.taxaAdional = taxaAdional;
    }      
}