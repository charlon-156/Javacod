package POO.A4; 
 
public class CharlonQ2Arq4{
	//classe principal - pessoa
    private String nome;
    private int idade;

    CharlonQ2Arq4(String n, int i){
        this.nome = n;
        this.idade = i;
    }

	//get e set
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}