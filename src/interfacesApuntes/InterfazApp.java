package interfacesApuntes;

// CONTRATO / PLANTILLA. SIMILAR A METODOS ABSTRACTOS, PUES SOLO SE DECLARAN CABECERAS DE METODOS
// No tienen atributos (si constantes y metodos). SUELEN DENOMINARSE CON ACCIONES pintable, auditable, etc.
// OBLIGA A DECLARAR LAS FUNCIONES DE LA INTERFAZ EN LA CLASE QUE LO IMPLEMENTA

/**
 * 
 * POTENCIALIDAD DE LAS INTERFACES: SOLO SE PUEDE HEREDAR DE UNA CLASE, PERO SE PUEDEN IMPLEMENTAR MUCHAS INTERFACES.
 * EJ. YATE PERTENECE A EMBARCACION, COCHE PERTENECE A VEHICULO; AMBOS PODRÍAN IMPLEMENTAR arrancable().
 * Si no, tendría que ir poniendo abstractas todas las clases donde quiero que se implemente cierto método.  
 *
 */

public class InterfazApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * CLASE ANONIMA QUE IMPLEMENTE INTERFAZ
		 */
		
		// PUEDO DECLARAR COMO PADRE, PERO INSTANCIAR COMO HIJO; Y SE COMPORTARA COMO OBJETO HIJO
		Arrancable arrancable_coche = new Coche();
		// PARA VER TIPO DE OBJETO - devuelve coche pero tendria que ser anonima?
		System.out.println(arrancable_coche.getClass().getSimpleName());
		
		
		
		Arrancable arrancable = new Arrancable() {

			@Override
			public boolean esReparable() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		// ESTE NO DEVUELVE NADA
		System.out.println(arrancable.getClass().getSimpleName());
		
		
		/*
		 * LISTA DE LAS CLASES ARRANCABLES
		 */
		System.out.println();
		System.out.println("LISTAMOS ARRANCABLES:");
		Arrancable[] listArrancables= {arrancable, arrancable_coche};
		
		for (int i=0; i < listArrancables.length; i++) {
			
			System.out.println(listArrancables[i].getClass().getSimpleName());
			
		}
		
		
	}

}











