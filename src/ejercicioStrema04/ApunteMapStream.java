package ejercicioStrema04;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;


public class ApunteMapStream  {
	@Test
	void test() {
	List<Cliente> clientes = ClientesOM.getClientes();
		List<Socio> socios= clientes.stream()
				.map((cliente)->{return new Socio(cliente.getNombre(), new Random()
						.nextInt(1000));})
				.collect(Collectors.toList());
	System.out.println(socios);
	//vamos a mejorar pedidoempresav2
	System.out.println(clientes);
	Collections.reverse(clientes);
	System.out.println(clientes);
}
}
