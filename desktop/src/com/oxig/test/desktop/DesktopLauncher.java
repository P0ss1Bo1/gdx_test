package com.oxig.test.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.oxig.test.MainClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = (int)(800*1.5);
		config.height = (int)(450*1.5);
		config.foregroundFPS = 60;
		config.samples=0;
		new LwjglApplication(new MainClass(), config);
	}
}
