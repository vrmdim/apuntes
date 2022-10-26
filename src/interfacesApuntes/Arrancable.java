package interfacesApuntes;


//UNA INTERFAZ PUEDE IMPLEMENTAR OTRA INTERFAZ (USANDO extends)
//"Todo lo arrancable, debe ser reparable"
// EN INTERFACES, extends PUEDE TENER VARIAS INTERFACES; NO COMO EN CLASES, QUE SOLO SE PUEDE HEREDAR DE UNA CLASE


// public interface Arrancable extends Reparable, Pintable {
public interface Arrancable extends Reparable {
	
	
	//public void arrancar();
	
	// default NOS SIRVE PARA IMPLEMENTAR EL METODO POR DEFECTO EN CASO DE QUE LA CLASE NO LO PONGA
	public default void arrancar() {
		
		System.out.println("Estoy arrancando...");
	}
	
	
}
