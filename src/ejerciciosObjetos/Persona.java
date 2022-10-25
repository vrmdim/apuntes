package ejerciciosObjetos;

import java.util.Random;

public class Persona {
	
	
	private String nombre;
	private int edad;
	private String DNI;
	// AL SER STATIC, SI LLAMAMOS A Persona.SEXO_DEF NOS DARA H; SI QUITAMOS STATIC, TENDREMOS QUE LLAMAR objetoPersona.sexo
	final static char SEXO_DEF = 'H';
	private char sexo;
	private double peso;
	private double altura;
	
	// VARIABLES DE METODO
	static final int INFRAPESO = -1;
	static final int PESO_IDEAL = 0;
	static final int SOBREPESO = 1;
	
	
	// CONSTRUCTOR POR DEFECTO
	public Persona() {
		
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO_DEF;
		//this.DNI = "";
		this.peso = 0;
		this.altura= 0;
		
		genDNI();
		
	}
	
	
	public Persona(String nombre, int edad, char sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
		comprobarSexo(sexo);
		genDNI();
		
	}
	



	public Persona(String nombre, int edad, char sexo, String DNI, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = DNI;
		this.peso = peso;
		this.altura= altura;
		
		comprobarSexo(sexo);
		
	}
	
	
	// METODOS
	public int calcularIMC(){
		
		int imc;
		double imcActual = getPeso() / (Math.pow(getAltura(), 2));

		
		if (imcActual >= 20 && imcActual <= 25) {
			
			imc = PESO_IDEAL;
			
		} else if (imcActual < 20) {
			imc = INFRAPESO;
			
		} else {
			imc = SOBREPESO;
			
		}
		
		return imc;
		
		
	}
	
	
	public boolean esMayorEdad() {
		
		return getEdad() >= 18;
		
	}

	private void comprobarSexo(char sexo) {
		
		if (sexo != 'H' && sexo != 'M') {
			
			this.sexo = SEXO_DEF;
		}
		
	}
	
	
	private void genDNI() {
		
		Random random = new Random();
		
		// ESTO VIENE EN INTERNET
		char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		int numRandom = random.nextInt(1111111, 100000000);
		char letra = letras[numRandom % 23];
		
		setDNI(String.valueOf(numRandom) + letra);
		
	}
	
		
	// GETERS Y SETERS
	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected int getEdad() {
		return edad;
	}


	protected void setEdad(int edad) {
		this.edad = edad;
	}


	protected String getDNI() {
		return DNI;
	}


	protected void setDNI(String dNI) {
		DNI = dNI;
	}


	protected char getSexo() {
		//return this.sexo;
		return sexo;
	}


	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}


	protected double getPeso() {
		return peso;
	}


	protected void setPeso(double peso) {
		this.peso = peso;
	}


	protected double getAltura() {
		return altura;
	}


	protected void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
}

































