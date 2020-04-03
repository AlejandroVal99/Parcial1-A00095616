package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Contenido implements Comparable<Contenido>{
	protected String nombre;
	protected int rating;
	protected int a�o;
	protected String tipo;
	protected PImage imagen;
	protected PApplet app;
	
	public Contenido(String nombre, int rating, int a�o, String tipo,PImage imagen, PApplet app) {
		
		this.a�o =a�o;
		this.nombre = nombre;
		this.rating = rating;
		this.tipo = tipo;
		this.imagen = imagen;
		this.app=app;
		
	}
	
	public void draw(int posY) {
		
		app.image(this.imagen, 60, posY,50,100);
		app.text(this.nombre,130, posY+50);
		app.text(this.rating,220, posY+50);
		app.text(this.a�o,310, posY+50);
		app.text(this.tipo,350,posY+50);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public PImage getImagen() {
		return imagen;
	}

	public void setImagen(PImage imagen) {
		this.imagen = imagen;
	}

}
