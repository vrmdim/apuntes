package clase;

import java.util.Random;
import java.util.Scanner;


// ADIVINA NUMERO
public class EjBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		
		//System.out.println(adivinaNumero());
		
		
		//System.out.println(clasificaNumeros());
		
		
		//int pares;
		//pares = getPares(3, 7);
		//System.out.println("El numero de pares es " + pares);
		
		
		//printLetras();
		
		
		getIntervalo();
		
		
		
	}
	
	
	
	static String adivinaNumero() {
		
		String msg = "";
		int num;
		int c = 0;
		int intentos = 10;
		
		// CREAMOS ESCANER
		Scanner escaner = new Scanner(System.in);
		
		// CREAMOS OBJETO RANDOM PARA GENERAR NUMEROS
		Random numRandom = new Random();
		int numeroSecreto = numRandom.nextInt(1, 101);
		
		// BUCLE PARA SOLICITAR NUEVO NUMERO
		do {
			
			System.out.println("Adivine el numero secreto");
			System.out.println();
			num = escaner.nextInt();
			
			c +=1;
			
			if (c > intentos) {
				
				msg = "Ha superado el numero de intentos. ";
				break;
			}
			
			if (num < numeroSecreto) {
				
				System.out.println("El numero secreto es mayor que " + num);
				
			} else if (num > numeroSecreto) {
				
				System.out.println("El numero secreto es menor que " + num);
				
			}
			
					
			
		} while (num != numeroSecreto);
		
		// CERRAMOS escaner
		escaner.close();
		
		msg += "El numero secreto es " + numeroSecreto + ". Ha consumido " + c + " intentos.";
		
		return msg;
		
	}
	
	
	/**
	 * Este metodo me dice cuantos numeros son mayor, menor o igual a 0
	 */
	static String clasificaNumeros() {
		
		int menor = 0;
		int mayor = 0;
		int igual = 0;
		int totalNumeros;
		
		// ESCANER
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introduzca cuántos números quiere introducir");
		
		totalNumeros = escaner.nextInt();
		
		// PEDIMOS TANTOS NUMEROS COMO HAYA SOLICITADO 
		for (int i = 0; i < totalNumeros; i++) {
			
			System.out.println("\nIntroduzca un numero");
			int num = escaner.nextInt();
			
			if (num > 0) {
				
				mayor+=1;
				
			} else if (num < 0) {
				
				menor+=1;
				
			} else {
				
				igual+=1;
				
			}			
		}
							
		return "Menores que 0 --> " + menor + "\nMayores que 0 --> " + mayor + "\nIguales a 0 --> " + igual;
		
	}
	
	
	
	// METODO QUE INDICA CANTIDAD DE PARES QUE HAY ENTRE DOS NUMEROS
	static int getPares(int numA, int numB) {
		
		int numPares = 0;
		
		for (int i=numA+1; i<numB; i++) {
			
			// SI ES PAR, AUMENTAMOS CONTADOR
			if (i % 2 == 0) {
				
				numPares++;
				
			}
		}
		
		
		return numPares;
		
	}
	
	
	
	// METODO PARA SACAR POR CONSOLA "ZYXWVUTSRQPONMLKJIHGFEDCBA, YXWVUTSRQPONMLKJIHGFEDCBA ... BA, A"
	static void printLetras() {
		
		String letras = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
		
		
		while (letras.length() > 0){
			
			System.out.println(letras);
			letras = letras.substring(1);
			
		}
		
	}
	
	
	
	// METODO PARA INTRODUCIR UN INTERVALO DE DOS NUMEROS, Y CONTAR CUANTOS ESTAN DENTRO Y FUERA DE ESE INTERVALO
	static void getIntervalo() {
		
		int limiteInferior, limiteSuperior, num, sumatorio,sumatorio_fuera_intervalo;
		num = 1;
		sumatorio = 0;
		sumatorio_fuera_intervalo = 0;
		
		Scanner escaner = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Introduzca el limite inferior");
			limiteInferior = escaner.nextInt();
			
			System.out.println("Introduzca el limite superior");
			limiteSuperior = escaner.nextInt();
			
		} while (limiteSuperior<limiteInferior);
		
		
		System.out.println("Introduzca números; cuando introduzca el 0 terminará");
		
		while (num != 0) {
			
			num = escaner.nextInt();
			
			
			// SUMA DE LOS NUMEROS
			sumatorio += num;
			
			// CANTIDAD DE NUMEROS FUERA DEL INTERVALO
			if ((num > limiteSuperior) || (num < limiteInferior)){
				
				sumatorio_fuera_intervalo += 1;
				
			}
			
			
			// INFORMA NUMERO IGUAL A LIMITE DE INTERVALO
			if ((num == limiteInferior) || (num == limiteSuperior)){
				
				System.out.println("Ha introducido un numero igual al limite, el " + num);
				
			}
			
			
		} 
			
		System.out.println("Sumatorio " + sumatorio);
		System.out.println("Sumatorio de numeros fuera del intervalo " + sumatorio_fuera_intervalo);
			
		escaner.close();
	}
	
	
	
	// METODO PARA CALCULAR PAGO A PLAZOS
	static int pagoAplazos(double costeProducto, double primeraMensualidad) {
			
		int numMensualidades;
		double cantidadAmortizada;
		
		cantidadAmortizada = 0;
		numMensualidades = 0;
		
		
		while (cantidadAmortizada < costeProducto) {
			
			
			
		}
		//primeraMensualidad * numMensualidades = costeProducto
		
		
		return numMensualidades;
			
	}
	
	
}

























