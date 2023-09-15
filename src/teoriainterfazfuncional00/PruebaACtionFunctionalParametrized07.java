package teoriainterfazfuncional00;

import org.junit.jupiter.api.Test;

public class PruebaACtionFunctionalParametrized07 {
	@Test
	void test() {
		
		ACtionFunctionalPArametrized06<Integer,String> action;
		//definicion
		action=(source)->{
			return source.length()+7;
		};
		
		//uso
		System.out.println(action.convert("hola"));
	}

}
