package java8streams03;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class PruebaStreamMetodos02 {
	 public static void main(String[] args) {
		 String cosas[] = {"periplo", "nocturno", "cempua"};
	        List<String> cadenas =  Arrays.asList(cosas);
	        //Que metodos tenemos
	        Stream<String> stream = cadenas.stream(); 
	        //metodos que retornan un stream, o sea, que pueden ir en pipeline
	        //quita los elementos iguales
//	        stream.distinct();
	        //corta la cantidad de elementos
//	        stream.limit(2).forEach((element)->System.out.println(element));
	        // salta los n primeros elementos
//	        stream.skip(1).forEach((element)->System.out.println(element));
	        // hay algunso mas
	        //Ahora vamos a ver metodos que neceitan una lambda para funcionar
	        //Estos necesitan un Predicate
//	        System.out.println(stream.allMatch((element)
//	        		->{return element.endsWith("o");}));
//	        stream.anyMatch();
//	        stream.noneMatch();
//	        stream.dropWhile(()->{});
//	        stream.filter();
//	        stream.takeWhile();
	        // Estos necesitan un Consumer
//	        stream.forEach((elemet)->{elemet.doit();});
//	        stream.forEachOrdered();
//	        stream.peek();
	        // Estos necesitan un Supplier
//	        stream.collect(Collectors.toList());
	        // Estos una funcion
//	        stream.map();
//	        stream.flatMap();
//	        stream.flatMapToDouble();
//	        stream.flatMapToInt();
//	        stream.flatMapToLong();
//	        stream.mapToDouble();
//	        stream.mapToInt((element)->{return element.length();});
//	        stream.mapToLong();
	        // Las que necesitan un comparador
//	        stream.max();
//	        stream.min();
//	        stream.sorted();
	        // METODOS QUE NO RETORNAN UN STREAM
//	        // que retorna  optional
//	        stream.findFirst();
	        //cuenta los elementos
//	        stream.count();
	 }
}
