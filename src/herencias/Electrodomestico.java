package herencias;

public class Electrodomestico {
	
	// ATRIBUTOS
	private double precioBase, peso;
	private String color;
	private char consumo;

	
	// POR DEFECTO (CONSTANTES)
	private final static double PESO_DEF = 5;
	private final static double PRECIO_DEF = 100;
	private final static String COLOR_DEF = "blanco";
	private final static char CONSUMO_DEF = 'F';

	
	
	// CONSTRUCTORES
	public Electrodomestico() {
		
		this.color = COLOR_DEF;
		this.consumo = CONSUMO_DEF;
		this.precioBase = PRECIO_DEF;
		this.peso = PESO_DEF;
		
	}
	
	
	// CONSTRUCTOR CON PRECIO Y PESO
	public Electrodomestico(double precioBase, double peso) {
		
		this.precioBase = precioBase;
		this.peso = peso;
		
	}


	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		
		this.precioBase = precioBase;
		setColor(color);
		setConsumo(consumo);
		this.peso = peso;
		
	}
	
	
	// METODOS
	private boolean comprobarConsumoEnergetico(char letra) {
		
		boolean isLetraOK = false;
		// A-F
		if (consumo=='A' | consumo=='B' | consumo=='C' | consumo=='D' | consumo=='E' | consumo=='F') {
			
			isLetraOK = true;
			
		} 
		return isLetraOK;
		
	}
	
	
	private boolean comprobarColor(String color){
		
		boolean isColorOK = false;
		
		
		// blanco, negro, rojo, azul y gris
		if (color=="blanco" || color=="negro" || color=="rojo" || color=="azul" || color=="gris") {
			
			isColorOK = true;
			
		}
		
		return isColorOK;
	}
	
	
	
	private double precioFinal(char consumo, double peso) {
		
		double precio = 0;
		
		// SEGUN CONSUMO
		switch (consumo) {
		
			case 'A': 	
				precio += 100;
			
			case 'B': 			
				precio += 80;
				
			case 'C': 
				precio += 60;
			
			case 'D': 	
				precio += 50;
			
			case 'E': 
				precio += 30;
			
			case 'F': 
				precio += 10;
		}
		
		
		// SEGUN PESO
		if (peso < 20) {
			
			precio += 10;
			
		} else if (precio >= 20 && precio < 50) {
			
			precio += 50;
			
		} else if (precio >= 50 && precio < 80) {
			
			precio += 80;
			
		} else if (precio >= 80) {
			
			precio += 100;
			
		}
		
			
		return precio;
	}
	
	
	
	
	// GETTERS Y SETTERS
	public double getPrecioBase() {
		return precioBase;
	}


	public double getPeso() {
		return peso;
	}


	public String getColor() {
		return color;
	}


	public char getConsumo() {
		return consumo;
	}


	protected void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	protected void setPeso(double peso) {
		this.peso = peso;
	}


	protected void setColor(String color) {
		
		// blanco, negro, rojo, azul y gris
		if (comprobarColor(color)) {
			
			this.color = color;
			
		} else {
			
			this.color = COLOR_DEF;
			
		}
		
	}


	protected void setConsumo(char consumo) {
		
		// A-F
		if (comprobarConsumoEnergetico(consumo)) {
			
			this.consumo = consumo;
			
		}else {
			this.consumo = CONSUMO_DEF;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
