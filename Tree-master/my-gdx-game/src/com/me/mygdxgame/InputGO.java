package com.me.mygdxgame;


import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputGO extends InputListener{

	GameOver salida;
	InputGO(GameOver s){
	super();
	salida = s; }
	
public boolean touchDown(InputEvent event,float x, float y, int pointer, int button)
	{
		salida.setVisible(true);
		return false; 

	}
}
