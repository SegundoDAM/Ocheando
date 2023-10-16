package ejercicioStreamsNumericos07;

import java.util.List;

public class AlumnoService {
	AlumnoRepository alumnoRepository;
	
	public AlumnoService(AlumnoRepository alumnoRepository) {
		super();
		this.alumnoRepository = alumnoRepository;
	}

	public List<AlumnoResponse> getInfoAlumnosAprobados() {
		return null;
	}

	public int getCantidadAlumnosConMateriaSuspensa(Materias matematicas) {
		return alumnoRepository.findCantidadConMateriaSuspensa(matematicas);
	}

	
}
