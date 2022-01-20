package Estudos.POO_CEV.Aula05;
import java.util.*;

public class ContaBanco {
    Random rd = new Random();
    Scanner in = new Scanner(System.in);
    int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean stats;
    

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStats() {
        return this.stats;
    }

    public void setStats(boolean stats) {
        this.stats = stats;
    }

    public ContaBanco(){
        stats = false;
        saldo = 0.0;
    }

   public void AbrirConta(){
        System.out.print("insira seu nome: ");
            dono = in.nextLine();
        System.out.println("Qual tipo de conta você deseja?\nCC - Conta Corrente\nCP - Conta Poupança");
            tipo = in.nextLine();

        if (tipo.equalsIgnoreCase("CP")) {
            saldo = 150;

        } else if(tipo.equalsIgnoreCase("CC")) {
            saldo = 50;
        }

        numConta = rd.nextInt((9999 - 1111)+1) + 1111;
        stats = true;

        System.out.println("\nConta aberta ;)\n-------------------------"); 
        in.close();
   } 

    public void FecharConta(){
        if (saldo<0) {
            System.out.println("Atenção, conta em débito...\nQuite sua divida antes de fechar a conta");
            
        } else if(saldo>0){
            System.out.println("Ops, está conta ainda possui capital...\nSaque o restante antes de fechar a conta");
            
        } else{
            System.out.println("Conta fechada :/");
            setStats(false);
        }
   }

   public void Depositar(){
        if (getStats()==true) {
            System.out.println("Quanto deseja depositar");
            double deposito = in.nextDouble();

            if (deposito<=0) {
                System.out.println("valor invalido");

            } else {
                System.out.println("Valor depositado");
                saldo += deposito;
            }

        } else {
            System.out.println("Conta inexistente!");
        }
        in.close();
    }

   public void Sacar(){
        if (getStats()==true) {
            System.out.println("Quanto você deseja sacar?");
            double saq = in.nextDouble();

            if (saq<=0) {
                System.out.println("Valor invalido");
                
            } else {
                System.out.println("Saque feito");
                setSaldo(getSaldo()-saq);
            }

        } else {
            System.out.println("Conta inexistente");
        }
        in.close();
   }

    public void PagarMensal(){
        
        if (getStats()==true) {

            if (getTipo().equals("CC")) {
                System.out.println("Mensalidade paga, obg <3");
                setSaldo(getSaldo()-12);
    
            } else if (getTipo().equals("CP")){
                System.out.println("Mensalidade paga, obg <3");
                setSaldo(getSaldo()-20);
            }

        } else {
            System.out.println("Conta inexistente");

        }
    }

    public void Extrato(){
        System.out.println("| Conta: "+getNumConta());
        System.out.println("| Dono: "+getDono());
        System.out.println("| Saldo: "+getSaldo());
        System.out.println("| Tipo: "+getTipo());
    }
}