package POO.A5;

//developer @charlon_fernandes
//Charlon Fernandes Monteiro

public class Quest01Charlon{

   /* Inicial criei 5 atributos privados - (nome, sexo, corCabelo, idade e pesoKg).
    *
    * Esses atributos devem ser privados para a proteção de dados do usuario e do sistema
    * Cada variavel responde ao paradigma de ENCAPSULAMENTO, pois os valores estão em capsulas com acesso restrito
    */

    private String nome;
    private String sexo;
    private String corCabelo;
    private int idade;
    private double pesoKg;



   /* Criação do Metodo libra(), do tipo double, que recebe peso em quilograma por parametro
    *
    * Essa funcao tem a finalidade de converter um peso em Quilogramas, padrao do SI, para Libras
    * O peso é multiplacado por 2.205 - o resultado eh armazenado em double libra
    * por não ser uma metodo do tipo void, libra() tem o comando "return" que retorna o valor de libra
    */
    public double libra(double pesoKg){
        double libra = pesoKg * 2.205;
        return libra;
    }  



   /* Criacao do metodo Status
    * 
    * Esse metodo tem o objetivo de imprimir no prompt de comando os dados de todas as variaveis
    * StatusPessoa() é do tipo voi, por isso não apresenta retorno.
    */
    public void StatusPessoa(){
        System.out.println("----Dados Pessoais----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Cor do Cabelo: " + this.corCabelo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso(kg) :" + this.pesoKg);
    }



   /* Bloco de Getters e Setters
    *   
    * Os get e set são de funcoes de extrema importancia para a seguranca e o encapsulamentos do codigo. 
    * Eles permitem que o usario acesse/modifique os valores das variaveis do tipo "private"
    */
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorCabelo() {
        return this.corCabelo;
    }
    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }
    public void setPeso(double peso) {
        this.pesoKg = peso;
    }
}