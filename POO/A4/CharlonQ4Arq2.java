package POO.A4; 
 
public class CharlonQ4Arq2 extends CharlonQ4Arq1 {
    private double descontOld;
    
    public void RelatorioV(){
        System.out.println("Casa Velha O_O ");
        System.out.println("Endereço: "+getEndereço());
        System.out.println("\nValor Inicial: "+getPreco()+" R$");
        System.out.println("Valor adicional: "+getDescontOld()+" R$");
        System.out.println("Valor Total: "+(getPreco()-getDescontOld())+" R$");
        
    }
    public CharlonQ4Arq2(String rua, double val, double desc) {
        super(rua, val);
        this.descontOld = desc;
    }

    //get e set
    public double getDescontOld() {
        return this.descontOld;
    }

    public void setDescontOld(double descontOld) {
        this.descontOld = descontOld;
    }
}