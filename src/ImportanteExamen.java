
public class ImportanteExamen {

}



/**
 * EXAMEN sobrecarga
 */
public boolean isRepuesto(Repuesto repuesto, int cantidad) {
	
	int contadorRepuestos = 0;
	for (Repuesto respuestoAlmacen : getRepuestos()) {
		if (repuesto.equals(repuestoAlmacen)) {
			
			contadorRepuestos++;
		}
		
		
	}
	return contadorRepuestos >= cantidad;
	
}


// SOBRECARGA PARA BUSCAR UNA UNIDAD DE REPUESTO
public boolean isRepuesto(Repuesto repuesto) {
	
	return isRepuesto(repuesto, 1);
	
}


