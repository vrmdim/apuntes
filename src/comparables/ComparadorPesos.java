package comparables;

import java.util.Comparator;
import herencias.*;

// Si no quiero orden natural, tengo que modificar compare()
public class ComparadorPesos implements Comparator<Television>{


	@Override
	public int compare(Television o1, Television o2) {
		
		return (int) (o1.getPeso() - o2.getPeso());

	}

}
