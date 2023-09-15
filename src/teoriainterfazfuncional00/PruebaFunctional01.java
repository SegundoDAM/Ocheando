package teoriainterfazfuncional00;

public class PruebaFunctional01 {
	public static void main(String[] args) {
		ActionFuncional00 actionFuncional00=new ActionFuncional00() {
			
			@Override
			public void doit() {
				System.out.println("estoy siendo implementado");
				
			}
		};
		actionFuncional00.doit();
		ActionFuncional00 actionFuncional002=()->{
			System.out.println("estoy siendo implementado");
		};
		actionFuncional002.doit();
	}
}
