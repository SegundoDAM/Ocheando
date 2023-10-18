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

	public List<Alumno> getAlumnosInglesYLenguaAprobadas() {
		return alumnoRepository.findAprobadosMaterias(Materias.ingles,Materias.lengua);
	}

	public float getNotablePorcentaje() {
		Intervalo intervalo=new Intervalo(7,8);
		return alumnoRepository.getIntervaloNotaPorcentaje(intervalo);
	}

	
}
