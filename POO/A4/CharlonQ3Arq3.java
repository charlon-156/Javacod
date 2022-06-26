package POO.A4; 
  
public class CharlonQ3Arq3 extends CharlonQ3Arq1 {

    public CharlonQ3Arq3(double v) {
        super(v);  
    }
    
    @Override
    public void ImprimirDados(){
        System.out.println("O preço do ingresso fica por...: "+(getValor())+" R$");
    }
}