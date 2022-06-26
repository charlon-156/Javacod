//uso da classe abstrata já que não existe um "veiculo", os meios de transporte vão receber essas caracteristicas
//usando abstract Veiculo não pode ser estanciado 

public abstract class Veiculo {

    //seguindo o primeiro pilar de POO: atributos privados
    private String material;
    private String tipoDoCombustivel;
    private double kmPorHora;
    private int capacidade;
    private boolean motor;

    //metodo que todas as classes filhas vão herdar e polimorfar com suas devidas informações
    public void mover(){

    }
    
    //get e set
    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoDoCombustivel() {
        return this.tipoDoCombustivel;
    }

    public void setTipoDoCombustivel(String tipoDoCombustivel) {
        this.tipoDoCombustivel = tipoDoCombustivel;
    }

    public double getKmPorHora() {
        return this.kmPorHora;
    }

    public void setKmPorHora(double kmPorHora) {
        this.kmPorHora = kmPorHora;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean getMotor() {
        return this.motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

}
