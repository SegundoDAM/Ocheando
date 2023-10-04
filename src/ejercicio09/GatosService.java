package ejercicio09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GatosService {
	private GatosRepository gatosRepository;

	public GatosService() {
		super();
		gatosRepository=new GatosRepository();
		addOneThousandCats();
	}
	
	public void addOneThousandCats() {
		GatoOM gatoOM=new GatoOM();
		int maximoGatos = 1000;
		do {
			gatosRepository.addGato(gatoOM.getRandomCat());				
		}while(gatosRepository.size()<maximoGatos);
	}
	public Map<Raza, Long> findCatsByRace(){
		List<Raza> asList = Arrays.asList(Raza.values());
		Map<Raza, Long> mapa = new HashMap();
		for (Raza raza : asList) {
			mapa.put(raza,gatosRepository.findAll().stream()
					.filter((gatete)->{return gatete.equalsRaza(raza);}).count());
		}
		return mapa;
	}
	
}
