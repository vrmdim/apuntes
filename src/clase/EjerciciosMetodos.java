package clase;

public class EjerciciosMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MULTIPLICAR DOS ENTEROS
		System.out.println("Multiplicamos dos enteros");
		System.out.println(multiplicaEnteros(2, 4));
		
		// POSITIVO?
		System.out.println();
		System.out.println("Es positivo?");
		System.out.println(esPositivo(-3));
		
		// HALLAR AREA CIRCULO
		System.out.println();
		System.out.println("Calculamos el area de un circulo");
		System.out.println(getAreaCirculo(0, 0, 0, 2));
		
		// FACTORIAL DE UN NUMERO
		System.out.println();
		System.out.println("calculamos factorial");
		System.out.println(getFactorial(4));
		
	}
	
	
	// METODO PARA MULTIPLICAR DOS ENTEROS
	static int multiplicaEnteros(int x, int y) {
		
		int resultado;
		
		resultado = x * y;
		
		return resultado;
		
	}
	
	
	// METODO PARA SABER SI ES POSITIVO
		static boolean esPositivo(int num) {
						
			return num >= 0;
			
		}
		
		
	// METODO PARA HALLAR AREA CIRCUNFERENCIA SABIENDO SU PUNTO CENTRO Y UN PUNTO
		static double getAreaCirculo(int xc, int yc, int xp, int yp) {
			
			final double PI = 3.14;
			double area, radio;
			
			radio = Math.sqrt(Math.pow(xp-xc, 2)+Math.pow(yp-yc, 2));
			
			area = PI*radio*radio;
			
			return area;
			
		}
		
	
	// HALLAR FACTORIAL
		static int getFactorial(int num) {
			
			int resultado;
			
			resultado = num;
			
			// CASO BASE
			if (resultado > 1) {
				
				resultado= getFactorial(resultado-1)*resultado;	
				
			}
			
	
			return resultado;
			
		}
	
		

}

















