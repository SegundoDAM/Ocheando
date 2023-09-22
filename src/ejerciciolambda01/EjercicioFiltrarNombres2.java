package ejerciciolambda01;

import java.util.ArrayList;
import java.util.List;

public class EjercicioFiltrarNombres2 {
	public void filtrarPorLetra(List<String> nombres, char letra) {
		List<String> nombresFiltrados = new ArrayList<>();
		for (String nombre : nombres) {
			if (nombre.charAt(0) == letra) {
				nombresFiltrados.add(nombre);
			}
		}
	}

	public void filtrarPorLetraLambda(List<String> nombres, char letra) {
		List<String> nombresFiltrados = new ArrayList<>();
		nombres.forEach((nombre) -> {
			if (nombre.charAt(0) == letra)
				nombresFiltrados.add(nombre);
		});
	}

	public List<String> filtrarPorLetraEjercicio(List<String> nombres, char letra) {
		List<String> nombresFiltrados = new ArrayList<>();
		for (String nombre : nombres) {
			if (nombre.charAt(0) == letra) {
				nombresFiltrados.add(nombre);
			}
		}
		return nombresFiltrados;
	}

}
