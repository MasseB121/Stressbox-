package com.stressbox;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.stressbox.screens.*;

public class Main extends Game {
	
	public SpriteBatch batch;
	
	public static final int VIRUTAL_WIDTH = 720;
	public static final int VIRUTAL_HEIGHT = 1000;
	
	@Override
	public void create(){
		this.setScreen(new GameScreen(this));
		batch = new SpriteBatch();
		
	}

	@Override
	public void render () {
		super.render();
	}
	
	public void dispose(){
		batch.dispose();
	}

}
