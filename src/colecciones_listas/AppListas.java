package colecciones_listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//VAMOS A USAR EL EJEMPLO DE ELECTRODOMESTICOS
import herencias.Electrodomestico;
import herencias.Lavadora;
import herencias.Television;

public class AppListas {

	/*
	 * COLECCIONES: SOLO ADMITEN OBJETOS (NO PRIMITIVOS) como arrays pero con estructura dinamica, 
	 * bebe de interfaz Collection.
	 * 
	 * De Collection heredan otras Clases como List y Set (estFLAGa ultima no la veremos).
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
		
		// CLEAR --> elimina la lista

		//listaElectrodomestico.clear();
		
		
		// SIZE
		System.out.println();
		System.out.println("SIZE:");
		System.out.println(listaElectrodomestico.size());
		
		
		// IS EMPTY (boolean)
		System.out.println();
		System.out.println("IS EMPTY:");
		System.out.println(listaElectrodomestico.isEmpty());
		
		
		// CONTAINS (objeto)
		System.out.println("CONTAINS:");
		System.out.println(listaElectrodomestico.contains(television4));
		
		
		// TO STRING - lista
		System.out.println("TO STRING");
		System.out.println(listaElectrodomestico.toString());
		
		
		// FOR MEJORADO
		for (Electrodomestico electrodomestico : listaElectrodomestico) {
			
			System.out.println(electrodomestico.getPrecioBase());
			
		}
		
		// LAMBDAS
		listaElectrodomestico.forEach(electro -> System.out.println(electro.getColor()));
		
		
		
		/*
		 * Creamos lista
		 */
		
		System.out.println();
		System.out.println("LISTAS");
		
		List<Television> listaTelevision = new ArrayList<>();
		
		listaTelevision.add(television1);
		listaTelevision.add(television2);
		listaTelevision.add(television3);
		
		
		// CONTAINS ALL (lista electrodomestico contiene todos los elementos de la lista Television?)
		System.out.println("CONTAINS ALL");
		System.out.println(listaElectrodomestico.containsAll(listaTelevision));
		
		
		// ADD ALL, añade una lista dentro de la coleccion (los duplica si ya estan)
		System.out.println();
		System.out.println("ADD ALL");
		listaElectrodomestico.addAll(listaTelevision);
		
		System.out.println(listaElectrodomestico.toString());
		System.out.println("SIZE");
		System.out.println(listaElectrodomestico.size());
		
		// REMOVE ALL
		System.out.println();
		System.out.println("REMOVE ALL listaTelevision from listaElectrodomestico");
		listaElectrodomestico.removeAll(listaTelevision);
		System.out.println("SIZE --> borra objetos duplicados tambien");
		System.out.println(listaElectrodomestico.size());
		
		
		
		// CONVERTIR A ARRAY PARA TRABAJAR CON INDICES
		System.out.println();
		System.out.println("TO ARRAY");
		
		Object[] arrayTelevisiones = listaTelevision.toArray();
		
		for (int i=0; i < arrayTelevisiones.length; i++) {
			
			System.out.println(arrayTelevisiones[i].getClass().getSimpleName());
			
		}
		
		
		
		/**
		 * 
		 * METODOS DE LISTA
		 * 
		 */
		System.out.println();
		System.out.println("METODOS DE LISTA");
		
		// OBTENER EL PRIMER ELEMENTO
		System.out.println(listaTelevision.get(0));
		
		// CAMBIAR UN VALOR DE UN ELEMENTO EXISTENTE DE LA LISTA
		listaTelevision.set(0, television5);
		System.out.println(listaTelevision.get(0));
		
		// ADD
		System.out.println();
		System.out.println("ADD element to list");
		System.out.println(listaTelevision.size());
		listaTelevision.add(television1);
		System.out.println(listaTelevision.size());
		
		// AÑADIR Y DESPLAZAR
		System.out.println();
		System.out.println("AÑADIR A POSICION Y DESPLAZAR");
		System.out.println(listaTelevision.toString());
		listaTelevision.add(0, television1);
		System.out.println(listaTelevision.toString());
		
		
		// DEVOLVER POSICION DE UN OBJETO
		System.out.println();
		System.out.println("DEVOLVER POSICION DE UN OBJETO");
		System.out.println(listaTelevision.indexOf(television5));
		
		
		// EQUALS. se puede definir equals() en cada clase para decidir que criterio de atributos 
		//seguir para devolver que son iguales dos objetos. Si no sobreescribimos ese metodo nos dira si son el mismo objeto.
		
		// PODEMOS GENERAR CON CLICK DCHO GENERATE EQUALS EN EL OBJETO QUE QUERAMOS. LO HACEMOS EN Television
		System.out.println("EQUALS");
		System.out.println(television1.equals(television2));	// FALSE
		System.out.println(television3.equals(television2));	// TRUE
		
		
		
		/**
		 * INTERFAZ COMPARABLE
		 */
		// ORDENAR LISTAS
		// para ordenar una lista, el objeto debera implementar la interfaz Comparable, con la funcion comparteTo()
		// EXAMEN: Ordenar por método natural = definir qué criterio de ordenación vamos a usar a través de la interfaz
		// Comparable y metodo compareTo()
		// NOTA: no hay que crear interfaz Comparable (es importar la de la API de Java)
		// EJ, public class Electrodomestico implements Comparable <Electrodomestico>
		
		System.out.println();
		System.out.println("SORT LIST:");
		System.out.println(listaTelevision);
		listaTelevision.sort(null);
		System.out.println(listaTelevision);

		
		// MAX en una COLECCION (usando el criterio del compareTo()).
		System.out.println();
		System.out.println("maximo en la coleccion");
		System.out.println(Collections.max(listaElectrodomestico));
		System.out.println();
		
		// DESORDENAR LISTA
		System.out.println("MEZCLAR LISTA / DESORDENAR");
		Collections.shuffle(listaTelevision);
		System.out.println(listaTelevision);
				
		
		
		/*
		 * 
		 * METODO SPREAD (addListas.java)
 		 * 
		 */
		
		
		/**
		 * TIPO CRUDO. Podemos no poner el tipo de lista, se comporta como un lenguaje debilmente tipado
		 * 
		 */
		List listaCruda = new ArrayList<>();
		
		
		
		
		
	}
	
	private static void imprimirCrudo(List listaCruda) {
		
		for (Object object : listaCruda) {
			
		}
		
	}

}




















