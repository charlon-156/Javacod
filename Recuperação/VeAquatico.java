//herdando de veiculo Veiculo Aquatico é uma classe concreta

public class VeAquatico extends Veiculo {
    private int quantHelice;
    private boolean remo;
    private double capacidade_carga;

    public void mover(){
        navegar();
    }

    private void navegar() {
        System.out.println("Navegando");
        
    }

    public int getQuantHelice() {
        return this.quantHelice;
    }

    public void setQuantHelice(int quantHelice) {
        this.quantHelice = quantHelice;
    }

    public boolean getRemo() {
        return this.remo;
    }

    public void setRemo(boolean remo) {
        this.remo = remo;
    }

    public double getCapacidade_carga() {
        return this.capacidade_carga;
    }

    public void setCapacidade_carga(double capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }
}
