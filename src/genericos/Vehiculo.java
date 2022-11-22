package genericos;


/**
 * SI IMPLEMENTO Identificable, NECESITO DECIR QUE VEHICULO SERA 
 */
public class Vehiculo implements Identificable<Integer>{

	private int identificador;
	
	public Vehiculo(int identificador) {
		
		this.identificador = identificador;
	}
	
	
	
	public int getIdentificador() {
		return identificador;
	}



	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}



	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return getIdentificador();
	}

}
