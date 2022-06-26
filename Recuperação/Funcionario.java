//developer: Luanderson Meira De Medeiros

//class abstrata Funcionario
public abstract class Funcionario {

    //variaveis privadas para seguranca de dados. Respeitando o pilar do encapsulamento
    private String nome;
    private double salario;

    //metodo aumentar salario, este metodo sofrera polimorfismo em suas classes filhas
    public void aumentaSalario(){

    }

    //Get's e Set's - seguindo com os principios do encapsulamento
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double s) {
        this.salario = s;
    }
}