package controller;

import java.util.LinkedList;

import model.Contenido;
import model.LogicBusiness;
import processing.core.PApplet;

public class MainController {

	private PApplet app;
	private LogicBusiness logic;

	public MainController(PApplet app) {

		this.app = app;
		this.logic = new LogicBusiness(app);

	}

	public void sortList(char r) {
		
		
		switch (r) {
		case 'n':
			logic.sortList(2);
			break;

		case 'f':
			logic.sortList(3);
			break;

		case 't':
			logic.sortList(4);
			break;

		case 'r':
			logic.sortList(1);
			break;

		}

	}

	public LinkedList<Contenido> getListContent() {

		return logic.getContentList();
	}

	public void guardarTxt() {
		
		if(app.mouseX > 580 && app.mouseX < 670 && app.mouseY > 490 && app.mouseY < 520) {
			logic.guardarTXT();
		}
	}

}
