package Aulas.A_0111;

public class Caneta {
    String cor, marca, tamanho;

    public Caneta(String c, String m, String t){
        this.cor = c;
        this.marca = m;
        this.tamanho = t;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String toString(){
        return "Caneta é da cor "+cor+"\nda marca "+marca+"\ndo tamanho: "+tamanho;
    }


}
