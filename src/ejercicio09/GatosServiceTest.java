package ejercicio09;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import javax.xml.stream.util.EventReaderDelegate;

import org.junit.jupiter.api.Test;

class GatosServiceTest {

	@Test
	void testFindCatsByRace() {
		GatosService gatosService=new GatosService();
		Map<Raza, Long> findCatsByRace = gatosService.findCatsByRace();
		assertEquals(1000,findCatsByRace.entrySet().stream()
			.mapToLong((entrada)->{return entrada.getValue();}).sum());
	}

}
