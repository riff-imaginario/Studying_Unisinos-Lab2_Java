package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Computador extends Dispositivo implements Instalavel {
	private double velocidade;
	private int index;
	private Periferico[] perifericos = new Periferico[10];

	public Computador(int id, String modelo, double velocidade) {
		super(id, modelo);
		this.velocidade = velocidade;
	}

	public boolean instalar(Periferico periferico) {
		for (int i = 0; i < perifericos.length; i++)
			// Verifica se posicao nao eh nula e se periferico nao foi instalado
			// if (perifericos[i] != null && !(perifericos[i].equals(periferico)))
			if (perifericos[i] == null || !(perifericos[i].equals(periferico))) {
				// Adiciona (instala) periferico na posicao index
				perifericos[i] = periferico;
				index++;
				return true;
			}

		return false;
	}

	public boolean desinstalar(Periferico periferico) {
		for (int i = 0; i < index; i++)
			// Verifica se periferico ja foi instalado
			if (perifericos[i].equals(periferico)) {
				// Remove (desinstala) periferico na posicao index
				perifericos[i] = null;
				index--;
				return true;
			}

		return false;
	}

	@Override
	public String toString() {
		return "Computador:\n velocidade: " + velocidade + "\nindex: " + index + "\nperifericos: "
				+ Arrays.toString(perifericos) + "\nId: " + getId() + "\nModelo: " + getModelo();
	}

}
