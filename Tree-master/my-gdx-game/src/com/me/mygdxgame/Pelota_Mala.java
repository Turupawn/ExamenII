package com.me.mygdxgame;



import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pelota_Mala extends Pelotita {
	int velocidad; 
	
	
	Pelota_Mala(int x, int y, int velocidadp,GameOver salida)
	{

		super(x,y,velocidadp,new Texture("data/PelotaMala.png"));	
		addListener(new InputMala(this,salida));
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


