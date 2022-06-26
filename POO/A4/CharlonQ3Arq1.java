package POO.A4; 
    
public class CharlonQ3Arq1 {
    //classe central - ingresso
    private double valor;

    public CharlonQ3Arq1(double v){
        this.valor = v;
    }
    
    public void ImprimirDados(){
        System.out.println("O preço do ingresso fica por...: "+(getValor())+" R$");
    }

    //get e set
    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}