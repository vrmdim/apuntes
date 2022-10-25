package ejerciciosObjetos;



public class Cuenta {

	private String titular;
	private double cantidad;
	
	
	// CONSTRUCTORES
	public Cuenta(String titular) {
		
		this.titular = titular;
		
	}
	
	public Cuenta(String titular, double cantidad) {
		
		this.titular = titular;
		this.cantidad = cantidad;
		
	}

	
	// GETERS
	protected String getTitular() {
		return titular;
	}

	protected double getCantidad() {
		return cantidad;
	}
	
	// SETTERS
	protected void setTitular(String titular) {
		this.titular = titular;
	}

	protected void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	

	// toString
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	
	
	// METODOS
	public void ingresar(double cantidad) {
		
		if (cantidad > 0) {
			
			//this.cantidad += cantidad;
			setCantidad(this.cantidad + cantidad);
			
		}
		
	}
	
	public void retirar(double cantidad) {
		
		
		if (cantidad > this.cantidad) {
			
			//this.cantidad = 0;
			setCantidad(0);
		} else {
			
			//this.cantidad -= cantidad;
			setCantidad(this.cantidad - cantidad);
		}
		
	}
	
	
	
	
	
	
	
}
