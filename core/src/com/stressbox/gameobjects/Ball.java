package com.stressbox.gameobjects;

import com.stressbox.Main;

public class Ball {

	Main stressbox;
	Padel padel;
	
        public static final float BALL_SPEED = 500.0f;
	public static final float D = Padel.HEIGHT; 
	 
	public float speed = BALL_SPEED; 
	
	public float xBall = Main.VIRUTAL_HEIGHT /2;
	public float yBall = Main.VIRUTAL_WIDTH / 2;
	
	public Ball(Padel padel){
		this.padel = padel;
	}
	
        public void move(float delta){
		if(xBall <= Main.VIRUTAL_WIDTH && 0 < xBall ){
			this.xBall *=  speed * delta;
	        }
	}

	public void update(float delta){
	
	}
	
}
