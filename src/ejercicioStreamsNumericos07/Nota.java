package ejercicioStreamsNumericos07;

public class Nota {

	private Materias materia;
	private int nota;
	
	public Nota(Materias materia, int nota) {
		super();
		this.materia = materia;
		this.nota = nota;
	}

	public Materias getMateria() {
		return materia;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
}
