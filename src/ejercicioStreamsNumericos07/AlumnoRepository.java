package ejercicioStreamsNumericos07;

import java.util.List;

public interface AlumnoRepository {
	public List<Alumno> findAlumnosAprobados();
	public List<Materias> findMateriasSuspensas(Alumno alumno);
}
