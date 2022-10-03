package quicks;

public class Quick5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salario;
		
		//salario = calculaSalario(40, 49, 16, 20);
		salario = calculaSalarioTernario(40, 49, 16, 20);
		
		System.out.println("El salario del trabajador es: "+ salario+ " euros.");
		

		
		

	}
	
	
	// METODO PARA CALCULAR SALARIO
	static int calculaSalario(int horasJornadaLaboral, int horasTrabajadas, int precioHora, int precioExtra) {
		
		int salario = 0;
		
		
		// CALCULAMOS SALARIO EN FUNCION DE HORAS TRABAJADAS
		if (horasTrabajadas <= horasJornadaLaboral) {
					
			salario += precioHora*horasTrabajadas;
				
		// SI TRABAJA MAS DE CUARENTA HORAS
		} else if (horasTrabajadas > horasJornadaLaboral) {
			
			salario += horasJornadaLaboral*precioHora;
			salario +=  (horasTrabajadas-horasJornadaLaboral)*precioExtra;
			
		}
	
		
		return salario;
		
	}
	
	
	// METODO PARA CALCULAR SALARIO CON TERNARIO
		static int calculaSalarioTernario(int horasJornadaLaboral, int horasTrabajadas, int precioHora, int precioExtra) {
			
			
			return horasTrabajadas <= horasJornadaLaboral ? precioHora*horasTrabajadas : horasJornadaLaboral*precioHora+(horasTrabajadas-horasJornadaLaboral)*precioExtra;

		
			
		}

}
