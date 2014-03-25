package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.sun.prism.paint.Stop;
class Imagen extends Sprite{
	Imagen (Texture texture){
		super (texture);
		
	}

}
 
public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch; 
	Imagen imagen; 
	int frame = 0; 
	Pelotita i; 
	private Texture t; 
	private Texture k; 
	private Sprite sprite;
	Stage s;
	
	ArrayList <Pelotita> pelotitas = new ArrayList<Pelotita>();
	
	@Override
	public void create()
	{	
		
		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
	
	
				
		t = new Texture(Gdx.files.internal("data/Pelotita.png"));
		t.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		TextureRegion region = new TextureRegion(t, 0, 8, 512, 275);
		
//		k = new Texture(Gdx.files.internal("data/Pelota.png"));
//		k.setFilter(TextureFilter.Linear, TextureFilter.Linear);
//		TextureRegion position = new TextureRegion(k, 0, 0, 512, 275);
	
	
		imagen = new Imagen(t);
		imagen.setPosition(-0.8f, -0.4f);
		imagen.setSize(0.4f, 0.4f);
		s= new Stage ();
		
		
			
		
		
		for (int i=0; i<10; i++){
			Pelotita p = new Pelotita ((int)(Math.random()*1000%w),(int)(Math.random()*1000%h),1,t);
	
			s.addActor(p);
			pelotitas.add(p);
		}
		GameOver salida = new GameOver();
		for (int i=0; i<5; i++){
			Pelota_Mala p = new Pelota_Mala ((int)(Math.random()*1000%w),(int)(Math.random()*1000%h),2,salida);
	
			s.addActor(p);
			pelotitas.add(p);
		}
		
		botonpausa gh = new botonpausa();
		s.addActor(gh);
		
		salida.setVisible(false);
		s.addActor(salida);
		
		
		Gdx.input.setInputProcessor(s); 
		
		
		
		Bienvenida InputB = new Bienvenida();
		s.addActor(InputB);
		
	}

	@Override
	public void dispose() {
		batch.dispose();

	}

	@Override
	public void render() {	
	
		
		
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		if (!botonpausa.pausado){
			s.act();
			
		}
		s.draw();
		
		
		
		batch.end();
	
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
}
