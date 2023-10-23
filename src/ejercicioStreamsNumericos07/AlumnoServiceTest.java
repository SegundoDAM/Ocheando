package ejercicioStreamsNumericos07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class AlumnoServiceTest {
	AlumnoService alumnoService = new AlumnoService(new AlumnoRepositoryOM());
	int aprobados = 3;

	@Ignore
	void test() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
	}

	@Ignore
	void testMalMatematico() {
		// Alumnos con matematicas suspensas
		 assertEquals(1,
				 alumnoService.getCantidadAlumnosConMateriaSuspensa(Materias.matematicas));
	}

	@Test
	void testBuenaLengua() {
		// Alumnos con lengua e ingles aprobadas
		int expected=3;
		assertEquals(expected,alumnoService.getAlumnosInglesYLenguaAprobadas().size());
	}

	@Ignore
	void testResponse() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
		// COmprobar las materias suspensas
	}

	@Test
	void testEstadistica() {
		/*
		 * pocentaje de alumnos por numero de materias suspensas cuantos con cero, con
		 * una, etc.
		 */
		Map <Long,Float> expected=new HashMap();
		expected.put(0l,25f);
		expected.put(1l,50f);
		expected.put(2l,25f);
		Map <Long,Float> mapaPorcentual=alumnoService.getPorcentajeAlumnosPorCantidadMateriasSuspensas();
		assertEquals(expected,mapaPorcentual);
	}

	@Ignore
	void testNotables() {
		/*
		 * porcentaje de alumnos con nota media de notable
		 */
		float porcentajeExpected=25f;
		assertEquals(porcentajeExpected,alumnoService.getNotablePorcentaje());
	}
}
