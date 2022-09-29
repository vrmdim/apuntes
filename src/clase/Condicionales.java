package clase;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		String mensaje = "Hola";

			if (a + 1 < 10) {
				boolean prueba = true;
				System.out.println(prueba);
				a = 0;
				System.out.println(mensaje);
			}

			// PRUEBA NO ACCESIBLE AQUI
			//System.out.println(prueba);
			System.out.println(a);
			
			
			
			switch (mensaje) {
			case "Hola":
				
				System.out.println("hola mundo ejecutado");
				break;

			default:
				break;
			}
	}
	
		

}
