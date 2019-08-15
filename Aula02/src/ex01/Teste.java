package ex01;

public class Teste {

	public static void main(String[] args) {
		Periferico mouse   = new Mouse(1, "Genius", 3);
	    Periferico printer = new Impressora(2, "HP Deskjet", true);
	    Computador samsung = new Computador(3, "Samsung", 4);

	    System.out.println(samsung.instalar(mouse));
	    System.out.println(samsung);
	    System.out.println(samsung.instalar(printer));
	    System.out.println(samsung);
	    System.out.println(samsung.instalar(printer));
	    System.out.println(samsung);
	    System.out.println(samsung.desinstalar(printer));
	    System.out.println(samsung);
	}

}
