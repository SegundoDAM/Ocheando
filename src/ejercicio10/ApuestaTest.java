package ejercicio10;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApuestaTest {

	@Test
	void test() {
		int min = 0, max = 10;
		boolean banderaMin = false, banderaMax = false;
		for (int i = 0; i < 150; i++) {
			int aleatorio = new Sorteo().getAleatorio(max, min);
			if (aleatorio == min)
				banderaMin = true;
			if (aleatorio == max)
				banderaMax = true;
		}
		assertTrue(banderaMax);
		assertTrue(banderaMin);
	}

}
