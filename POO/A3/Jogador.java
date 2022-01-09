package POO.A3;

import java.text.*;
import java.time.*;
import java.util.*;

public class Jogador {
    //criação das variaveis privadas e uma unica variavel public
    //ela é usada apenas para uso interno 
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
        
    }

    public void Idade(){
        //SimpleData e Calendar para iniciar a formatação das datas
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();

        //Data hoje para guardar a data de hoje
        Date hoje = calendario.getTime();
        //a data depois de ser formatada
        String dataformatada = dtf.format(hoje);

        //a data de nascimento foi dividada em dia, mes e ano
        String [] nascimento = this.nascimento.split("/");
        int dia = Integer.parseInt(nascimento[0]);
        int mes = Integer.parseInt(nascimento[1]);
        int ano = Integer.parseInt(nascimento[2]);

        //agora a data de hoje foi "splitada" em dia, mes e ano
        String [] dataAtual = dataformatada.split("/");
        int dia2 = Integer.parseInt(dataAtual[0]);
        int mes2 = Integer.parseInt(dataAtual[1]);
        int ano2 = Integer.parseInt(dataAtual[2]);

        //armazenadas em dois LocalDates
        LocalDate atual = LocalDate.of(ano2, mes2, dia2);
        LocalDate nasciment = LocalDate.of(ano, mes, dia);

        //Period calcula a diferença de tempo entre as duas datas
        Period periodo = Period.between(atual, nasciment);
        //anos guardou a difença de anos
        anos = Math.abs(periodo.getYears());

        System.out.println("O jogador "+nome+" tem "+anos+" anos\n\n");
    }

    //INSS criado para calcular o tempo que falta para aposentar
    //levando em consideração a idade do jogador
    public void INSS(){

        //sistema condicional para dividir o tempo de aposentadoria conforme a posição no fut
        if ((position.equals("defesa")) && (anos<40)) {
            System.out.println("Falta "+(40-anos)+" anos para você se aposentar");
        }
        else if((position.equals("meio-campo"))&&(anos<38)) {
            System.out.println("Falta "+(38-anos)+" anos para você se aposentar");
        }
        else if((position.equals("atacante")) && (anos<35)){
            System.out.println("Falta "+(35-anos)+" anos para você se aposentar");
        }
        else {
            System.out.println("Você já ou deveria está aposentado!!");
        }

        }
}
