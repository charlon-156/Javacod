package POO.A5;

public class Quest02Charlon_Arq01 {

    //Classe-mae

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String whatsapp;

    //Metodo para avaliar dados
   /*
    *throws para chamar a excessao que eu proprio criei
    * else dispara uma mensagem de erro
    */
    public void validar(String cpf, int tamanho) throws Quest02Charlon_Expetion{
        boolean p = (cpf.chars().filter(ch -> ch != ' ').count() == tamanho);
        if (p) {
            
        } else {
            throw new Quest02Charlon_Expetion();
        }
    }

    //get e set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return this.whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }


}
