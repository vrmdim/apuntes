package colecciones_listas;

import java.util.ArrayList;
import java.util.Collection;

//VAMOS A USAR EL EJEMPLO DE ELECTRODOMESTICOS
import herencias.Electrodomestico;
import herencias.Lavadora;
import herencias.Television;

public class AppListas {

	/*
	 * COLECCIONES: SOLO ADMITEN OBJETOS (NO PRIMITIVOS) como arrays pero con estructura dinamica, 
	 * bebe de interfaz Collection.
	 * 
	 * De Collection heredan otras Clases como List y Set (esta ultima no la veremos).
	 * 
	 * LIST: son colecciones que admiten primitivos y objetos.
	 * 
	 * 	- ArryList <E>
	 * 	- LinkedList <E> --> diferentes rendimientos; solo veremos ArrayList
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SI NO PONEMOS NADA EN EL TIPO DE ARRAYLIST, ENTIENDE QUE ES Electrodomestico
		////Collection<Electrodomestico> listaElectrodomestico = new ArrayList<Electrodomestico>();
		Collection<Electrodomestico> listaElectrodomestico = new ArrayList<>();
		
		
		Lavadora lavadora1 = new Lavadora(200, 50); 
		Lavadora lavadora2 = new Lavadora(200, 50); 
		Lavadora lavadora3 = new Lavadora(300, "blanco", 'F', 60, 8); 
		Lavadora lavadora4 = new Lavadora(300, "blanco", 'D', 60, 8); 
		Electrodomestico electrodomestico1 = new Electrodomestico(250, 40); 
		Television television1 = new Television(100, 20); 
		Television television2 = new Television(100, "negro", 'D', 20, 1080, true); 
		Television television3 = new Television(100, "negro", 'E', 20, 1080, true); 
		Television television4 = new Television(100, "gris", 'F', 20, 1080, true); 
		Television television5 = new Television(100, "negro", 'A', 20, 1080, true); 
		
		
		
		/*
		 * METODOS DE COLLECTION
		 */
		
		// AÑADIMOS A LA LISTA LOS OBJETOS
		listaElectrodomestico.add(lavadora1);
		listaElectrodomestico.add(lavadora2);
		listaElectrodomestico.add(lavadora3);
		listaElectrodomestico.add(lavadora4);
		listaElectrodomestico.add(electrodomestico1);
		listaElectrodomestico.add(television1);
		listaElectrodomestico.add(television2);
		listaElectrodomestico.add(television3);
		listaElectrodomestico.add(television4);
		listaElectrodomestico.add(television5);
		
		
		// IMPRIMIR LISTA (ESTE FORMATO ES LAMBDA DE MOMENTO NO LO VEMOS)
		listaElectrodomestico.forEach(System.out::println);
		
		
		// REMOVE
		System.out.println();
		listaElectrodomestico.remove(television5);
		// IMPRIMIR LISTA (ESTE FORMATO ES LAMBDA DE MOMENTO NO LO VEMOS)
		listaElectrodomestico.forEach(System.out::println);
		
		
		
	}

}




















