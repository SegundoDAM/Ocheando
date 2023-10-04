package ejercicio09;

import java.util.HashSet;
import java.util.Set;

public class GatosRepository {
	private Set<Gato> gatos=new HashSet<>();
	
	public boolean addGato(Gato gato) {
		return gatos.add(gato);
	}

	public int size() {
		return gatos.size();
	}
	
	public Set<Gato> findAll(){
		return gatos;
	}
	
	
}
