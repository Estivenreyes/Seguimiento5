package model;

import processing.core.PApplet;

public class HealthyPeople extends People{

	public HealthyPeople(int width, int height, PApplet app) {
		super(width, height, app);
		// TODO Auto-generated constructor stub
	}
	
	//red color, people infected
	public void draw () {
		app.noStroke();	
		app.fill(100,0,0);
		app.ellipse (posX,posX,tammano,tammano);
	}

}
