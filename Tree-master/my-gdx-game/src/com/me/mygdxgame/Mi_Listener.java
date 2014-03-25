package com.me.mygdxgame;


import java.util.Random;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.utils.LongArray;


public class Mi_Listener extends InputListener 
{
Pelotita p; 
Mi_Listener (Pelotita param){
super ();
p = param;

	
}



	public boolean touchDown(InputEvent event,float x, float y, int pointer, int button)
	{	


		
		if(!botonpausa.pausado){
		p.remove();}
		return true; 
	
	}
}

