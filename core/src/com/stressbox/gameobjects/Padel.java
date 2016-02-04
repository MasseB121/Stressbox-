package com.stressbox.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.stressbox.Main;

public class Padel {
	
	Ball ball; 
	Main stressbox;
	
	public static final float WIDTH = 150;
	public static final float HEIGHT = 20;
	
	public float xPadel = 0;
	public float yPadel;
	public float xSpeed = 500.0f;
	
	public boolean onTouch = true;
	
	public Padel(Ball ball, float x, float y){
		this.xPadel = x;
		this.yPadel = y;
		
		this.ball = ball;
	
	}
	
	public void update(float delta){
		move(delta);
	}
	
	
	public void move(float delta){
	
		if (this.xPadel >= 0 && this.xPadel < Main.VIRUTAL_WIDTH - WIDTH){ 
			if(Gdx.input.isKeyPressed(Keys.LEFT)){
				this.xPadel -= xSpeed * delta;
			  }
			
			  if(Gdx.input.isKeyPressed(Keys.RIGHT)){
				this.xPadel += xSpeed * delta;
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
