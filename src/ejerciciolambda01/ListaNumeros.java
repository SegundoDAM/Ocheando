package ejerciciolambda01;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListaNumeros {
    public void imprimirNumeros(List<Integer> numeros) {
        for (Integer numero : numeros) {
            if(numero%10==0)System.out.println(numero);
        }
    }
    
    @Test
     void test() {
        ListaNumeros listaNumeros = new ListaNumeros();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(30);
        listaNumeros.imprimirNumeros(numeros);
    }
}
