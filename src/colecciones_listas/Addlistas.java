package colecciones_listas;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Addlistas {

	
	/**
	 * METODO SPREAD. Puedes pasarle:
	 * - un objeto
	 * - varios objetos, separados por comas
	 * - un array de objetos 
	 */
	
	public static List<String> devuelveString(String... string) {
		
		List<String> listaStrings = new ArrayList<>();
		
		listaStrings.addAll(Arrays.asList(string));
		
		System.out.println(listaStrings.toString());
		return listaStrings;
	}
	
	
	
	
	
	
}



