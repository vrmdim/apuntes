package herencias;


// INDICAMOS QUE ESTA CLASE HEREDA DE VEHICULO
public class Moto extends Vehiculo{

	int cubicaje;

	
	// CONSTRUCTORES
	public Moto() {
		// HAY QUE LLAMAR AL CONSTRUCTOR POR DEFECTO DEL PADRE (SI NO LO PONEMOS ECLIPSE LO LLAMARÁ IGUALMENTE)
		//super();
		// SI CONSIDERAMOS QUE TIENEN SIEMPRE 2 RUEDAS
		super("", 2 ,"");
		
		
	}
	
	public Moto(int cubicaje) {
		super();
		this.cubicaje = cubicaje;
	}
	
	
	// CONSTRUCTOR COMPLETO, CON LA CLASE PADRE
	public Moto(String marca, int numeroRuedas, String color, int cubicaje) {
		
		// COMO ESTAMOS CREANDO UN OBJETO VEHICULO, LLAMA A super()
		super(marca, numeroRuedas, color);
		
		// AQUI PONEMOS LOS ATRIBUTOS DEL HIJO
		setCubicaje(numeroRuedas);
		
	}
	
	
	// METODO (Es buena costumbre poner Override para sobreescribir el metodo del padre; aunque funciona igual)
	@Override
	public String arrancar() {
		
		return "Arrancando moto...";
		
	}
	
	
	// GETTERS SETTERS
	public int getCubicaje() {
		return cubicaje;
	}



	protected void setCubicaje(int cubicaje) {
		this.cubicaje = cubicaje;
	}

	@Override
	public String toString() {
		return "Moto [cubicaje=" + cubicaje + ", numeroRuedas=" + numeroRuedas + ", color=" + color + "]";
	}

	
	

	
	
	
	
	
				
}
