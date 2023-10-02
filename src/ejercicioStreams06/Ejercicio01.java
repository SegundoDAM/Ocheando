package ejercicioStreams06;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio01 {
	private static Integer suma;

	public static void main(String[] args) {
		List<Integer> collect = new Random().ints(1, 100).limit(20).boxed().collect(Collectors.toList());
		System.out.println(collect);
		Stream<Integer> lista=collect.stream().map((ele)->{return ele;});
		IntStream listaDos=collect.stream().mapToInt((ele)->{return ele;});
		//Halla la suma y la media del flujo creado
		System.out.println("la suma es " + collect.stream().mapToInt(a -> a).sum());
		System.out.println("la media es " + collect.stream().mapToInt(a -> a).average());
	}
}
