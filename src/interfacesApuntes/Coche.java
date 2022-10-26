package interfacesApuntes;


// EN LA CLASE COCHE, NO SERA NECESARIO IMPLEMENTAR LOS METODOS DE LA INTERFAZ PUES YA LO TENEMOS EN EL PADRE VEHICULO
public class Coche extends Vehiculo implements Pintable{

	
	// OBLIGADO POR IMPLEMENTAR ARRANCABLE A TRAVES DEL PADRE
	@Override
	public void arrancar() {

		
	}
	
	// COMO AHORA LA HE PUESTO EN default, YA NO ES OBLIGATORIO IMPLEMENTARLA
	////@Override
	////public void arrancar() {

		
	////}
	
	
	
	// OBLIGADO POR HEREDAR DE CLASE ABSTRACTA, Y FUNCION ABSTRACTA
	@Override
	public double pagarImpuesto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	// OBLIGADO POR IMPLEMENTAR Pintable
	@Override
	public String cambiarColor(String colorCambio) {
		// TODO Auto-generated method stub
		return null;
	}

	// OBLIGADO PORQUE INTERFAZ Arrancable, DEBE SER TAMBIÉN Reparable
	@Override
	public boolean esReparable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
