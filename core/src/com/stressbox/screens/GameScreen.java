package com.stressbox.screens;
import com.badlogic.gdx.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.stressbox.Main;

public class GameScreen implements Screen {
	
	final Main stressbox;
	
	OrthographicCamera camera;
	Viewport viewport;
	
	World world;
	
	boolean gameOver = false;

	
	public GameScreen(final Main stressbox){
		this.stressbox = stressbox;
		
		camera = new OrthographicCamera();
		viewport  = new StretchViewport(Main.VIRUTAL_WIDTH, Main.VIRUTAL_HEIGHT, camera);
		viewport.apply();
		
		camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
		
	}
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0 ,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		stressbox.batch.setProjectionMatrix(camera.combined);
		
		update(delta);
		stressbox.batch.begin();
		draw();
        stressbox.batch.end();
	}
	
	public void update(float delta){
		if(!gameOver){
			world.update(delta);
		}
		
	}
	
	public void draw(){
		world.draw();
	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height);
		camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
