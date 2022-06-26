package Aulas.A_0111;
public class Lampada{
    //Craição de todas as variaveis privates da lâmpada
    private String tipo;
    private String cor;
    private String marca;
    private double voltagem;
    private double preço;
    private double potência;
    private boolean acao;
    
    //*******************************************************//
    // Inicio da Sequência de Getter e Setter da Classe Lâmpada

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public double getVoltagem() {
        return this.voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getPreço() {
        return this.preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getPotência() {
        return this.potência;
    }

    public void setPotência(double potência) {
        this.potência = potência;
    }

    public boolean isAcao() {
        return this.acao;
    }

    public void setAcao(boolean acao) {
        this.acao = acao;
    }
    //*******************************************************//
    // Fim da Sequência de Getter e Setter da Classe Lâmpada


    
    //Método Constructor com todos seus atributos;
    public Lampada(String tipo, String cor, String marca, double voltagem, double preço, double potência, boolean ação){
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.voltagem = voltagem;
        this.preço = preço;
        this.potência = potência;
        this.acao = ação;
    }

    public String toString(){
        return "tipo: "+tipo+"\ncor:"+cor+"\nmarca:"+marca+"\nvoltagem: "+voltagem+" V\nPreço: "+preço+" R$\nPotência: "+potência+" W\nStatus: "+acao;
    }

    //função para ascender a lâmpada;
    public void Ascender(){
        acao = true;
    }
    //função para apagar a lâmpada;
    public void Apagar(){
        acao = false;
    }

}