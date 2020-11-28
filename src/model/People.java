package model;

import processing.core.PApplet;

public class People {
	
	protected float posX;
	protected float posY;
	protected int dirX;
	protected int dirY;
	protected int tammano;
	protected int speed;
	protected PApplet app;
	private int width;
	private int height;
	
	public People (int width, int height, PApplet app) {
		
		this.posX = random (width);
		this.posY = random (height);
		this.tammano = 7;
		this.dirX = 1;
		this.dirY = 1;
		this.speed = 3;
		this.app = app;
		this.width = width;
		this.height = height;
	}
	

	public void move(){
		this.posX += this.speed*this.dirX;
        this.posY += this.speed*this.dirY;
        
        if(this.posX >= this.width || this.posX <=0){
            this.dirX *= -1;
        }

        if(this.posY >= this.height || this.posY <=0){
            this.dirY *= -1;
        }
        
        

        }
	


	private float random(int width) {
		// TODO Auto-generated method stub
		return 0;
	}

}
