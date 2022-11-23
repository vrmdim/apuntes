package genericos;


/**
 * SI IMPLEMENTO Identificable, NECESITO DECIR QUE VEHICULO SERA 
 */
public class Vehiculo implements Identificable<Integer>, Alistable{

	private int identificador;
	
	public Vehiculo() {
		
	}
	
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



	@Override
	public String getPuesto() {
		// TODO Auto-generated method stub
		return "Llevar tropas";
	}

}
