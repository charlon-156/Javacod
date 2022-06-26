package POO.A4; 
 
public class CharlonQ4Arq1 {
    //metodo principal 
    private String endereço;
    private double preco;

    public CharlonQ4Arq1(String rua, double val){
        this.endereço = rua;
        this.preco = val;
    }

    //get e set
    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}