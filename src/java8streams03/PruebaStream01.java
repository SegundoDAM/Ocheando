package java8streams03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStream01 {
	// Volvemos a coger caracteristicas de la programacion funcional
	// En el ejemplo anterior podeis ver que todos los resultados son inmutables,
	// porque son String
	// Eso quiere decir quColle todos los cambios que hice desde la String original
	// no afectan a esta
	// es decir la cadena original sigue como estaba. Con esto se consigue que no
	// haya efectos colaterales
	// si otro metodo usa esta cadena no se vera afectado por las operaciones
	// anteriores.
	// Para un programador oo esto es raro porque cuenta con el estado. Para un
	// programador funcional esto es
	// obligatorio porque no tiene estado.
	// Usando esta lógica java 8 se plantea utilizar esta inmutabilidad y pipeline
	// para trabajar con Collection
	// con otras cosas tambien, y lo llama Stream veamos
	// 00 Creando la coleccion
	public static void main(String[] args) {
		String cosas[] = { "periplo", "nocturno", "cempua" };
		List<String> cadenas = Arrays.asList(cosas);
		// 01 Toda colecction tiene un stream
		Stream<String> stream = cadenas.stream();
		// ya trabajamos con el Stream pero no sobre el original
		// System.out.println(stream.count());
		// Una operacion sobre el flujo que no retorne otro flujo, lo cierra
		// cuenta con muchas funciones que veremos. Vamos a ver una, la mas potente map
		// Observa que map necesita que le pasemos una funcion. Ahi va una lambda
		// vamoa a hacer la que convierte en mayusulas
		Stream<String> stringStream = stream.map((String a) -> a.toUpperCase());
//		Object[] objects = stringStream.toArray();
//		for (Object obj : objects) {
//			System.out.println(obj.toString());
//		}
		// Observad lo que ha pasado, hemos transformado todo el stream con una unica
		// instruccion
		// pero el original esta modificado?
		for (String cadena : cadenas) {
			System.out.println(cadena);
		}
		// Un stream es un flujo. Todo flujo debe abrirse, operar y cerrar. Por lo tanto
		// cuando hacemos
		// una operacion sobre un stream, este se cierra, por eso da este error.
		// Para poder hacer mas de una operacion sobre el stream debe estar en pipeline
		 List<String> collect = stringStream.collect(Collectors.toList());
		 for (String cadena:collect) {
		 System.out.println(cadena);
		 }
		 stream = cadenas.stream();
		  List<String> collect1 = stream
				  .map((String a) -> a.toUpperCase())
				  .collect(Collectors.toList());
		  List<String> collect2 = cadenas.stream()
				  .map((String a) -> a.toUpperCase())
				  .collect(Collectors.toList());
	}


}
