package exceptions;

public class ValorInvalidoException extends Exception {
	private double valor;

	public ValorInvalidoException(String message, double valor) {
		super(message);
		
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
}
