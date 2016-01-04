package com.mygdx.tube3;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class Triforcetube3 extends ApplicationAdapter {
	SpriteBatch batch,batch2;
	Texture img,img2;
	Random random;


	@Override
	public void create () {
		random = new Random();
		batch = new SpriteBatch();
		img = new Texture("toptube.png");
		img2 = new Texture("bottomtube.png");
	}
	public void spawn(){
		//batch.begin();
		//batch2.begin();
		batch.draw(img, (random.nextInt(100))+1, (random.nextInt(100))+1);
		batch.draw(img2, random.nextInt(3) + 1, -150);
		//batch.end();
		//batch.dispose();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		spawn();
		batch.end();
		

	//	batch2.end();
	}
}

