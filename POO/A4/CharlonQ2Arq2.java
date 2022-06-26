package POO.A4; 

public class CharlonQ2Arq2 extends CharlonQ2Arq1 {
    //classe cachorro que recebe de animal 

    //construtor de cachorro
    public CharlonQ2Arq2(String n) {
        super(n);   
    }

    //função latir
    public String Late(){
        return getNome() + ": au au au!";
    }
}