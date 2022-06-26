package POO.A4;

public class CharlonQ2Arq1 {
    //classe mãe 
    private String nome;
    private String raca;

    //construtor 1
    public CharlonQ2Arq1(){
        this.nome = "Lery";
    }

    //polimorfismo do const. 
    public CharlonQ2Arq1(String n){
        this.nome = n;
    }

    public String Caminha(){
        return getNome() + " está caminhando";
    }

    //get e set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}