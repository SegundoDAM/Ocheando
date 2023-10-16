package ejercicioStreamsNumericos07;

import java.util.List;

public class AlumnoRepositoryOM implements AlumnoRepository {
	List<Alumno> alumnos;

	public AlumnoRepositoryOM() {
		super();
		alumnos = new AlumnoOM().getAlumnos();
	}

	@Override
	public List<Alumno> findAlumnosAprobados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materias> findMateriasSuspensas(Alumno alumno) {
		return null;
	}

	@Override
	public int findCantidadConMateriaSuspensa(Materias materia) {
		return (int) alumnos.stream().filter((alumno)->{
			return alumno.getNota(materia)<5;
		}).count();
	}

}
