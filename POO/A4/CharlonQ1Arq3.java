package POO.A4;

public class CharlonQ1Arq3 extends CharlonQ1Arq1 {
    //classe assistente recebe de fucionario

    //construtor
    public CharlonQ1Arq3(int m, String n){
        setNome(n);
        setMatricula(m);
    }

    //metodo exibirDados sobreescrito
    @Override
    public void exibirDados(){
        System.out.println("Nome do Assistente: "+getNome());
        System.out.println("Matrícula do Assistente: "+getMatricula());  
    }
    
    //metodo de pagamento
    public void pagamento(float sal){
        setSalario(sal);
    }
}