package clase;

public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean v = true;
		boolean f = false;
		boolean tercera = v;
		
		int a, b, c;
		
		// & evalua las dos (evalua bit a bit - operadores numericos)
		// && si la primera falla se para la ejecucion (evalua expresiones logicas - operadores booleanos)
		
		System.out.println(v + " && " + v + " = " + (v && v));
		System.out.println(v + " && " + f + " = " + (v && f));
		System.out.println(v + " || " + f + " = " + (v || f));
		System.out.println(f + " || " + f + " = " + (f || f));
		System.out.println("!" + v + " = " + !v);
		System.out.println("!" + f + " = " + !f);
		
		
		
		
		
	}

}
