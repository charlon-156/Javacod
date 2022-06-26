package POO.A4; 
 
public class CharlonQ4Arq3 extends CharlonQ4Arq1 {
    
    private double taxaNovo;
    
    public void RelatorioN(){
        System.out.println("Casa Nova ^-^");
        System.out.println("Endereço: "+getEndereço());
        System.out.println("\nValor Inicial: "+getPreco()+" R$");
        System.out.println("Valor adicional: "+getTaxaNovo()+" R$");
        System.out.println("Valor Total: "+(getPreco()+getTaxaNovo())+" R$");
        
    }
    public CharlonQ4Arq3(String rua, double val, double adic) {
        super(rua, val);
        this.taxaNovo = adic;
    }

    //get e set
    public double getTaxaNovo() {
        return this.taxaNovo;
    }

    public void setTaxaNovo(double taxaNovo) {
        this.taxaNovo = taxaNovo;
    }
}