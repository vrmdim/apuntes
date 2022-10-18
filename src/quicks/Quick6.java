package quicks;

import java.util.Scanner;

public class Quick6 {
	
	// SUPONEMOS NUMEROS ENTEROS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int sumaNumeros = 0;
		
		// CREAMOS ESCANER
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduzca 10 enteros");
		
		// Solicitamos 10 numeros y almacenamos valores
		for (int i = 0; i<10; i++) {
			
			num = escaner.nextInt(); 
			
			// SUMAMOS
			sumaNumeros += num;
			
			// CONTAMOS NEGATIVOS
			if (num < 0) {
				
				contadorNegativos += 1;
				
			// CONTAMOS POSITIVO
			}else if (num > 0) {
				
				contadorPositivos += 1;
				
			}
			
		}
		
		// DEVOLVEMOS RESULTADO
		System.out.println("La suma total de los numeros es " + sumaNumeros);
		System.out.println("Total numeros positivos " + contadorPositivos);
		System.out.println("Total numeros negativos " + contadorNegativos);
		
		
	}

}
