package ex01;

public class Impressora extends Periferico {
	private boolean color;
	
	public Impressora(int id, String modelo) {
		super(id, modelo);
	}

	@Override
	public String toString() {
		return "Impressora [color=" + color + ", getId()=" + getId() + ", getModelo()=" + getModelo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
