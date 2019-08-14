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
			// Verifica se array possui espaco
			if(perifericos[i] == null)
				for(int j=0; j < perifericos.length; j++)
					// Verifica se o objeto nao existe
					if(!(perifericos[j].equals(periferico))) {
						// Adiciona (instala) periferico na posicao index
						perifericos[index] = periferico;
						index++;
						return true;
					}
						
		return false;
	}
	
	public boolean desinstalar(Periferico periferico) {
		for(int j=0; j < perifericos.length; j++)
			// Verifica se o objeto existe
			if((perifericos[j].equals(periferico))) {
				// Adiciona (instala) periferico na posicao index
				perifericos[index] = null;
				index--;
				return true;
			}
						
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
