package model;

import processing.core.PApplet;

public class InfectPeople extends People{

	public InfectPeople(int width, int height, PApplet app) {
		super(width, height, app);
		
	}
	
	//Green ball, healthy people
	public void draw(){
		app.noStroke();	
		app.fill(0,100,0);
		app.ellipse (posX,posY,tammano,tammano);
	}


}
