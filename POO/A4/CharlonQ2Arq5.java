package POO.A4; 

public class CharlonQ2Arq5 extends CharlonQ2Arq4 {
    //construtor
    CharlonQ2Arq5(String n, int i) {
        super(n, i);        
    }

    //metodo exclusivo de miseravel
    public void Mendiga(){
        System.out.println(getNome()+" está mendigando"); 
    }
}