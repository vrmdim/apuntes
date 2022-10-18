package objetos;

// TIPOS POR REFERENCIA: ARRAYS, INTERFACES, CLASES, GENERICOS (tipos por referencia) 


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche = new Coche();
		
		// ACCEDER ASI A LAS VARIABLES NO ES BUENA PRACTICA (numRuedas deberia estar private, y no verse asi)
		//System.out.println(miCoche.numRuedas);
		
		// GETTER
		System.out.println(miCoche.getNumRuedas());

		
		Coche suCoche = new Coche("bastidor CASFD", "verde", "", true);
		
		System.out.println(suCoche.getNumRuedas());
		
		
		Coche cocheSinMarca = new Coche(null, null, null, false);
		System.out.println(cocheSinMarca.getColor());
		
		
		// IMPRIME EL OBJETO objetos.Coche@1b701da1
		System.out.println(suCoche.toString());
		
		// = Y equals
		cocheSinMarca = miCoche;
		System.out.println(miCoche.equals(cocheSinMarca));
		System.out.println(miCoche == cocheSinMarca);
	}

}
