package objetos;

import java.util.Objects;

// VARIABLES ESTATICAS, SE INICIALIZAN UNA VEZ AL INICIO DE LA CLASE Y YA NO SE INICIALIZAN MAS
// CONSTRUCTORES. Admiten sobrecargas. 
// GENERAR setters, getters con el IDE: click dcho/source/Generate getters and setters

public class Coche {

	private int numRuedas = 4;
	// SE VE DESDE LA CLASE
	private String bastidor;
	// SE VE DESDE EL PAQUETE
	protected boolean necesitaCarnet;
	public String observaciones;
	protected String color;
		

	// CONSTRUCTORES
	public Coche() {
		
		//this.numRuedas = 4;
		
		// OTRA OPCION ES LLAMAR AL SOBRECARGADO
		//this("", "blanco", "", false);

	}
	
	// CONSTRUCTOR SOBRECARGADO
	public Coche(String bastidor, String color, String observaciones, boolean necesitaCarnet) {

		this.bastidor = bastidor;
		this.color = color;
		this.observaciones = observaciones;
		this.necesitaCarnet = necesitaCarnet;
		
		// OTRA FORMA DE HACERLO, ES PONER LOS SETTERS EN EL CONSTRUCTOR DIRECTAMENTE
		//setBastidor(bastidor);
		//setColor(color);
		
		if (this.color == null) {
			
			this.color = "NoColor";
			System.out.println("NO TIENE COLOR");
			
		}
		
	}
	
	
	// METODOS DE LA CLASE -- GETTERS y SETTERS
	public String getBastidor() {
		
		return this.bastidor;
		
	}
	
	
	public int getNumRuedas() {
		
		return this.numRuedas;
		
	}
	
	public String getColor() {
		
		return this.color;
		
	}
	
	
	
	// NO PONEMOS PUBLIC COMO NORMA GENERAL - proto: atributos private, y setters protected
	protected void setBastidor(String bastidor) {
		
		this.bastidor = bastidor;
		
	}
	
	protected void setColor(String color) {
		
		// this hace referencia al objeto que está llamando al setter
		this.color = color;
		
	}


	
	// SOBREESCRIBIMOS FUNCION toString (click dcho, source, generate strings)
	@Override
	public String toString() {
		return "Coche [numRuedas=" + numRuedas + ", bastidor=" + bastidor + ", necesitaCarnet=" + necesitaCarnet
				+ ", observaciones=" + observaciones + ", color=" + color + "]";
	}
	
	
	// == compara si son mismo objeto; equals mira si sus variables son iguales
	@Override
	public int hashCode() {
		return Objects.hash(bastidor, color, necesitaCarnet, numRuedas, observaciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(bastidor, other.bastidor) && Objects.equals(color, other.color)
				&& necesitaCarnet == other.necesitaCarnet && numRuedas == other.numRuedas
				&& Objects.equals(observaciones, other.observaciones);
	}

	
	
	
	
	
}














































