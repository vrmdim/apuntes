package clase;

import java.util.Arrays;

// EXAMEN: JAVA TIENE UN RECOLECTOR DE BASURA, QUE SE ENCARGA DE ELIMINAR TODAS AQUELLAS VARIABLES NO
// REFERENCIADAS. 

public class ArraysTeoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// DECLARACION DE ARRAY, sin inicializar
		int[] miArrayNumeros;
		int miArrayNumeros2[];
	
		
		
		
		// CONSTRUCCION Y ASIGNACION DE VALORES
		int edades[] = {4, 18, 17};
		int numeros[] = edades;
		int otrosNumeros[] = {4, 18};
		//System.out.println(edades[0]);
		//System.out.println(edades.length);
		
		
		// INSTANCIAMOS ARRAY DE STRINGS DE LONGITUD 2
		String miArrayString[] = new String[4];
		miArrayString[0] = "Hola";
		miArrayString[1] = " ";
		miArrayString[2] = "Mundo";
		miArrayString[3] = "!";
		
		// Recorremos array
		for (int i=0; i<miArrayString.length; i++) {
			
			System.out.print(miArrayString[i]);
			
		}
		
		System.out.println();
		
		// FOR MEJORADO - El problema de este for es que no tenemos indice, recorre siempre todo el array
		for (String s : miArrayString) {
			
			System.out.print(s);
			
		}
		
		
		// SHOW ARRAY 
		System.out.println();
		String textoArray = Arrays.toString(miArrayString);
		System.out.println();
		System.out.println(textoArray);
		
		
		// SORT ARRAY
		System.out.println();
		Arrays.sort(miArrayString);
		System.out.println(Arrays.toString(miArrayString));
		
		// COMPARAR ELEMENTOS DEL ARRAY
		System.out.println("ARRAY COMPARE");
		System.out.println(Arrays.equals(edades, numeros));
		System.out.println(Arrays.equals(edades, otrosNumeros));
		
		
		
		// COPIAR ARRAYS
		//// (array, nuevaLongitudArray)
		System.out.println();
		String[] arrayCopy = Arrays.copyOf(miArrayString,  10);
		System.out.println("Copia del array, de len 10");
		System.out.println(Arrays.toString(arrayCopy));
		System.out.println(arrayCopy.length);
		
		
		//Arrays.copyOfRange(array, indicedesde, indiceHasta);
		
		
		
		
		
	}

}
