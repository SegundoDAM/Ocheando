package teoriainterfazfuncional00;

public class PruebaLambdaScopes11 {
	public static void main(String[] args) {
		// El ambito de las variables puede venir de fuera de la funcion lambda
		// Sin embargo, pensando en cumplir las leyes de la programacion funcional,
		// por eso se debe definir como final
		 final int num = 1;
		// aunque puede no hacerse pero exige un requisito
//		int num = 1;
		Converter<String, Integer> stringConverter = (from) -> String.valueOf(from + num);

		System.out.println(stringConverter.convert(2));
		// Aqui vemos como una vez que la variable, de ambito superior, es utilizada
		// en la lambda, ya no nos permite cambiar su valor fuera. intenta reducir
		// los efectos colaterales
		final int num2 = 1;
		Converter<String, Integer> converter = (a) -> String.valueOf(a + num2);
		// Habilita esto para ver el error
//		 num2=3;
	}
}
