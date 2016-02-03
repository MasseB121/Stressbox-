package com.stressbox;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.stressbox.screens.GameScreen;

public class MenuScreen implements Screen{

	final Main stressbox;
	OrthographicCamera camera;
	Viewport viewport;
	
	Sprite sprite;
	Sprite start;
	
	public MenuScreen(final Main stressbox){
		this.stressbox = stressbox;

        camera = new OrthographicCamera();
        viewport = new StretchViewport(Main.VIRUTAL_WIDTH, Main.VIRUTAL_HEIGHT, camera);
        viewport.apply();
        
        sprite = new Sprite(new Texture(Gdx.files.internal("start.png")));
        start = new Sprite(new Texture(Gdx.files.internal("start.jpg")));
        
        start.setX(Main.VIRUTAL_WIDTH / 2);
        start.setY(Main.VIRUTAL_HEIGHT / 2 * 3);

        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);

		
	}
	
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		stressbox.batch.begin();
		
		sprite.draw(stressbox.batch);
		start.draw(stressbox.batch);
		
		if(Gdx.input.isButtonPressed(Keys.ENTER)){
			stressbox.setScreen(new GameScreen(stressbox));
			Gdx.app.log("", "ok");
		}
		stressbox.batch.end();
	}
	
	public void update(float delta){
	
	}
		

	
	public void draw(){
	
	}

	@Override
	public void resize(int width, int height) {
		
	}	

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}
	
}
