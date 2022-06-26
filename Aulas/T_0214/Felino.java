package Aulas.T_0214;
public class Felino extends Animal{
    public Felino(String nome) {
        super(nome);
        
    }
    public void cacar(){
        System.out.println(getNome() +": Caçando...");
    }
    public void ronronar(){
        System.out.println(getNome() +": rrrrrr!");
    }
}
