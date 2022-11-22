package genericos;

public interface Arrancable<T extends Vehiculo & Reparable> {
	
	public void arrrancar();
	
	//PREGUNTA
	// COMO se implementa si la funcion de la interfaz es void?
}
