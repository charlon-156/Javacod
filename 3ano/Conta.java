public abstract class Conta {
    private String agencia;
    private String numConta;
    private double saldo;

    public void depositar(){
        
    }

	public void sacar(){

	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumConta() {
		return this.numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
