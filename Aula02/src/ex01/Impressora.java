package ex01;

public class Impressora extends Periferico {
	private boolean color;
	
	public Impressora(int id, String modelo, boolean color) {
		super(id, modelo);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Impressora [color=" + color + ", getId()=" + getId() + ", getModelo()=" + getModelo() + ", getClass()="
				+ getClass() + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
