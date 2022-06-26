

//classe concreta Progamador que extende de Funcionario(abstract)
public class Gerente extends Funcionario {
    
    //modificação do metodo aumenta salario
    public void aumentaSalario(){
        double porcentagem = getSalario() * 0.1;
        setSalario(getSalario() + porcentagem);
        System.out.println("Novo salario:" + getSalario());
        
    }

    //construtor de Gerente
    public Gerente(String nome, double salario){
        setSalario(salario);
        setNome(nome);
    }
}