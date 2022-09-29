package clase;

import java.util.Scanner;

public class EjMetodosArea {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tipoFigura;
		double area;
		 
		// CREAMOS ESCANER
		Scanner escaner = new Scanner(System.in);
			
		
		tipoFigura = 0;
		
		while (tipoFigura <= 0 || tipoFigura > 3){
			
			System.out.println("Introduzca de que figura quiere calcular el area");
			System.out.println("1 --> Circulo");
			System.out.println("2 --> Cuadrado");
			System.out.println("3 --> Triangulo");
			tipoFigura = escaner.nextInt();
			
		}
		
		
		// PEDIMOS LAS VARIABLES NECESARIAS EN FUNCION DE LA SELECCION
		switch (tipoFigura) {
			
			// CIRCULO
			case 1: {
				
				double radio;
				
				System.out.println("Introduzca el radio del circulo");
				radio = escaner.nextDouble();
				area = calcularAreaCirculo(radio);
				System.out.println("El area es " + area);
				
				break;
			}
			
			case 2: {
				
				double lado;
				
				System.out.println("Introduzca el lado del cuadrado");
				lado = escaner.nextDouble();
				area = calcularAreaCuadrado(lado);
				System.out.println("El area es " + area);
				
				break;
					}
			
			case 3: {
				
				double base,altura;
				
				System.out.println("Introduzca la base del triangulo");
				base = escaner.nextDouble();
				System.out.println("Introduzca la altura del triangulo");
				altura= escaner.nextDouble();
				area = calcularAreaTriangulo(base,altura);
				System.out.println("El area es " + area);
				
				break;
			}
			
			default:
				break;
				
		}
		
		
		

	}
	
	
		// METODO PARA HALLAR AREA CIRCULO
		static double calcularAreaCirculo(double radio) {
			

			return Math.PI*Math.pow(radio, 2);
			
		}
		
		
		// METODO PARA HALLAR AREA CUADRADO
		static double calcularAreaCuadrado(double lado) {
			

			return Math.pow(lado, 2);
			
		}
		
		
		// METODO PARA HALLAR AREA TRIANGULO
		static double calcularAreaTriangulo(double base, double altura) {
			
				
			return base*altura/2;
			
		}
		
		

}
