package com.stressbox.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.stressbox.Main;
import com.stressbox.gameobjects.Ball;
import com.stressbox.gameobjects.Padel;

public class World {
	
	Main stressbox;
	Ball ball;
	Padel padel; //objects, other classes
	
	Texture white;
	
	public int playerPoints;
	public boolean isAlive = true;

	public World(final Main stressbox){
		this.stressbox = stressbox;
		
		ball = new Ball(padel);
		padel = new Padel(ball, Padel.WIDTH, Padel.HEIGHT);
		
		white = new Texture(Gdx.files.internal("padel.png"));
	}
	
	public void update(float delta){ 
		padel.update(delta);
	}
	
	public void draw() {
		drawPadel();
	}
	
	public void drawPadel(){
		stressbox.batch.draw(white, padel.xPadel, padel.yPadel, Padel.WIDTH, Padel.HEIGHT);
	}
	
	public void gameOver(){
		//if() //ball at y value..
	}
}
