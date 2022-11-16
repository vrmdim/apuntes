package comparables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import herencias.*;

/**
 * 
 * ver tambien colecciones_listas (compareTo)
 * 
 * RESUMEN: en Electrodomestico implementamos comparable, y sobreescribimos compareTo() para ordenarlos por CONSUMO!
 * 	Como en Televisiones queremos otro criterio, y no podemos implementar en esa clase de nuevo comparable, tenemos 
 * que crear un Comparator con el nuevo criterio.
 *
 *
 */
public class AppComparables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * CREAMOS LISTA TELEVISIONES
		 * 
		 */
		
		List<Television> listaElectrodomestico = new ArrayList<Television>();
		
		Television television1 = new Television(100, 18); 
		Television television2 = new Television(100, "negro", 'D', 2, 1080, true); 
		Television television3 = new Television(100, "negro", 'E', 20, 1080, true); 
		Television television4 = new Television(100, "gris", 'F', 10, 1080, true); 
		Television television5 = new Television(100, "negro", 'A', 15, 1080, true); 
		listaElectrodomestico.add(television1);
		listaElectrodomestico.add(television2);
		listaElectrodomestico.add(television3);
		listaElectrodomestico.add(television4);
		listaElectrodomestico.add(television5);
		
		
		/*
		 * 
		 */
		
		
		/**
		 * 
		 * CREAMOS LISTA DE Motos (VEHICULOS NO IMPLEMENTA COMPARABLE	
		 * 
		 */
		List<Moto> listaMotos = new ArrayList<Moto>();
		//Moto(String marca, int numeroRuedas, String color, int cubicaje)
		
		Moto moto1 = new Moto("Yamaha", 2, "", 600);
		Moto moto2 = new Moto("Yamaha", 2, "", 250);
		Moto moto3 = new Moto("Honda", 2, "", 1000);
		
		listaMotos.add(moto1);
		listaMotos.add(moto2);
		listaMotos.add(moto3);
		
		
		/*
		 * 
		 */
		
		// ORDEN NATURAL compareTo (INTERFAZ Comparable)
		listaElectrodomestico.sort(null);
		
		// SI QUEREMOS PERSONALIZAR LA COMPARACION, USAREMOS método compare() de la interfaz Comparator
		//// SI SOLO VAMOS A USAR EL COMPARADOR UNA VEZ, PODEMOS CREARLO COMO CLASE ANONIMA AQUI MISMO:	
		//((ArrayList<Television>) listaElectrodomestico).sort(new Comparator<Television>() {
		listaElectrodomestico.sort(new Comparator<Television>() {
			  @Override
			  public int compare(Television o1, Television o2) {
				  
				  return (int) (o1.getPeso() - o2.getPeso());
			  }

			});
		
		// CON DOS OPCIONES
		listaElectrodomestico.sort(new Comparator<Television>() {
			  @Override
			  public int compare(Television o1, Television o2) {
				  
				  int PesoCompare = o1.compareTo(o2);
				  
				  return (int) (o1.getPeso() - o2.getPeso());
			  }

			});
		
		
		
		// SI NO, SI VAMOS A USARLO MUCHAS VECES, TENEMOS QUE IMPLEMENTARLO EN UNA CLASE APARTE (ComparadorPesos)
	}

}
