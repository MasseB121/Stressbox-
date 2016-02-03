package com.stressbox.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.stressbox.gameobjects.Ball;
import com.stressbox.gameobjects.Padel;

public class World {
	
	Game stressbox;
	Ball ball;
	Padel padel; //objects, other classes
	
	public int playerPoints;

	public World(final Game stressbox){
		this.stressbox = stressbox;
		
		//white = new Texture(Gdx.files.internal(""); //white in assets folder, TODO 
		
		ball = new Ball();
		
		padel = new Padel(ball, 10, 640);
	}
	
	public void update(float delta){

		padel.move(padel.xPadel, delta);
		
	}
	
	public void draw() {
		
	}
}
