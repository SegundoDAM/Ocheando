package optional02;

import java.util.Arrays;
import java.util.List;


public class Ejercicio01 {
	// No tiene nada que ver con optional
	public static void main(String[] args) {
		System.out.println(new Ejercicio01()
				.getPrimerRepetido(Arrays.asList(3, 4, 5, 4, 5)));
	}

	public Integer getPrimerRepetido(List<Integer> collect3) {
		int primerRepetido = -1;
		boolean encontrado = false;
		for (int i = 0; i < collect3.size() - 1 && !encontrado; i++) {
			int contador = 0;
			for (int j = i + 1; j < collect3.size(); j++) {
				if (collect3.get(i) == collect3.get(j)) {
					contador++;
				}
			}
			if (contador >= 1) {
				primerRepetido = collect3.get(i);
				encontrado = true;
			}
		}
		return primerRepetido;
	}
}
