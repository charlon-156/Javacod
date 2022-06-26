package Aulas.T_0214;
public class Ave extends Animal{
    
    public Ave(String nome) {
        super(nome);
        
    }
    
    private float tamanhoDaAsa;
    
    @Override
    public void locomover(){
        System.out.println(getNome() +": Voando...");
    }

    public void botarOvo(){
        System.out.println(getNome() +": Ovo saindo no capricho...");
    }
    
    public float getTamanhoDaAsa() {
        return tamanhoDaAsa;
    }
    public void setTamanhoDaAsa(float tamanhoDaAsa) {
        this.tamanhoDaAsa = tamanhoDaAsa;
    }

}
