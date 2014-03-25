package com.me.mygdxgame;


import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputB extends InputListener{
		
	
		Bienvenida bienvenida;
		InputB(Bienvenida b){
		super();
		bienvenida = b; }
		
public boolean touchDown(InputEvent event,float x, float y, int pointer, int button)
		{
			bienvenida.setVisible(false);
			return true; 

		}
		
}

