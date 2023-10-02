package java8streams03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PruebaStream04 {
public static void main(String[] args) {
	List<Integer> collect3 = Arrays.asList(9,4,5,4,3,9);
	int primerRepetido=-1;
	boolean encontrado=false;
	for (int i = 0; i < collect3.size()-1&&!encontrado; i++) {
		int contador=0;
		// aqui hacemos tal
		for (int j = i+1; j < collect3.size(); j++) {
			if(collect3.get(i)==collect3.get(j)) {
				contador++;
			}
		}
		//aqui esto otro
		if(contador>=1) {
			primerRepetido=collect3.get(i);
			encontrado=true;
		}
	}
	System.out.println("no streams "+primerRepetido);
	System.out.println("con streams "+collect3.stream()
		.filter((elemento)->{
			return collect3.stream()
					.filter((otro)->{return elemento==otro;})
					.count()>1;})
		.findFirst().orElse(-1));
	System.out.println("con streams "+collect3.stream()
	.filter((elemento)->{
		return collect3.stream()
				.filter((otro)->{return elemento==otro;})
				.count()>1;
	}).collect(Collectors.toList()));
	// y si el primero que se repite es el 4 no el nueve. hazlo convencional y streams
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
