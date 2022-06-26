//Veiculo terrestre herda da classe-mãe "Veiculo"(abstrata)
public  class VeTerrestre extends Veiculo{
    //atributos exclusivos de Veiculo Terrestre
    private int nDePneus;
    private int nDefarol;
    private String placa;

    //polimorfismo do metodo mover, o veiculo terrestre for se mover ela vai comecar a andar
    public void mover(){
        andarNochao();
    }

    public void andarNochao(){
        System.out.println("Andando");
    }

    //get e set para acessar e/ou modificar os valores dos atributos
    public int getNDePneus() {
        return this.nDePneus;
    }

    public void setNDePneus(int nDePneus) {
        this.nDePneus = nDePneus;
    }

    public int getNDefarol() {
        return this.nDefarol;
    }

    public void setNDefarol(int nDefarol) {
        this.nDefarol = nDefarol;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}