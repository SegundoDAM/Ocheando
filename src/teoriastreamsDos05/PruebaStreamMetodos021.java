package teoriastreamsDos05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStreamMetodos021 {
	public static void main(String[] args) {
		String cosas[] = { "periplo", "nocturno", "cempua", "argamasilla" };
		List<String> cadenas = Arrays.asList(cosas);
		// Que metodos tenemos
		Stream<String> stream = cadenas.stream();
		// Ahora vamos a ver metodos que neceitan una lambda para funcionar
		// Estos necesitan un Predicate
		// el predicate es una IF y no necesita esta sintaxis
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() > 6;
			}
		};
		System.out.println(stream.allMatch((t) -> {
			return t.length() > 5;
		}));
		// }));
		stream = cadenas.stream();
		System.out.println(stream.anyMatch((element) -> {
			System.out.print("anymatch ");
			return element.length() > 7;
		}));
		stream = cadenas.stream();
		List<String> collect = stream.dropWhile((t) -> {
			return t.length() > 6;
		}).collect(Collectors.toList());
		System.out.println(collect);
		stream = cadenas.stream();
		// ninguna empieza por x
		System.out.println(stream.noneMatch((element) -> {
			return element.startsWith("x");
		}));
		stream = cadenas.stream();
		// mientras no empiece por a
		System.out.println(stream.takeWhile((element) -> {
			return !element.startsWith("a");
		}).collect(Collectors.toList()));
	}

	// Estos necesitan un Consumer
	Consumer<String> consumer = new Consumer<String>() {

		@Override
		public void accept(String t) {
			// TODO Auto-generated method stub

		}
	};
	// stream.forEachOrdered();
	// stream.peek();
	// Estos necesitan un Supplier
	Supplier<String> supplier = new Supplier<String>() {

		@Override
		public String get() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	// Estos una funcion
	Function<String, String> function = new Function() {

		@Override
		public Object apply(Object t) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	// stream.map();
	// stream.flatMap();
	// stream.flatMapToDouble();
	// stream.flatMapToInt();
	// stream.flatMapToLong();
	// stream.mapToDouble();
	// stream.mapToInt();
	// stream.mapToLong();
}
