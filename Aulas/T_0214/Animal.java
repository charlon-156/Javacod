package Aulas.T_0214;
public class Animal{
    private float altura, peso;
    private int idade;
    private String nome;
    public Animal(String nome){
        this.nome = nome;
    }
    
    public void locomover(){
        System.out.println(this.nome +": Correndo...");
    }

    public void comer(){
        System.out.println(this.nome +": Mastigando");
    }

    public void dormir(){
        System.out.println(this.nome +": ZZzzzzZzzzZZZzz");
    }

    public String getEspecie(){
        return this.getClass().getSimpleName();
    }

    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}