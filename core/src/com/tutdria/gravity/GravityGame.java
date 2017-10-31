package com.tutdria.gravity;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tutdria.gravity.screens.PlayScreen;

public class GravityGame extends Game {
	public static final int V_WIDTH = 402;
	public static final int V_HEIGHT = 208;
	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
