package herencias;

public class Television extends Electrodomestico{
	
	
	private double resolucion;
	private boolean smartTV;
	
	private static final double RESOLUCION_DEF = 20;
	private static final boolean SMARTTV_DEF = false;
	
	
	// CONSTRUCTORES
	public Television() {	
		super();
		this.resolucion = RESOLUCION_DEF;
		this.smartTV = SMARTTV_DEF;
		
	}
	
	
	public Television(double precio, double peso) {
		
		super(precio, peso);
		this.resolucion = RESOLUCION_DEF;
		this.smartTV = SMARTTV_DEF;
		
	}
	
	
	public Television(double precioBase, String color, char consumo, double peso, double resolucion, boolean smartTV) {
		
		super(precioBase, color, consumo,peso);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
		
		
	}

	
	// METODOS - precioFinal --> POLIMORFISMO
	@Override
	public double precioFinal(){
		
		double precio = super.precioFinal();
		
	    if (smartTV) {
			
			precio += 50;
			
		}
		
	    // PONGO ESTE EN ULTIMO LUGAR
		if (resolucion > 40) {
				
				precio *= 1.30;
				
		}
		
		return precio;
		
	}
	
	
	
	// GETTERS Y SETTERS
	public double getResolucion() {
		return resolucion;
	}


	public boolean isSmartTV() {
		return smartTV;
	}


	protected void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}


	protected void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}


	
	
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", smartTV=" + smartTV + "], " + super.toString();
	}
	
	
	
	
	

	
	
	
	
	

}
