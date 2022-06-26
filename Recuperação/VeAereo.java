//Veiculo aereo herda da classe-mãe "Veiculo"(abstrata)
public abstract class VeAereo extends Veiculo {
    
    //essas são atributos privados exclusivos de Veiculos Aereos
    private double tamanhoAsas;
    private int numDeRodasDePouso;
    private boolean superSonico;

    
    //polimorfismo do metodo mover, quando a aeronave começar a se mover ela vai decolar
    public void mover(){
        decolar();

    }
    
    //metodo exclusivo de veiculos aereos
    public void decolar(){
        System.out.println("Voando");
    }


    //get e set para atender as nessecidades dos atributos privativos
    public double getTamanhoAsas() {
        return this.tamanhoAsas;
    }

    public void setTamanhoAsas(double tamanhoAsas) {
        this.tamanhoAsas = tamanhoAsas;
    }

    public int getNumDeRodasDePouso() {
        return this.numDeRodasDePouso;
    }

    public void setNumDeRodasDePouso(int numDeRodasDePouso) {
        this.numDeRodasDePouso = numDeRodasDePouso;
    }

    public boolean getSuperSonico() {
        return this.superSonico;
    }

    public void setSuperSonico(boolean superSonico) {
        this.superSonico = superSonico;
    }
}
