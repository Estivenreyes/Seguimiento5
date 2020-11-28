package controller;

import model.DataLogic;
import processing.core.PApplet;

public class Controller {
	private PApplet app;
	private DataLogic logic;
	
	public Controller(PApplet app) {
		this.app = app;
		logic= new DataLogic(app);
	}

	public void addElementList() {
		logic.addElementeList();
	}

	public void sortList(char c) {
		logic.sortList();
	}

}
