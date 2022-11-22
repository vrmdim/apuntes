package genericos;

/*
 * SI NO QUIERO DEFINIR DE QUE TIPO IDENTIFICA, LO DEJO EN T
 */
public class Perro<T> implements Identificable<T>{

	T identificador;
	
	
	public Perro(T identificador) {
		
		this.identificador = identificador;
		
	}
	

	public T getIdentificador() {
		return identificador;
	}



	protected void setIdentificador(T identificador) {
		this.identificador = identificador;
	}



	@Override
	public T getId() {
		// TODO Auto-generated method stub
		return getIdentificador();
	}
	
	
}
