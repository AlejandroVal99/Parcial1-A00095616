package view;

import controller.MainController;
import processing.core.PApplet;

public class MainView extends PApplet {
	
	private MainController controller;

	public static void main(String[] args) {
		PApplet.main("view.MainView");
		
	}
	
	public void settings() {
		size(900, 700);
		controller = new MainController(this);
		
	}
	
	public void setup() {
		
		
		
		
	}
	
	public void draw() {
		background(0);
		
		//Instrucciones de uso
		text("Presione la tecla n para ordenar por Nombre", 500, 50);
		text("Presione la tecla t para ordenar por Tipo", 500, 70);
		text("Presione la tecla f para ordenar por Fecha", 500, 90);
		text("Presione la tecla r para ordenar por Rating", 500, 110);
		
		
		for(int i = 0; i < controller.getListContent().size();i++) {
			
			controller.getListContent().get(i).draw((i * 100) + 20);
			
		}
		
		botonGuardartxt();
		
	}
	
	
	
	private void botonGuardartxt() {
		
		
		text("Guardar Archivo", 582, 510);
		
	}

	public void keyPressed(){
		
		controller.sortList(key);
		
	}
	
	public void mousePressed(){
		
		controller.guardarTxt();
		
	}
}
