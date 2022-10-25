package herencias;


//SON CLASES QUE NO SE INSTANCIAN (NO SE CREAN OBJTOS DE ESE TIPO), Y TIENEN METODOS ABSTRACTOS (QUE TENDRAN QUE DESARROLLAR LOS HIJOS)
// PUEDEN TENER CONSTRUCTORES! AUNQUE NO SE INSTANCIEN EN ESTA CLASE 
public abstract class PoligonoAbstract {

	int numLados;
	String color;
	
	
	// CONSTRUCTORES
	public PoligonoAbstract() {
		
	}
	
	public PoligonoAbstract(int numLados, String color) {
		this.numLados = numLados;
		this.color = color;
	}


	
	// OBLIGAMOS A QUE TODOS LOS HIJOS TENGAN ESTE METODO IMPLEMENTADO
	// "FIRMAMOS" el metodo abstracto, que podrán instanciar los hijos
	public abstract double getArea();
		

	

	// GETTERS Y SETTERS
	protected void setNumLados(int numLados) {
		this.numLados = numLados;
	}


	protected void setColor(String color) {
		this.color = color;
	}


	public int getNumLados() {
		return numLados;
	}


	public String getColor() {
		return color;
	}





	
}
