package model;

import java.util.Comparator;

public class ContenidoFechaCompare implements Comparator<Contenido>{


	public int compare(Contenido arg0, Contenido arg1) {

		return arg0.getA�o() - arg1.getA�o();
	}
	
	

}
