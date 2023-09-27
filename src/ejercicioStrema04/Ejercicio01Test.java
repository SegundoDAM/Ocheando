package ejercicioStrema04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class Ejercicio01Test {

	@Test
	void testFilterByThree() {
		List<Integer> collect2 = new Random().ints(0, 100).limit(20).sorted().boxed().collect(Collectors.toList());
		assertArrayEquals(
				new Ejercicio01().filterByThree(collect2).toArray(), 
				new Ejercicio01().filterByThreeNoStream(collect2).toArray());
	}
	@Test
	void testFilterByThreenorandom() {
		List<Integer> collect2 =List.of(3,5,2,7,6,9,8,3,1,6,9);
		List<Integer> result=List.of(3,6,9,3,6,9);
		assertArrayEquals(
				result.toArray(), 
				new Ejercicio01().filterByThreeNoStream(collect2).toArray());
		assertArrayEquals(
				result.toArray(), 
				new Ejercicio01().filterByThree(collect2).toArray());
		
	}

}
