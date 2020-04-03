package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Serie extends Contenido{

	public Serie(String nombre, int rating, int año, String tipo, PImage imagen, PApplet app) {
		super(nombre, rating, año, tipo, imagen, app);
		// TODO Auto-generated constructor stub
	}


	public int compareTo(Contenido o) {
		
		return this.rating - o.getRating();
	}

}
