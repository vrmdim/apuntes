package herencias;

public class Cuadrado extends PoligonoAbstract {
	
	private double lado;

	
	
	// CONSTRUCTORES
	public Cuadrado () {
		
		super(4, "");
		
	}
	
	
	public Cuadrado(String color, double lado) {
		super(4, "");
		this.lado = lado;
	}



	// METODOS
	@Override
	public double getArea() {
		
		double area;
		
		area = lado*lado;
		
		return area;
	}



	// GETTERS Y SETTERS
	public double getLado() {
		return lado;
	}


	protected void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", numLados=" + numLados + ", color=" + color + "]";
	}
	
	
	
	
	

}
