package Aulas.B_0104;
public class Pessoa {
    private String nome, data;
    private double altura;

    public String getNome(){
        return nome;
    }
    public String getData(){
        return data;
    }
    public double getAltura(){
        return altura;
    }

    public void setNome(String n){
        this.nome = n;
    }
    public void setData(String d){
        this.data = d;
    }
    public void setAltura(double a){
        this.altura = a;
    }

    void Status(){
        System.out.println("\n\n<----Informações pessoais---->");
        System.out.println("Nome: "+nome);
        System.out.println("Data de nascimento: "+data);
        System.out.println("Altura: "+altura+" metros");
    }

    public void Idade(){
        String [] corta = data.split("/");
        int age = Integer.parseInt(corta[2]);

        System.out.println("\n");
        System.out.println(nome+", Você tem "+(2021-age)+" anos");
        
    }
}