package optional02;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalProbe00 {
	public int probar(ArrayList<String> cosa) {
		return cosa.size();
	}

	public static void main(String[] args) {
		// 00
		// Supongamos el siguiente problema
		ArrayList<String> palabras = null;
		try {
			System.out.println(palabras.size());
			System.out.println("hago mas cosas");
		} catch (Exception e) {
			System.out.println("todo mal");
		}
		// Obviamente es un nullpointer
		// 01 una solucion posible es esta
		// if (palabras != null)
		// System.out.println(palabras.size());
		// 02 java 8 nos da el envoltorio Optional
		// Es un singleton. Tenemos un objeto
		// fijo EMPTY cuando no hay nada nuevo
		Optional<Integer> optional = Optional.empty();
		System.out.println("hago mas cosas");
		// observa que no hay nulo
//		System.out.println(optional);
		optional = Optional.of(16);
//		System.out.println(optional);
		int valor = optional.get();
		Optional otro = Optional.of(123);
//		System.out.println(optional.get());
//		System.out.println("otro" + otro.get());
		optional = Optional.ofNullable(null);
//		System.out.println(optional);
//		otro = Optional.of(null);
		// System.out.println(otro);
		System.out.println(optional.isPresent());
		 optional = Optional.ofNullable(45);
		 System.out.println(optional.orElse(99));
		// 03 En este caso no trabajamos con palabras, lo hacemos con un optional
		 palabras=new ArrayList<>();
		 palabras.add("hola");
		 palabras.add("hola");
		 palabras.add("hola");
		 ArrayList<String>palabrass=new ArrayList<>();
		 Optional<ArrayList<String>> optionalL = Optional.ofNullable(null);
		 System.out.println(new OptionalProbe00().probar(optionalL.orElse(palabrass)));
		 if(palabras!=null) {
				System.out.println(palabras);
			}
			else {
				System.out.println(palabrass);
			}
	}
}
