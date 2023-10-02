package ejercicioStreamsNumericos07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoServiceTest {
	AlumnoService alumnoService=new AlumnoService();
	int aprobados=3;
	@Test
	void test() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
	}
	
	@Test
	void testResponse() {
		assertEquals(aprobados, alumnoService.getInfoAlumnosAprobados().size());
		//COmprobar las materias suspensas
	}

}
