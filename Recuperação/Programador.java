

//classe concreta Progamador que extende de Funcionario(abstract)
public class Programador extends Funcionario {

    //modificação do metodo aumenta salario
    public void aumentaSalario(){
        double porcentagem = getSalario() * 0.2;
        setSalario(getSalario() + porcentagem);
        System.out.println("Novo salario:" + getSalario());

    }

    //construtor de Programador
    public Programador(String nome, double salario){
        setSalario(salario);
        setNome(nome);
    }
}