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
		
		this.color = COLOR_DEF;
		this.consumo = CONSUMO_DEF;
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
		if (letra=='A' | letra=='B' | letra=='C' | letra=='D' | letra=='E' | letra=='F') {
			
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
	
	
	
	public double precioFinal() {
		
		double incremento = 0;
		
		// SEGUN CONSUMO
		switch (consumo) {
		
			case 'A': 	
				
				incremento += 100;
				break;
				
			case 'B': 		
				
				incremento += 80;
				break;
				
			case 'C': 
				
				incremento += 60;
				break;
			
			case 'D': 	
				incremento += 50;
				break;
				
			case 'E': 
				incremento += 30;
				break;
			
			case 'F': 
				incremento += 10;
				break;
				
		}
		

		// SEGUN PESO
		if (peso < 20) {
			
			incremento += 10;
			
		} else if (peso >= 20 && peso < 50) {
			
			incremento += 50;
			
		} else if (peso >= 50 && peso < 80) {
			
			incremento += 80;
			
		} else if (peso >= 80) {
			
			incremento += 100;
			
		}



		return precioBase + incremento;
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


	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", color=" + color + ", consumo="
				+ consumo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
