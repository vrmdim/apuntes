package clase;

import java.util.Arrays;

public class EjArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ARRAY DE LEN 100 QUE CADA POSICION TENGA SU INDICE
		int[] array100;
		
		array100 = new int[100];
		
		
		for (int i=0; i<100; i++) {
			
			array100[i] = i;
			
		}
		
		System.out.println(Arrays.toString(array100));

		
	}

}
