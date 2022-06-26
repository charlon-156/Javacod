package POO.A4;

public class CharlonQ1Arq4 extends CharlonQ1Arq3 {
    //classe assistente administativo recebe de assistente

    private String turno;

    //construtor
    public CharlonQ1Arq4(int m, String n) {
        super(m, n);   
    }
    
    //metodo de pagamento - bônus caso o turno seja noturno
    
    public void pagamento( float sal, float bonus){
        if(turno.equalsIgnoreCase("noturno")){
            setSalario(sal + bonus);
        } else {
            setSalario(sal);
        }
    }

    //get e set
    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}