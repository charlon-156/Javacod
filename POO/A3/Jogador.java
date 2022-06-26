package POO.A3;
//imports para a minipulação de datas
import java.text.*;
import java.time.*;
import java.util.*;

public class Jogador {
    //criação das variaveis privadas e uma unica variavel public
    //ela é usada apenas para uso interno!!
    private String nome, position, nascimento, nacionalidade;
    private double altura, peso;
    int anos;

    //get e set para TODAS as variaveis do nosso programa
    public String getNome(){
        return nome;
    }
    public String getPosition(){
    return position;
    }
    public String getNascimento(){
        return nascimento;
    }  
    public String getNacionalidade(){
        return nacionalidade;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPosition(String posi){
        this.position = posi;
    }
    public void setNascimento(String nasc){
        this.nascimento = nasc;
    }
    public void setNacionalidade(String naci){
        this.nacionalidade = naci;
    }
    public void setAltura(double altu){
        this.altura = altu;
    }
    public void setPeso(double kilo){
        this.peso = kilo;
    }

    //função para mostrar os dados de cada variavel
    public void Status(){
        System.out.println("--------Dados do jogador-------");
        System.out.println("Nome completo: "+nome);
        System.out.println("Posição em cam "+position);
        System.out.println("Data de nasc.: "+nascimento);
        System.out.println("Nacionalidade: "+nacionalidade);
        System.out.println("Altura em met: "+altura);
        System.out.println("Peso em quilo: "+peso);
        System.out.println("");
        
    }

    public void Idade(){
        //SimpleDateFormat para a formatação de data usada no Brasil
        //Calendar para referenciar o tempo da vida real
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();

        //Classe Data está recebendo as informações de hoje(date de execução do codigo)
        Date hoje = calendario.getTime();

        //A data é convertida para uma string
        String dataformatada = dtf.format(hoje);

        //Usando split a data de nascimento foi dividida e armazenada no vetor nascimento
        //Integer.parseInt para converter String para Int
        String [] nascimento = this.nascimento.split("/");
        int dia = Integer.parseInt(nascimento[0]);
        int mes = Integer.parseInt(nascimento[1]);
        int ano = Integer.parseInt(nascimento[2]);

        //A mesma coisa do bloco passado, só que com a data atual
        String [] dataAtual = dataformatada.split("/");
        int dia2 = Integer.parseInt(dataAtual[0]);
        int mes2 = Integer.parseInt(dataAtual[1]);
        int ano2 = Integer.parseInt(dataAtual[2]);

        //as int(data, mes e ano) foram armazenadas na class LocalDate
        LocalDate atual = LocalDate.of(ano2, mes2, dia2);
        LocalDate nasciment = LocalDate.of(ano, mes, dia);

        //Period - Usado para calcular a DIFERENÇA entre dois espaços de tempo
        Period periodo = Period.between(atual, nasciment);

        //Diferença entre hoje e o nascimento é guardada em int anos
        anos = Math.abs(periodo.getYears());

        System.out.println("O jogador "+nome+" tem "+anos+" anos");
    }

    //INSS criado para calcular o tempo que falta para aposentar
    //levando em consideração a idade do jogador
    public void INSS(){

        //sistema condicional para dividir o tempo de aposentadoria conforme a posição no fut
        
        //equals para comparar as posições 
        if ((position.equalsIgnoreCase("defesa")) && (anos<40)) {
            System.out.println("Falta "+(40-anos)+" anos para você se aposentar.");
        }

        else if((position.equalsIgnoreCase("meio-campo")) && (anos<38)) {
            System.out.println("Falta "+(38-anos)+" anos para você se aposentar.");
        }

        else if((position.equalsIgnoreCase("atacante")) && (anos<35)){
            System.out.println("Falta "+(35-anos)+" anos para você se aposentar.");
        }

        else {
            System.out.println("Você deveria ou já está aposentado!!");
        }

    }
}

