package ejercicioStreamsNumericos07;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

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

	public Map<Long, Float> getPorcentajeAlumnosPorCantidadMateriasSuspensas() {
		return alumnoRepository.findAlumnosYMateriasSuspensas()
				.entrySet().stream()
				.collect(Collectors.toMap(
						Entry::getKey,
						(entry)->
						{return entry.getValue()/(float) alumnoRepository.getCantidadAlumnos()*100;}));
	}

	

	
}
