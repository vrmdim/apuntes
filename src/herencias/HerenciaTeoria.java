package herencias;

public class HerenciaTeoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Moto kawa = new Moto(600);
		
		// SI MOTO NO TIENE toString, SACARÁ EL DEL PADRE VEHICULO
		System.out.println(kawa.toString());
		

	}

}
