package grouping08;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeoriaGrouping {
	GatosRepositoryOM gatosRepository = new GatosRepositoryOM();
	
	public void teoriaUno() {
		Map<Raza, List<Gato>> collect = gatosRepository.getGatos().stream()
			.collect(Collectors.groupingBy(Gato::getRaza));
	}
	public void teoriaDos() {
		Map<Raza, Long> collect = gatosRepository.getGatos().stream()
				.collect(Collectors.groupingBy(Gato::getRaza,
						Collectors.counting()));
	}
	public void teoriaTres() {
		Map<Raza, Double> collect = gatosRepository.getGatos().stream()
				.collect(Collectors.groupingBy(Gato::getRaza,
						Collectors.averagingDouble(Gato::getEdad)));
	}
	public void teoriaCuatro() {
		//Agrupar por raza y edad
		Map<Raza, Map<Byte, List<Gato>>> collect = gatosRepository.getGatos().stream()
				.collect(
						Collectors.groupingBy(Gato::getRaza,
						Collectors.groupingBy(Gato::getEdad)));
	}
	public void teoriaCinco() {
		//Agrupar por raza y edad
		Map<Raza, Map<Byte, Long>> collect = gatosRepository.getGatos().stream()
				.collect(
						Collectors.groupingBy(Gato::getRaza,
						Collectors.groupingBy(Gato::getEdad,
								Collectors.counting())));
	}
	public void teoriaSeis() {
		//Agrupar por raza y edad y que solo salgan cuando haya al menos uno
		Map<Raza, Map<Byte, Long>> collect = gatosRepository.getGatos().stream()
				.collect(
						Collectors.groupingBy(Gato::getRaza,
						Collectors.groupingBy(Gato::getEdad,
						Collectors.counting())));
	}
	public void teoriaSiete() {
		//Agrupar por raza y edad y que solo salgan cuando haya al menos dos
		gatosRepository.getGatos().stream()
				.collect(
						Collectors.groupingBy(Gato::getRaza,
						Collectors.groupingBy(Gato::getEdad,Collectors.counting())
						))
				.entrySet()
				.stream()
						.peek((entry)->{
									entry.getValue().entrySet().stream()
										.filter((entry2)->{return entry2.getValue()>2;});
						}).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println();
	}
	
}
