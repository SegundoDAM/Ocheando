package ejercicioStreamsNumericos07;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Alumno {
	// Esto no esta bien del todo
	// private List<Integer> notas;
	private List<Nota> notas;

	private String nombre;

	public Alumno(List<Nota> notas, String nombre) {
		super();
		this.notas = notas;
		this.nombre = nombre;
	}

	public float getNotaMedia() {
		return (float) getNotas().stream().mapToInt((nota) -> {
			return nota.getNota();
		}).average().getAsDouble();
	}

	public Alumno(Collection<Integer> notas, String nombre2) {
		LinkedList<Nota> conversion = new LinkedList();
		List<Materias> materias = Arrays.asList(Materias.values());
		List<Integer> collect = notas.stream().collect(Collectors.toList());
		for (int i = 0; i < materias.size(); i++) {
			conversion.add(new Nota(materias.get(i), collect.get(i)));
		}
		this.notas = conversion;
		this.nombre = nombre;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean alumnoAprobado() {
		return notas.stream().filter((nota) -> {
			return nota.getNota() < 5;
		}).count() < 2;
	}

	public int getNota(Materias materia) {
		return notas.stream().filter((Nota nota) -> {
			return nota.getEqualsMateria(materia);
		}).findFirst().get().getNota();
	}

	public boolean isAprobadaMateria(Materias materia) {
		int suspenso = 4;
		return getNota(materia) > suspenso;
	}

	public long getCantidadSupensas() {
		return notas.stream().filter((nota) -> {
			return !nota.isAprobada();
		}).count();
	}
}
