package POO.A4;

public class CharlonQ1Arq1 {
    //classe mãe 
    private int matricula;
    private String nome;
    private float salario;

    //metodo de exibir dados primario
    public void exibirDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Matrícula: "+getMatricula());    
    }
    
    //get e set
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public float getSalario() {
        return this.salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    } 
}