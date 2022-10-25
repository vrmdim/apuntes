package herencias;

public class Vehiculo {
	
	// SOLO SE VE DESDE LA CLASE
	private String marca;
	// SE VE DESDE LA CLASE Y DESDE EL PAQUETE
	int numeroRuedas;
	// SE VE DESDE CLASE, PAQUETE Y SUBCLASES (HIJOS)
	protected String color;
	
	
	
	// CONSTRUCTORES
	
	public Vehiculo() {
		
	}
	
	
	public Vehiculo(String marca, int numeroRuedas, String color) {
		this.marca = marca;
		this.numeroRuedas = numeroRuedas;
		this.color = color;
	}

	
	
	// GETTERS Y SETTERS
	public String getMarca() {
		return marca;
	}
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public String getColor() {
		return color;
	}
	
	
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	protected void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", numeroRuedas=" + numeroRuedas + ", color=" + color + ", getMarca()="
				+ getMarca() + ", getNumeroRuedas()=" + getNumeroRuedas() + ", getColor()=" + getColor() + "]";
	}
	
	
		
	
	
}
