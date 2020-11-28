package view;

import controller.Controller;
import model.HealthyPeople;
import model.InfectPeople;
import processing.core.PApplet;

public class Main extends PApplet{
	
	private Controller controller;
	String [] parameters;
	HealthyPeople hpeople;
	InfectPeople Ipeople;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(800,600);
	}
	
	public void setup() {
		 controller = new Controller(null);
		 parameters = loadStrings("../Data/parameters.txt");
		 //hpeople = new HealthyPeople();
		 System.out.println(parameters);
	}
	
	public void draw() {
		controller.addElementList();
		controller.sortList(key);
	}

}
