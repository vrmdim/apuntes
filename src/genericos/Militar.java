package genericos;

public class Militar implements Identificable, Alistable, ConRazocinio{
	
	int identificacion;
	
	public Militar(int identificacion) {
		
		this.identificacion = identificacion;
		
	}

	@Override
	public String getPuesto() {
		// TODO Auto-generated method stub
		return "Servir a la patria";
	}

	@Override
	public String getPensamiento() {
		// TODO Auto-generated method stub
		return "Lo importante es la mision";
	}

	@Override
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}


}
