package exceptions;

public class ContaCorrente {
	private String nomeTitular;
	private double saldoConta;
	
	public ContaCorrente(String nomeTitular, double saldoConta) {
		this.nomeTitular = nomeTitular;
		this.saldoConta = saldoConta;
	}
	
	
	public double sacar(double valor) throws SaldoInsuficienteException {
		if(valor <= getSaldoConta() && valor > 0)
			setSaldoConta(valor - getSaldoConta());
		else
			throw new SaldoInsuficienteException("Saldo insuficiente!", getSaldoConta());
		
		return valor;
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if(valor > 0)
			setSaldoConta(valor + getSaldoConta());
		else
			throw new ValorInvalidoException("Valor inválido", valor);
	}
	
	// Getters and Setters
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	
}
