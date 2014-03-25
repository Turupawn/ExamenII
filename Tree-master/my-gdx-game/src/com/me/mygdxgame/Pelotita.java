package com.me.mygdxgame;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class Pelotita extends Image {
	int velocidad; 
	Pelotita(int x, int y, int velocidadp,Texture t)
	{

		super(t);	
		addListener(new Mi_Listener(this));
		this.setX(x);
		this.setY(y);
		
		velocidad = velocidadp;
	} 
	 
	public void act (float delta){
		setX(getX()+velocidad);
		if (getX()>500){
			setX(0);
			
		}
}
}

