package teoriastreamsDos05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStreamMetodos02 {
	public static void main(String[] args) {
		String cosas[] = { "periplo", "nocturno", "cempua", "cempua", "Chota", "corcuspulo" };
		List<String> cadenas = Arrays.asList(cosas);
		// Que metodos tenemos
		Stream<String> stream = cadenas.stream();
		// metodos que retornan un stream, o sea, que pueden ir en pipeline
		// quita los elementos iguales
		Stream<String> distinct = stream.distinct();
		// corta la cantidad de elementos
		Stream<String> limit = distinct.limit(4);
		// salta los n primeros elementos
		Stream<String> skip = limit.skip(1);
		//cerrar el flujo
		List<String> collect = skip.collect(Collectors.toList());
		System.out.println(collect);
		//en pipeline
		List<String> collect2 = cadenas.stream()
				.distinct()
				.limit(4)
				.skip(1)
				.collect(Collectors.toList());
		System.out.println(collect2);
	}
}
