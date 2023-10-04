package ejercicio09;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

class GatosServiceTest {

	@Test
	void testFindCatsByRace() {
		GatosService gatosService=new GatosService();
		Map<Raza, Long> findCatsByRace = gatosService.getAmountCatsByRaceOld();
		assertEquals(1000,findCatsByRace.entrySet().stream()
			.mapToLong((entrada)->{return entrada.getValue();}).sum());
		Map<Raza, Long> findCatsByRaceDos = gatosService.getAmountCatsByRaceStream();
		assertEquals(1000,findCatsByRaceDos.entrySet().stream()
			.mapToLong((entrada)->{return entrada.getValue();}).sum());
		Map<Raza, Long> findCatsByRaceTres = gatosService.getAmountCatsByRacesGrouping();
		assertEquals(1000,findCatsByRaceTres.entrySet().stream()
				.mapToLong((entrada)->{return entrada.getValue();}).sum());
		assertEquals(gatosService.getCatsByRaces().size(),Raza.values().length);
	}

}
