package ejercicioStrema04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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

		// usa streams para hace lo mismo
		List<Integer> collect2 = new Random().ints(0, 100).limit(20).sorted().boxed().collect(Collectors.toList());
	}

	public static List<Integer> filterByThreeNoStream(List<Integer> list) {
		ArrayList<Integer> multiplos = new ArrayList();
		for (Integer integer : list) {
			if (integer % 3 == 0) {
				multiplos.add(integer);
			}
		}
		return multiplos;
	}

	public List<Integer> filterByThree(List<Integer> aleatorios) {
		return aleatorios.stream().filter((elemento) -> {
			return elemento % 3 == 0;
		}).collect(Collectors.toList());
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
