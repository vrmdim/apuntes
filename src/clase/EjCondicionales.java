package clase;

public class EjCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 4;
		
		// COMPROBAR SI ES PAR/IMPAR
		if (num % 2 == 0) {
			
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		
		
		// COMPROBAR CUAL ES MAYO
		int var1 = 3;
		int var2 = 2;
		
		if (var1 < var2) {
			
			System.out.println("Var 2 es mayor que Var 1");
			
		} else if (var1 > var2) {
			
			System.out.println("Var 1 mayor que Var 2");
		
			
		} else {
			System.out.println("Ambos son iguales");
		}
		
		
		// COMPROBAR SI ES PAR / IMPAR
		int numero = 3;
		
		switch (numero % 2) {
		case (0):
			System.out.println("Es par");
			break;
		case (1):
			System.out.println("Es impar");
		default:
			break;
		}
		
	}

}
