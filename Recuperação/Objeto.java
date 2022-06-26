//classe Objeto

public class Objeto {

    //atributos do tipo String, já que o usuario vai informar ao sistema
    private String nome;
    private String sobrenome;
    private String titulo;
    private String apelido;
    private String email;
    
    //construtor
    public Objeto(String nome, String sobrenome, String titulo, String apelido, String email){
        setNome(nome);
        setSobrenome(sobrenome);
        setTitulo(titulo);
        setApelido(apelido);
        setEmail(email);
    }

    //get e set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
