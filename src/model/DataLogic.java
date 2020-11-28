package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class DataLogic {
	private LinkedList<People> peopleList; 
	private PApplet app;
	
	public DataLogic(PApplet app) {
		peopleList = new LinkedList<People>();
		this.app = app;
	}

	public void addElementeList() {
		//peopleList.add(new People(width/2, height/2, 7, 7, app.random(5, 10), this));
		
	}

	public void sortList() {
		
	}

}
