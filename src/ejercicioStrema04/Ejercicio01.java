package ejercicioStrema04;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio01 {
	public static void main(String[] args) {
		// Crea un array de 20 elementos aleatorios enteros con dominio entre 1 y 100
		// (inclusive)
		// usa el flujo para obtener un nuevo array donde solo hay valores mulitplos de
		// tres.
		int maxim = 100;
		ArrayList<Integer> list = new Ejercicio01().randomList(maxim);
		// no stream
		ArrayList<Integer> multiplos = new ArrayList<>();
		for (Integer integer : list) {
			if (integer % 3 == 0) {
				multiplos.add(integer);
			}
		}
		//usa streams para hace lo mismo
	}
	public ArrayList<Integer> randomList(int max) {
		ArrayList<Integer> list = new ArrayList<>();
		int size = 20;
		for (int i = 0; i < size; i++) {
			list.add(new Random().nextInt(max));
		}
		return list;
	}

}
