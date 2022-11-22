package genericos;

public class Moto extends Vehiculo implements Identificable<String>, Arrancable{

	private String identificacion;
	
	public Moto(String identificacion) {
		
		this.identificacion = identificacion;
		
	}
	
	
	
	public String getIdentificacion() {
		return identificacion;
	}



	protected void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}



	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return getIdentificacion();
	}





	@Override
	public void arrrancar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
