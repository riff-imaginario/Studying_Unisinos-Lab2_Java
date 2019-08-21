
public class SaldoInsuficienteException extends Exception {
	private double saldo;
	
	public SaldoInsuficienteException(String message, double valor) {
		super(message);
		
		this.saldo = valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
