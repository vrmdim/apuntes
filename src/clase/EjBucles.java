package clase;

import java.util.Random;
import java.util.Scanner;

// ADIVINA NUMERO
public class EjBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		System.out.println(adivinaNumero());
		
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
		
		msg += "El numero secreto es " + numeroSecreto + ". Ha consumido " + c + " intentos.";
		
		return msg;
		
	}

}
