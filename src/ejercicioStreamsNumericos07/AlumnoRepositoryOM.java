package ejercicioStreamsNumericos07;

import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		return (int) alumnos.stream().filter((alumno) -> {
			return alumno.getNota(materia) < 5;
		}).count();
	}

	@Override
	public List<Alumno> findAprobadosMaterias(Materias... materias) {
		// java 6
		// ArrayList<Alumno> buenaLengua = new ArrayList();
		// for (Alumno alumno : alumnos) {
		// boolean aprobado = true;
		// for (Materias materia : materias) {
		// if (!alumno.isAprobadaMateria(materia))
		// aprobado = false;
		// }
		// if (aprobado)
		// buenaLengua.add(alumno);
		// }
		// return buenaLengua;
		// java 8
		return alumnos.stream().filter((alumno) -> {
			return Arrays.asList(materias).stream().allMatch((materia) -> {
				return alumno.isAprobadaMateria(materia);
			});
		}).collect(Collectors.toList());
	}

	@Override
	public float getIntervaloNotaPorcentaje(Intervalo intervalo) {
		// java 6
//		int notables = 0;
//		for (Alumno alumno : alumnos) {
//			int acumulador = 0;
//			for (Nota nota : alumno.getNotas()) {
//				acumulador += nota.getNota();
//			}
//			if (intervalo.isInTo(acumulador / alumno.getNotas().size()))
////				notables++;
//		}
		// return notables / (float) alumnos.size() * 100;
		// java 8
		return alumnos.stream()
			.filter((alumnoDos)->{
				//notas medias
				return intervalo.isInTo((int) alumnoDos.getNotaMedia());
				})
			.count()/ (float) alumnos.size() * 100;
	}
	public Map<Long,Long> findAlumnosYMateriasSuspensas() {
		return alumnos.stream()
				.collect(
						Collectors.groupingBy(Alumno::getCantidadSupensas,Collectors.counting()));
		
	}

	@Override
	public int getCantidadAlumnos() {
		return alumnos.size();
	}
}
