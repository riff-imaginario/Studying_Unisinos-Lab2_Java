package ex01;

import java.util.Arrays;

public class Computador extends Dispositivo implements Instalavel {
	private double velocidade;
	private int index;
	private Periferico[] perifericos;
	
	public Computador(int id, String modelo) {
		super(id, modelo);
	}
	
	public boolean instalar(Periferico periferico) {
		for(int i=0; i < perifericos.length; i++)
			if(perifericos[i].equals(periferico.getId()))
				return true;
		
		return false;
	}
	
	public boolean desinstalar(Periferico periferico) {
		for(int i=0; i < perifericos.length; i++)
			if(perifericos[i].equals(periferico.getId()))
				return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "Computador [velocidade=" + velocidade + ", index=" + index + ", perifericos="
				+ Arrays.toString(perifericos) + ", getId()=" + getId() + ", getModelo()=" + getModelo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
