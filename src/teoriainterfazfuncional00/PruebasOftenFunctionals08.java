package teoriainterfazfuncional00;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PruebasOftenFunctionals08 {
	public static void main(String[] args) {

		// Consumidor acepta datos pero no devuelve nada, es como si solo consumiese
		Consumer consumer;
		// Acepta un tipo pero devuelve otro tipo. Es como una funcion normal
		Function function;
		// Acepta un valor y devuelve un booleano
		Predicate predicate;
		// no acepta tipo de entrada pero retorna un tipo. Es un suministrador
		Supplier supplier;
		// Los bi
		Consumer<String> oneCons = new Consumer<String>() {
			public void accept(String t) {
				System.out.println("haciendo cosas con valor " + t);
			};
		};
		Consumer<String> twoCons = t -> {
			System.out.println("haciendo cosas con valor " + t);
		};

		oneCons.accept("data");
		twoCons.accept("dataDos");
		BiConsumer<String, Float> two = new BiConsumer<String, Float>() {

			@Override
			public void accept(String t, Float u) {
				System.out.println("hago cosas con " + t + " y con " + u);
			}
		};
		BiConsumer<String, Float> three =(t,u)->{
			System.out.println("hago cosas con " + t + " y con " + u);
		};
		two.accept("first", 43.4f);
		three.accept("first", 43.4f);
	}
}
