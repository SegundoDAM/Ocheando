package ejercicio09;

public class GatosService {
	private GatosRepository gatosRepository;

	public GatosService() {
		super();
		gatosRepository=new GatosRepository();
	}
	
	public void addOneThousandCats() {
		GatoOM gatoOM=new GatoOM();
		int maximoGatos = 1000;
		do {
			gatosRepository.addGato(gatoOM.getRandomCat());				
		}while(gatosRepository.size()<maximoGatos);
	}
	
	
}
