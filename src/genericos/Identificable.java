package genericos;

/*
 * INTERFAZ QUE DEVUELVE getId() de tipo T
 * unos objetos devolveran String, otros Integer...
 */
public interface Identificable<T> {

	public T getId();	
}
