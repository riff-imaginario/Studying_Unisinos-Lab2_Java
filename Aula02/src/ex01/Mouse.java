package ex01;

public class Mouse extends Periferico {
	private int botoes;

	public Mouse(int id, String modelo, int botoes) {
		super(id, modelo);
		this.botoes = botoes;
	}
	
	@Override
	public String toString() {
		return "Mouse [botoes=" + botoes + ", getId()=" + getId() + ", getModelo()=" + getModelo() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

}
