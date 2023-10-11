package ejercicio10;

import java.util.Set;

public class Apuesta {
	public Set<Integer> bolasRoja;
	public int bolaAzul;

	public Apuesta(Set<Integer> bolasRoja, int bolaAzul) {
		super();
		this.bolasRoja = bolasRoja;
		this.bolaAzul = bolaAzul;
	}

	public boolean comprobarSorteo(BolaDobleColor sorteo2) {
		return bolasRoja.stream().anyMatch((bolaRoja) -> {
			return sorteo2.comprobar(bolaRoja, bolaAzul);
		});
	}

}