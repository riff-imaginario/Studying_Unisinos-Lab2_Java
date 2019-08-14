package ex01;

public class Mouse extends Periferico {
	private int botoes;

	public Mouse(int id, String modelo) {
		super(id, modelo);
	}
	
	@Override
	public String toString() {
		return "Mouse [botoes=" + botoes + ", getId()=" + getId() + ", getModelo()=" + getModelo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
