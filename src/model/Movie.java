package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Movie extends Contenido{

	public Movie(String nombre, int rating, int a�o, String tipo, PImage imagen, PApplet app) {
		super(nombre, rating, a�o, tipo, imagen, app);
		// TODO Auto-generated constructor stub
	}

	
	public int compareTo(Contenido arg0) {
		// TODO Auto-generated method stub
		return this.rating - arg0.getRating();
	}


}
