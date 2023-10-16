package ejercicioStreamsNumericos07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class AlumnoServiceTest {
	AlumnoService alumnoService = new AlumnoService(new AlumnoRepositoryOM());
	int aprobados = 3;

	@Test
	void test() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
	}

	@Test
	void testMalMatematico() {
		// Alumnos con matematicas suspensas
		 assertEquals(1,
				 alumnoService.getCantidadAlumnosConMateriaSuspensa(Materias.matematicas));
	}

	@Ignore
	void testBuenaLengua() {
		// Alumnos con lengua e ingles aprobadas
	}

	@Ignore
	void testResponse() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
		// COmprobar las materias suspensas
	}

	@Ignore
	void testEstadistica() {
		/*
		 * pocentaje de alumnos por numero de materias suspensas cuantos con cero, con
		 * una, etc.
		 */
	}

	@Ignore
	void testNotables() {
		/*
		 * porcentaje de alumnos con nota media de notable
		 */
	}
}
