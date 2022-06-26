package POO.A4; 
 
public class CharlonQ2Arq7 extends CharlonQ2Arq4 {
    private double dinheiro;

    //classe rico
    CharlonQ2Arq7(String n, int i, double v) {
        super(n, i);
        this.dinheiro = v;
    }
    
    //metodo comprar
    public void Compras(double valor){
        System.out.println(getNome()+", Compra de "+valor+ " R$ feita ^-^ ");
        System.out.println("Você tinha: "+getDinheiro());
        setDinheiro(getDinheiro()-valor);
        System.out.println("E ficou com "+getDinheiro());     
    }

    //get e set
    public double getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
