package com.stressbox.gameobjects;

import com.stressbox.Main;

public class Ball {

	Main stressbox;
	Padel padel;
	
	public static final float BALL_SPEED = Padel.PADEL_SPEED;
	
	public static final float D = Padel.HEIGHT;
	
	public Ball(Padel padel){
		this.padel = padel;
	}
	
    public void move(){
		
	}

	public void update(float delta){
	
	}
	
	public void gameOver(){
		
	}
	
	public boolean isGameOver(){
		return true;
	}
}
