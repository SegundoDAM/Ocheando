package java8streams03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaStreamEjemplos03 {
	public static void main(String[] args) {
		   String cosas[] = {"periplo", "nocturno", "cempua"};
	        List<String> cadenas = Arrays.asList(cosas);
	        ArrayList<String> copia = new ArrayList<>();
	        // Primero clonamos la List
	        Iterator<String> iterator = cadenas.iterator();
	        while (iterator.hasNext()) {
	            String next = iterator.next();
	            copia.add(next.toUpperCase());
	        }
	        System.out.println(cadenas.toString());
	        System.out.println(copia.toString());
	        //con streams
	        List<String> cadenasStream = Arrays.asList(cosas);
	        List<String> collect = cadenasStream.stream()
	        	.map((element)->{return element.toUpperCase();})
	        	.collect(Collectors.toList());
	        System.out.println(cadenasStream);
	        System.out.println(collect);
	}
}
