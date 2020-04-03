package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class LogicBusiness {
	private PApplet app;
	private LinkedList<Contenido> contentList;
	private String[] infoContent;
	private ContenidoTipoCompare conTipo;
	private ContenidoNombreCompare conNombre;
	private ContenidoFechaCompare conFecha;
	private int ordenadoPor;

	public LogicBusiness(PApplet app) {
		
		this.app = app;
		contentList = new LinkedList<Contenido>();
		infoContent = app.loadStrings("../data/Imports/netflix.txt");

		conTipo = new ContenidoTipoCompare();
		conNombre = new ContenidoNombreCompare();
		conFecha = new ContenidoFechaCompare();
		ordenadoPor = 0;
		
		crearContenido();
		
		

	}
	

	private void crearContenido() {
		
		for (int i = 0; i < infoContent.length; i++) {
			
			String[] datosContent = infoContent[i].split(",");
			
			String nombre = datosContent[0];
			int rating = Integer.parseInt(datosContent[2]);
			int año = Integer.parseInt(datosContent[1]);
			String tipo = datosContent[3];
			
			PImage imagen = app.loadImage("../img/"+nombre.replace(" ", "").toLowerCase()+".jpg");
			System.out.println(nombre.replace(" ", "").toLowerCase());
			
			if(infoContent[3].equals("serie")) {
				contentList.add(new Serie(nombre, rating, año, tipo, imagen, app));
			}else {
				contentList.add(new Movie(nombre, rating, año, tipo, imagen, app));
			}
			
		}
	}

	
	public void sortList(int i) {
		System.out.println("entre");
		switch (i) {
		
		case 1:// Rating
			
			Collections.sort(contentList);
			ordenadoPor = 1;
			
			break;

		case 2:// nombre
			Collections.sort(contentList, conNombre);
			ordenadoPor = 2;
			break;

		case 3:// fecha
			ordenadoPor = 3;
			Collections.sort(contentList, conFecha);
			break;

		case 4:// Tipo
			Collections.sort(contentList, conTipo);
			ordenadoPor = 4;
			break;
		}
	}
	
	
	public void guardarTXT() {
		String[] nuevoTxt;
		nuevoTxt = new String[contentList.size()];

		for (int r = 0; r < contentList.size(); r++) {

			String nombre = " Nombre:" + contentList.get(r).getNombre().toUpperCase();
			String rating = " " + contentList.get(r).getRating();
			String fecha = " Fecha:" + contentList.get(r).getAño();
			String tipo = " Tipo:" + contentList.get(r).getTipo();
			

			nuevoTxt[r] = nombre + rating + fecha + tipo;
			// System.out.println(nuevoTxt[r]);
		}

		switch (ordenadoPor) {
		
		//RECORDAR DAR REFRESH A LA CARPETA PARA VERSE LOS NUEVOS TXT
		
		case 1:
			app.saveStrings("./data/Exports/OrdenRating.txt",nuevoTxt);
			System.out.println("guarde");
			break;

		case 2:
			app.saveStrings("./data/Exports/OrdenNombre.txt",nuevoTxt);
			break;
			
		case 3:
			app.saveStrings("./data/Exports/OrdenFecha.txt",nuevoTxt);
			break;

		case 4:
			app.saveStrings("./data/Exports/OrdenTipo.txt",nuevoTxt);
			break;

		}
	}
	
	public LinkedList<Contenido> getContentList() {
		return contentList;
	}

	public void setContentList(LinkedList<Contenido> contentList) {
		this.contentList = contentList;
	}

}
