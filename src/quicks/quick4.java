package quicks;

public class quick4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int JORNADA40 = 40;
		final int SALARIO_HORA = 16;
		final int HORA_EXTRA = 20;
		int salario = 0;
		
		// CAMBIAR ESTE VALOR POR LAS HORAS TRABAJADAS
		int horasTrabajadas = 49;
		
		
		// CALCULAMOS SALARIO EN FUNCION DE HORAS TRABAJADAS
		if (horasTrabajadas <= 40) {
			
			salario += SALARIO_HORA*horasTrabajadas;
		
		// SI TRABAJA MAS DE CUARENTA HORAS
		} else if (horasTrabajadas > 40) {
			
			salario += JORNADA40*SALARIO_HORA;
			salario +=  (horasTrabajadas-JORNADA40)*HORA_EXTRA;
			
		}
		
		System.out.println("El salario del trabajador por hacer "+ horasTrabajadas+" horas es: "+ salario+ " euros.");

		
		
		// CON TERNARIOS
		salario = 0;
		
		salario = horasTrabajadas <= 40 ? SALARIO_HORA*horasTrabajadas : JORNADA40*SALARIO_HORA+(horasTrabajadas-JORNADA40)*HORA_EXTRA;
		System.out.println("El salario del trabajador por hacer "+ horasTrabajadas+" horas es: "+ salario+ " euros.");

	
	}
	
	
	

}











