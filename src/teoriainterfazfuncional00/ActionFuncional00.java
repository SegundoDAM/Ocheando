package teoriainterfazfuncional00;

//Una interface con esta anotacion tiene UN SOLO metodo declarado
@FunctionalInterface
public interface ActionFuncional00 {
	// ESte es el metodo que hace de funcional
	public void doit();

	// No puede declara un segundo metodo
	// public void doAnother();
	public default void otro() {
		System.out.println("por si acaso");
	};

	// unless its a inherited method like in this case
	boolean equals(Object obj);

	String toString();
}
