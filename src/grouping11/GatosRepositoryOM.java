package grouping11;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class GatosRepositoryOM {
	private Set<Gato> gatos = new HashSet<>();

	public GatosRepositoryOM() {
		super();
		addOneThousandCats();
	}

	private boolean addOneThousandCats() {
		GatoOM gatoOM = new GatoOM();
		int thousand = 1000;
		do {
			gatos.add(gatoOM.getRandomCat());
		} while (gatos.size() < thousand);
		return true;
	}

	public Set<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(Set<Gato> gatos) {
		this.gatos = gatos;
	}

	public boolean add(Gato e) {
		return gatos.add(e);
	}

	public void ejemplo() {
		// para hacer depuracion
		// Stream cc=gatos.stream().filter(()->);
		// System.out.println();
		// Stream ca=cc.map().filter()
		// System.out.println();
		// .collect();
		// para hacer log
		// gatos
		// .stream()
		// .filter(()->)
		// .map()
		//// .peek((a)->{syso})
		// .filter()
		// .collect();
	}

	public int size() {
		return gatos.size();
	}

}
