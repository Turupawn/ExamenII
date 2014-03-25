package com.me.mygdxgame;




import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

public class InputMala extends Mi_Listener 
	{
	GameOver salida; 
	Pelotita p; 
	InputMala (Pelotita param, GameOver s){
	super (param);
	p = param;
	salida=s;
	}
	
	
	public boolean touchDown(InputEvent event,float x, float y, int pointer, int button)
	{	
		
	
		if(!botonpausa.pausado){
			salida.setVisible(true);
		}return true; 
		
	}
		
		
	}


