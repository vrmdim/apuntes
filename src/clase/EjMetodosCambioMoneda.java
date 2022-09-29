package clase;

import java.util.Scanner;

//Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
// El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que será un String, este no devolverá ningún valor, 
// mostrara un mensaje indicando el cambio (void).
//El cambio de divisas son:
//
//0.87 libras es un 1 €
//0.99 $ es un 1 €
//140.52 yenes es un 1 €


public class EjMetodosCambioMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int cantidadEuros, opcion;
		String msg;
		 
		
		
		// CREAMOS ESCANER
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduzca una cantidad de euros a convertir");
		cantidadEuros = escaner.nextInt();
		
		opcion = 0;
		
		while (opcion <= 0 || opcion > 3){
			
			System.out.println("¿A qué moneda quiere realizar el cambio?");
			System.out.println("1 --> Libras");
			System.out.println("2 --> Dólares");
			System.out.println("3 --> Yenes");
			opcion = escaner.nextInt();
			
		}
		
		msg = convertirAeuros(cantidadEuros,opcion);
		System.out.println(msg);
		
		
	
	}
	
	
	// METODO PARA CONVERSION DE MONEDAS
	static String convertirAeuros(double cantidadEUR, int opcion) {
		
		final double LIBRAEUR = 0.87;
		final double USDEUR = 0.99;
		final double YENEUR = 140.52;
		
		String msgConvertido = "";
		
		switch (opcion) {
		
		case 1: {
			
			msgConvertido = cantidadEUR * LIBRAEUR+ " Libras";
			break;
		}
		
		case 2: {
			
			msgConvertido = cantidadEUR * USDEUR+ " Dolares";
			break;

		}
		
		case 3: {
			
			msgConvertido = cantidadEUR * YENEUR+ " Yenes";
			break;
		}
		
		default:
			break;
		
	}
		
		return msgConvertido;

		
	}
	
	

}























