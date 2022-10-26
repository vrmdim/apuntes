package herencias;

import java.util.Arrays;

public class HerenciaTeoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculoMoto = new Vehiculo("BMW", 2, "Blanco");
		Moto kawa = new Moto(600);
		
		// SI MOTO NO TIENE toString, SACARÁ EL DEL PADRE VEHICULO
		System.out.println(kawa.toString());
		
		
		// LLAMADA A METODO DE HIJO; SI NO EXISTE EN EL HIJO, BUSCA ESE METODO EN PADRE (POLIMORFISMO)
		System.out.println(kawa.arrancar());
		System.out.println(vehiculoMoto.arrancar());
		
		// ARRAYS; en un array tipo vehiculo puedo meter motos; pero en array de Motos no puedo meter vehiculos
		Vehiculo[] vehiculos = {vehiculoMoto, kawa};
		// SE PODRIA CASTEAR - NO RECOMENDABLE
		//Moto[] motos = {(Moto) vehiculoMoto, kawa};
		//System.out.println(Arrays.toString(motos));
		
		
		
		/*
		 * 
		 * ABSTRACTOS
		 * 
		 */
	
		Cuadrado cuadrado = new Cuadrado("Rojo", 2);
		Triangulo triangulo = new Triangulo();
		
		System.out.println();
		System.out.println("getArea() cuadrado:");
		System.out.println(cuadrado.getArea());
		
		System.out.println("getArea() cuadrado:");
		System.out.println(triangulo.getArea());		
		
		
		/*
		 * 
		 * ANONIMAS. SE CREAN SOBRE CLASES ABSTRACTAS
		 * 
		 */
		
		// SON CLASES QUE SON MUY SIMILARES A OTRA CREADA Y QUE VAMOS A USAR PUNTUALMENTE
		// CREAMOS UN PENTAGONO SIN NECESIDAD DE CREAR EL ARCHIVO Y CLASE PENTAGONO COMO TAL
		// TENDREMOS QUE CREAR EL METODO
		PoligonoAbstract pentagono = new PoligonoAbstract() {
			
			@Override
			public double getArea() {
				
				return 0;
				
			}
			
		};
		
		
		
		/*
		 * 
		 * EJERCICIO ELECTRODOMESTICOS
		 * 
		 */

		System.out.println();
		System.out.println("EJERCICIO ELECTRODOMESTICOS");
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
	 
		electrodomesticos[0] = new Lavadora(200, 50); 
		electrodomesticos[1] = new Lavadora(200, 50); 
		electrodomesticos[2] = new Lavadora(300, "blanco", 'F', 60, 8); 
		electrodomesticos[3] = new Lavadora(300, "blanco", 'D', 60, 8); 
		electrodomesticos[4] = new Electrodomestico(250, 40); 
		electrodomesticos[5] = new Television(100, 20); 
		electrodomesticos[6] = new Television(100, "negro", 'D', 20, 1080, true); 
		electrodomesticos[7] = new Television(100, "negro", 'E', 20, 1080, true); 
		electrodomesticos[8] = new Television(100, "gris", 'F', 20, 1080, true); 
		electrodomesticos[9] = new Television(100, "negro", 'A', 20, 1080, true); 
		
		
		// RECORREMOS ARRAY Y EJECUTAMOS precioFinal();
		for (int i = 0; i < 10; i++) {
			
			System.out.println();
			System.out.println(electrodomesticos[i].toString());
			System.out.println("Precio Final: " + electrodomesticos[i].precioFinal());
			
		}
		
	
	
	}
	

}



































