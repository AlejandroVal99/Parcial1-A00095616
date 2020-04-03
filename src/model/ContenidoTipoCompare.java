package model;

import java.util.Comparator;

public class ContenidoTipoCompare implements Comparator<Contenido>{

	@Override
	public int compare(Contenido o1, Contenido o2) {

		return o1.getTipo().compareTo(o1.getTipo());
	}

	

}
