package ejerciciosObjetos;

public class EjerciciosObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ENUM ES UNA CLASE ESPECIAL DE CONSTANTES
		enum Level {
			
			LOW,
			MEDIUM,
			HIGHT
			
		}
		
		Level nivel = Level.MEDIUM;
		
		System.out.println(nivel);
		
		
		
		
		/**
		 * 
		 * EJERCICIO CUENTA
		 * 
		 */
		System.out.println();
		System.out.println("EJERCICIO CUENTA");
		
		Cuenta miCuenta = new Cuenta("Antonio", 1000);
		
		miCuenta.ingresar(50);
		System.out.println(miCuenta.getCantidad());

		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getCantidad());
		
		System.out.println(miCuenta.toString());
		
		
		
		/**
		 * 
		 * EJERCICIO PERSONA
		 * 
		 */
		System.out.println();
		System.out.println("EJERCICIO PERSONA");
		
		Persona david = new Persona();
		System.out.println(david.getSexo());
		
		Persona maria = new Persona("maria", 13, 'M');
		System.out.println(maria.getSexo());
		
		System.out.println(maria.toString());
		
		
	}

}
