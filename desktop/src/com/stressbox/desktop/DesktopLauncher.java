package com.stressbox.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.stressbox.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Stressbox";
		config.width = Main.VIRUTAL_WIDTH;
		config.height = Main.VIRUTAL_HEIGHT;
		new LwjglApplication(new Main(), config);
	}
}
