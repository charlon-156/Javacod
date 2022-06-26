package Aulas.T_0214;
public class Gato extends Felino{
    public Gato(String nome) {
        super(nome);
        
    }
    private String dono;
    public void cuspirBolaPelo(){
        System.out.println(getNome() +": Pfft!");
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
}
