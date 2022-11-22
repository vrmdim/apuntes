package genericos;

import java.time.LocalDate;

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
	}

}
