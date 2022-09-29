package clase;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		saludo("hola");
		saludo(" mundo");
		saludo("!");
		
		System.out.println("");
		contador(10, 15);
		contador(5);

		
	}
	
	
	// METODO PUBLICO FUERA DE MAIN
	public static void saludo(String texto) {
		
		System.out.print(texto);

		
		
	}
	
	
	
	// METODO CONTADOR con sobrecarga (repito metodo en funcion de parametros que quiera meter)
	static void contador(int min, int max) {
		
		for (int i=min; i < max+1 ; i++) {
			System.out.println(i);
		}
		
		
	}
	
	// SOBRECARGA SOLO CON EL MAX
	static void contador(int max) {
		
		for (int i=1; i < max+1 ; i++) {
			System.out.println(i);
		}
		
		
	}


}
