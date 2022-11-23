package genericos;

public class Moto extends Vehiculo implements Arrancable{

	private String identificacion;
	
	public Moto() {
		
		
	}
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
	public void arrrancar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
