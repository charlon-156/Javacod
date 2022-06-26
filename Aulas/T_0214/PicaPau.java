package Aulas.T_0214;
public class PicaPau extends Ave{    
    private String time;

    
    public PicaPau(String nome, String time){
        super(nome);
        this.time = time;
    }

    public void jogarBola(){
        System.out.println(getNome() +": Jogando bola pro "+this.time);
    }

}
