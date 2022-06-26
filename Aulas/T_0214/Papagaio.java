package Aulas.T_0214;
public class Papagaio extends Ave{
    public Papagaio(String nome) {
        super(nome);
        
    }

    public void falar(){
        System.out.println(getNome() +": Seu corno!");
    }
}
