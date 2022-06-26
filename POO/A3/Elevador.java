package POO.A3;
public class Elevador {

    //crie 4 variaveis privadas, pois não quero que o usuario tenha acesso as variaveis internas
    private int andarAtual, totalAndar, totalCapacidade, capacidadeAtual;

    //get e set para as variaveis totalandar e totalcapacidade
    //NOTA: Não fiz get e set para capacidade atual e andar atual
    //pois não desejo que os usarios tenha qualquer tipo de acesso a essas variaveis
    //já que elas são importantes para o funcionamento interno.

    public int getTotalAndar(){
        return totalAndar;
    }
    public int getTotalCapacidade(){
        return totalCapacidade;
    }
    public void setTotalAndar(int a){
        this.totalAndar = a;
    }
    public void setTotalCapacidade(int c){
        this.totalCapacidade = c;
    }

     //O metodo Constructor foi criado já que (todos) os elavadores começam no andar 0 e com 0 pessoas
     public Elevador(){
        this.capacidadeAtual = 0;
        this.andarAtual = 0;
    }

    //metodo Status para retorna ao usuario todas as informações sobre o Objeto(Elevador)
    public void Status(){
        System.out.println("\nDados sobre o Elevador\n----------------------");
        System.out.println("Elevador se posiciona no andar de N° "+andarAtual);
        System.out.println("Elevador atual possue "+capacidadeAtual+" ocupantes.");
        
    }

    //FUNÇÕES PARA SUBIR ANDAR, DESCER ANDAR, ADICIONAR PESSOA OU REMOVER PESSOA

    /*  
        Metodo para ADICIONAR pessoas
            primeiro deve analisar se a capacidade atul é menor que a total,
            já que não se pode adionar mais do que a capacidade max;
            1- Se for true: mais uma pessoa vai ser adicionada
            2- Se for false: retorna mensagem de lotado
    */

    public void AcrescentarPessoa(){
        if ((capacidadeAtual)<(totalCapacidade)) {

            capacidadeAtual++;
            System.out.println("\n--- O elevador conta com "+capacidadeAtual+" pessoas ---");
            
        } else {

            System.out.println("\n--- O elevador está lotado... ---");

        }
    }

    /* 
        Metodo para REMOVER pessoas
            primeiro deve analisar se a capacidade atul é diferente de 0, 
            pois não se pode remover pessoas se não há ninguém dentro;
            1- Se for true: mais uma pessoa vai ser retirada
            2- Se for false: retorna mensagem de fazio
    */

    public void RemoverPessoa(){
        if ((capacidadeAtual)!=(0)) {

            capacidadeAtual--;
            System.out.println("\n--- O elevador conta com "+capacidadeAtual+" pessoas ---");

        } else {

            System.out.println("\n--- O elevador se encontra vazio...");    

        }
    }

    /* 
        Metodo para SUBIR andares
            primeiro deve analisar se o andar atul é menor que a total,
            é impossivel subir além da cobertura;
            1- Se for true: o elevador sobe mais um andar
            2- Se for false: retorna mensagem de que ele está no topo
    */

    public void Subir(){
        if ((andarAtual)<(totalAndar)) {
            
            andarAtual++;
            System.out.println("\n--- O elevador está no andar N° "+andarAtual+" ---");

        } else {

            System.out.println("\n--- O elevador está no ultimo andar... ---");

        }
    }

    /* 
        Metodo para DESCER andares
            primeiro deve analisar se o andar atul é igual a 0,
            convenhamos como tu vai descer se já está no final?
            1- Se for true: o elevador desce mais um andar
            2- Se for false: retorna mensagem de que ele está no térreo
    */

    public void Descer(){
        if ((andarAtual)!=(0)) {
            
            andarAtual--;
            System.out.println("\n--- O elevador está no andar N° "+andarAtual+" ---");
            
        } else {

            System.out.println("\n--- O elevador está no térreo... ---");

        }
    }
}
