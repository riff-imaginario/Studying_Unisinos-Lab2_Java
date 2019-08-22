package exceptions;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("x", 1500);
		
		try {
			c1.sacar(2000);
			c1.depositar(250);
		} catch(SaldoInsuficienteException | ValorInvalidoException e) {
			System.out.println(e.getMessage() + "\nSaldo atual é de: R$ " + ((SaldoInsuficienteException) e).getSaldo());
			System.out.println(e.getMessage() + "\nSaldo atual é de: R$ " + ((ValorInvalidoException) e).getValor());
		}
	}

}
