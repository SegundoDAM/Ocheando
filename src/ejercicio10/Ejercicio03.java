package ejercicio10;

import static org.junit.Assert.assertTrue;

import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;

class Otra {

}

public class Ejercicio03 {

	/*
	 * Reglas de bolas de dos colores: cada apuesta en la bola de dos colores consta
	 * de 6 números de bolas rojas y 1 número de bolas azules. El número de bola
	 * roja se selecciona del 1 al 33; el número de bola azul se selecciona del 1 al
	 * 16; genere aleatoriamente un número de bola de doble color. (Requiere que no
	 * se repita el mismo número de color)
	 */

	public static void main(String[] args) {
		Apuesta apuesta = new Apuesta(Set.of(2, 4, 6, 12, 14, 24), 3);
		Sorteo sorteo = new Sorteo();
		BolaDobleColor sorteo2 = sorteo.getSorteo();
		// comparar el sorteo
		apuesta.comprobarSorteo(sorteo2);
	}

}

class Sorteo {
	private BolaDobleColor bolaDobleColor;
	private Rango bolaRoja = new Rango(1, 33), bolaAzul = new Rango(1, 16);

	public BolaDobleColor getSorteo() {
		
		return new BolaDobleColor(
				getAleatorio(bolaRoja.getMax(),bolaRoja.getMin()),
				
				);
		// TODO
	}

	public int getAleatorio(int max, int min) {
		return new Random().nextInt((max - min)+1)+ min;
	}
}

class BolaDobleColor {
	private int roja;
	private int azul;

	public BolaDobleColor(int roja, int azul) {
		super();
		this.roja = roja;
		this.azul = azul;
	}

	public boolean comprobar(Integer bolaRoja, int bolaAzul) {
		return bolaRoja == roja && bolaAzul == azul;
	}
}

class Rango {
	private int min;
	private int max;

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Rango(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
}

