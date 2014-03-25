package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class botonpausa extends Image {
	
	static boolean pausado = false; 
	
	public botonpausa (){
		
	
		super (new Texture("data/bpausa.png"));

		addListener(new Inputboton(this));
		}
		}



