package model;

import java.util.Comparator;

public class ContenidoNombreCompare implements Comparator<Contenido>{


	public int compare(Contenido o1, Contenido o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
