package clase;

public class EjBucleCollatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		collatz(100);

	}
	
	
	
	// NUMERO PAR SE DIVIDE ENTRE 2, SI ES IMPAR SE MULTIPLICA POR 3 Y SE SUMA 1 AL RESULTADO
	static void collatz(int num) {
		
		int resultado = num;
		
		while (resultado != 1) {
		
			// SI ES PAR
			if (resultado % 2 == 0) {
				
				resultado = resultado/2;
				System.out.println(resultado);
				
			} else {
				
				resultado = resultado * 3 + 1;
				System.out.println(resultado);
				
			}
			
		}
		
		
	}

}
