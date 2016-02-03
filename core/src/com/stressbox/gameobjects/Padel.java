package com.stressbox.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class Padel {
	
	private static final float WIDTH = 80;
	private static final float HEIGHT = 20;
	
	public float xPadel = 0;
	public float yPadel;
	public float xSpeed = 5.0f;
	
	Ball ball; 
	
	public Padel(Ball ball, float x, float y){
		this.xPadel = x;
		this.yPadel = y;
		
		this.ball = ball;
	
	}
	
	public void move(float x, float delta){
		if(Gdx.input.isKeyPressed(Keys.DPAD_LEFT)){
			this.xPadel -= xSpeed * delta;
		}
		if(Gdx.input.isKeyPressed(Keys.DPAD_RIGHT)){
			this.xPadel += xSpeed * delta;
		}
	}

}
