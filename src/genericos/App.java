package genericos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	
	/**
	 * 
	 * Convenio (no examen):
	 *  E: elemento coleccion
	 *  T: tipo
	 *  N: numero
	 *  K: clave
	 *  V: valor
	 *  S, U, V: terceros, cuartos... tipos
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo vehiculo1 = new Vehiculo(556);
		Moto moto1 = new Moto("moto 1");
		
		// COMO PERRO TIENE GENERICO T, le puedo identificar con cualquier cosa
		Perro<String> perro1 = new Perro("Id del perro 1");
		Perro<Integer> perro2 = new Perro(2);
		Perro<LocalDate> perro3 = new Perro(LocalDate.now());
		
		System.out.println(vehiculo1.getId());
		System.out.println(moto1.getId());
		
		
		System.out.println(perro1.getId());
		System.out.println(perro2.getId());
		System.out.println(perro3.getId());
		
		
		/*
		 * BOUNDARY: establece limites a los genericos. Es decir, podemos decir que T en Perro,
		 * debe extends de otra clase/interfaz
		 */
		
		// creamos Espia, Alistable y ConRazocinio
		
		// alistables seran los espias, militares y vehiculos; razocinio solo militares y espias
		
		
		Militar militar1 = new Militar(468749);
		Espia espia1 = new Espia();
		
		
		System.out.println();
		System.out.println("ALISTABLE");
		mostrarAlistable(militar1);
		mostrarAlistable(espia1);
		mostrarAlistable(vehiculo1);
		
		System.out.println();
		System.out.println("CON RAZOCINIO");
		mostrarConRazocinio(militar1);
		mostrarConRazocinio(espia1);
		//mostrarConRazocinio(vehiculo1);	// NO DEJA
		
		
		
		
		/**
		 * WILDCARD o comodin <?>. Representa un tipo desconocido. Equivale a <? extends Object>
		 * 
		 * - Como tipo de devolucion en un metodo
		 * - Como variable local
		 * - Como parámetro
		 * 
		 * EXAMEN: Collection<?>, podrá ser Collection<String>, Collection<Integer>...
		 * 
		 * List<Object> no puede implementar List<String>, porque "List<String>" no hereda de "List<Object>",
		 * sino que solo "String" hereda de "Object".
		 */
		
		System.out.println();
		System.out.println("WILDCARD");
		Vehiculo vehiculoNew = new Vehiculo(1);
		Moto motoNew = new Moto("Matricula Moto");
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(motoNew);
		vehiculos.add(vehiculoNew);
		
		
		// LOS VEHICULOS NO LOS PUEDO METER AQUI, PORQUE NO HEREDAN DE COCHE
		List<Moto> motos = new ArrayList<>();
		
		
		// CREAMOS LISTA QUE TRABAJE CON GENERICO T ( NO SE SI ESTA BIEN)
		List<? super Vehiculo> listaT = new ArrayList<>();
		listaT.add(motoNew);
		listaT.add(vehiculoNew);
		 
		// QUIERO UN METODO QUE ME IMPRIMA LISTA DE COCHES Y DE VEHICULOS
		imprimirFlota(vehiculos);
		imprimirFlota2(vehiculos);
		
		
		/**
		 * Otro ejemplo. Vamos a imprimir lista de identificables
		 */
		System.out.println();
		System.out.println("Wildcard Segundo Ejemplo");
		//imprimirIdentificables(Arrays.asList(militar1, new Militar(233)));
		imprimirIdentificables(Arrays.asList(militar1));
		
	
	}
	
	


	/*
	 * CREAMOS METODO PARA MOSTRAR CUALES SON ALISTABLES
	 */		
	private static <V extends Alistable> void mostrarAlistable(V alistable) {
		System.out.println(alistable.getPuesto());
	}
	
	
	/*
	 * CREAMOS METODO PARA MOSTRAR CUALES SON ALISTABLES Y CON RAZOCINIO
	 * Nota: en este ej, se podria solventar sin genericos, creando una interfaz nueva
	 * que implementara Alistabe y ConRazocinio. Pero en el examen pedira Generico.
	 */		
	private static <V extends Alistable & ConRazocinio> void mostrarConRazocinio(V alistable) {
		System.out.println(alistable.getPensamiento());
	}

	// LISTA
	private static <T extends Alistable & ConRazocinio> void mostrarListaConRazocinio(List<? extends T> alistable) {
		System.out.println(alistable.getClass().getName());
	}
	
	
	

	/*
	 * WILDCARD
	 */
	private static void imprimirFlota(List<? extends Vehiculo> vehiculos) {
		
		vehiculos.forEach(System.out::println);
	}
	
	/*
	 * Podemos hacer lo mismo asi
	 */
	private static <T extends Vehiculo> void imprimirFlota2(List<? extends T> vehiculos) {
		vehiculos.forEach(System.out::println);
		
	}
	
	
	/**
	 * Otro ejemplo de WILDCARD
	 */
	
	// IMPRIMIR LISTA DE Identificables: Lista de Identificables de ? (cualquier objeto)
	private static void imprimirIdentificables(List<Identificable<?>> listaIdentificables) {
		
		for (Identificable<?> identificable : listaIdentificables) {
			System.out.println(identificable.getId());
		}
		//listaIdentificables.forEach(i -> System.out.println(i.getId()));
	}
	
	// MISMO METODO DE OTRA FORMA ESCRITO
	private static <U extends Identificable<?>> void imprimirIdentificables2(List<U> listaIdentificables) {
		
	}
	

}











