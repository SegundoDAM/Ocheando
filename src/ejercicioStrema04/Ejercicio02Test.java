package ejercicioStrema04;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class Ejercicio02Test {
	Ejercicio02 exercise = new Ejercicio02();
	Integer[] expected = { 20000, 40000, 60000, 200000, 400000, 600000, 0 };

	@Test
	void test() {
		List<Vehiculo> alteraCollecion = exercise.getVehiculos();
		ArrayList<Integer> kilometrajes = new ArrayList<>();
		alteraCollecion.stream().forEach((v) -> {
			kilometrajes.add(v.getKilometros() * 2);
		});
		assertArrayEquals(expected, kilometrajes.toArray());
	}

	@Test
	void test2() {
		exercise.getVehiculos().stream()
		.forEach((v) -> {
			v.setKilometros(v.getKilometros() * 2);
		});
		;
		assertArrayEquals(expected,exercise.getVehiculos().stream()
				.mapToInt((elemento)->{return elemento.getKilometros();})
				.boxed()
				.toArray()
				);
	}

}
