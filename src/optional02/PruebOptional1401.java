package optional02;

import java.util.Optional;

public class PruebOptional1401 {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("bam");
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.orElse("fallback"));
		if(optional.isPresent()) {
			//hacer cosas
		}
		optional.ifPresent((valor)->{
			System.out.println(valor);
		});
//		 //VEamos
//        optional.ifPresent(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				t.charAt(0);
//			}
//		});
	}
}
