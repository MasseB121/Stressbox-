package com.stressbox.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.stressbox.Main;

public class Padel {
	
	Ball ball; 
	Main stressbox;
	
	public static final float WIDTH = 110;
	public static final float HEIGHT = 10;
	public static final float PADEL_SPEED = 500.0f;
	
	public float speed = PADEL_SPEED;
	
	public float xPadel = 0;
	public float yPadel; // maybe unnecesary...
	
	public Padel(Ball ball, float x, float y){
		this.xPadel = x;
		this.yPadel = y;
		
		this.ball = ball;
	
	}
	
	public void update(float delta){
		input(delta);
	}
	
	
	public void input(float delta){
		
		// Padel Movement
	
		if (this.xPadel >= 0 && this.xPadel < Main.VIRUTAL_WIDTH - WIDTH){ 
			if(Gdx.input.isKeyPressed(Keys.LEFT)){
				this.xPadel -= speed* delta;
			  }
			
			  if(Gdx.input.isKeyPressed(Keys.RIGHT)){
				this.xPadel += speed * delta;
			  }
		}
		
		if(xPadel <= 0){
			xPadel++;
		}
		
		if(xPadel >= Main.VIRUTAL_WIDTH - WIDTH){
			xPadel--;
		}
	}
	
	public void setX(float x) {
		this.xPadel = x;
	}
	
	public float getX(){
		return xPadel;
	}
	
	public void setY(float y) {
		this.yPadel = y;
	}
	
	public float getY() {
		return yPadel;
	}

}
