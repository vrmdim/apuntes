package herencias;

public class Lavadora extends Electrodomestico {

	
	private double carga;
	private static final double CARGA_DEF = 5;
	
	
	// CONSTRUCTORES
	public Lavadora() {
		super();	
		this.carga = CARGA_DEF;
		
	}
	
	public Lavadora(double precio, double peso) {
		
		super(precio, peso);
		this.carga = CARGA_DEF;

	}
	
	
	public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
		
		super(precioBase, color, consumo, peso);
		this.carga = carga;

	}
	
	
	
	// METODOS
	public double precioFinal() {
		
		double precio = super.precioFinal();
		
		if (carga > 30) {
			
			precio += 50;
			
		}
		
		return precio;
		
	}
	
	
	// GETTERS Y SETTERS
	public double getCarga() {
		return carga;
	}

	protected void setCarga(double carga) {
		this.carga = carga;
	}

	
	// TO STRING
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "], " + super.toString();
	}

	
	
	


	
	
	
	
	
	
	
	
	
}
