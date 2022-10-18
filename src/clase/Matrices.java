package clase;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] miMatriz;
		
		// DECLARAMOS
		miMatriz = new int[4][3];
		
		/*
		 * 1 2 3
		 * 4 5 6
		 */
		
		int [][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
		//System.out.println("myNumbers length = " + myNumbers.length);
		
		
		
		/// EJ 6 CREAR MATRIZ IDENTIDAD
		//System.out.println();
		//System.out.println("CREAR MATRIZ IDENTIDAD");
		//crearMatrizIdentidad(8, 3);
		
		
		// EJ 10.
		System.out.println("EJERCICIO 10");
		ordenarArray();
		

	}
	
	// CREAR MATRIZ IDENTIDAD DE DOS DIMENSIONES
	static void crearMatrizIdentidad(int n,int m) {
		
		int[][] matrizIdentidad;
		matrizIdentidad = new int[n][m];
		
		
		for (int i=0; i<matrizIdentidad.length; i++){
			for (int j=0; j<matrizIdentidad[i].length; j++) {
				
				if (i == j) {
					
					matrizIdentidad[i][j] = 1;
					
				}else {
					
					matrizIdentidad[i][j] = 0;
					
				}
				
			}		
		}
		
		//System.out.println(Arrays.toString(matrizIdentidad));
		pintarMatriz(matrizIdentidad);
		
	}
	
	
	// METODO PARA PINTAR MATRIZ
	static void pintarMatriz(int[][] thisMatriz) {
		
		for (int i = 0; i<thisMatriz.length; i++) {
			
			System.out.println(Arrays.toString(thisMatriz[i]));
			
			
		}
		
	}
	
	
	// EJERCICIO 10. Ordenar array de strings
	static void ordenarArray() {
		
		String[] miArray = {"Pepe", "María", "Josefina", "jose", "Manuel", "alonso", "Valentina"};
		
		System.out.println(Arrays.toString(miArray));
		
		// PASAMOS TODO A MINUSCULAs
		for (int i = 0; i< miArray.length; i++) {
			
			miArray[i] = miArray[i].toLowerCase();
			
		}
		
		Arrays.sort(miArray);
		
		System.out.println(Arrays.toString(miArray));
		
	
			
			
			
		
		
	}
	

}










