package ejercicioStreamsNumericos07;

import java.util.List;
import java.util.Map;

public interface AlumnoRepository {
	public List<Alumno> findAlumnosAprobados();
	public List<Materias> findMateriasSuspensas(Alumno alumno);
	public int findCantidadConMateriaSuspensa(Materias materia);
	public List<Alumno> findAprobadosMaterias(Materias... materias);
	public float getIntervaloNotaPorcentaje(Intervalo intervalo);
	public Map<Long,Long>  findAlumnosYMateriasSuspensas();
	public int getCantidadAlumnos();
}
