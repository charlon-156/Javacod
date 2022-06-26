package Estudos.POO_CEV;

public class Caneta {
    public String modelo;
    private String cor;
    private double ponta;
    public boolean tampada;

    public Caneta( String m, String c, double p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public double getPonta(){
        return this.ponta;
    }

    public void setPonta(double p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }



    public void Status(){
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Ponta: "+ getPonta());
        System.out.println("Cor: "+ cor);
        System.out.println("Tampada? "+ tampada);
        
        
        
    }
}
