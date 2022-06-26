package POO.A4;

public class CharlonQ1Arq5 extends CharlonQ1Arq3{
    //classe assistente  recebe de assistente

    //construtor
    public CharlonQ1Arq5(int m, String n) {
        super(m, n);
    } 

    //metodo de pagamento - recebe sálario e 
    public void pagamento(float sal, float bonus){
        setSalario(sal + bonus);
    }
}