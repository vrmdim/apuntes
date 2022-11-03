package interfacesApuntes;

// CLASES ABSTRACTAS, TIENEN METODOS ABSTRACTOS, Y NO SON INSTANCIABLES. NO NECESITAREMOS IMPLEMENTAR EL METODO DE LA INTERFAZ
// ESTAN HECHAS PARA SER HEREDADAS
public abstract class Vehiculo implements Arrancable{

	private final static double FACTOR_IMPUESTO = 0.25;  
	private int numRuedas;
 
	
	
	public static double getFactorImpuesto() {
		return FACTOR_IMPUESTO;
	}
 
	
	public int getNumRuedas() {
		return numRuedas;
	}
 
	
	// QUIEN HEREDA, TIENE OBLIGACION DE IMPLEMENTAR ESTE METODO
	public abstract double pagarImpuesto();
	
	// NO NECESARIO INSTANCIAR arrancar() POR SER CLASE ABSTRACTA

	
	

	
	
	
	
}
