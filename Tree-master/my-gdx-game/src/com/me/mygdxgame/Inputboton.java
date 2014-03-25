package com.me.mygdxgame;

import javafx.scene.paint.Stop;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;


public class Inputboton extends InputListener{

	
	botonpausa pausa;
	Inputboton(botonpausa b){
	super();
	pausa = b; }
	 

	
public boolean touchDown(InputEvent event,float x, float y, int pointer, int button)
	{
		 botonpausa.pausado=!botonpausa.pausado;
		System.out.println("pausa");
		return true; 

	}

}
