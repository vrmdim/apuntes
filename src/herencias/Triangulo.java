package herencias;

public class Triangulo extends PoligonoAbstract{

	private double base;
	private double altura;
	
	
	// CONSTRUCTORES
	public Triangulo() {
		
		super(3, "");
		
	}
	
	
	public Triangulo(String color, double base, double altura) {
		super(3, color);
		this.base = base;
		this.altura = altura;
	}




	// METODOS
	@Override
	public double getArea() {

		double area;
		
		area = base*altura/2;
		
		return area;
	}

	
	
	// GETTERS Y SETTERS
	public double getBase() {
		return base;
	}


	protected void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	protected void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", numLados=" + numLados + ", color=" + color + "]";
	}
	
	
	
	

}
