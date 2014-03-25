package com.me.mygdxgame;



import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Bienvenida extends Image {
public Bienvenida (){
super (new Texture("data/Bienvenida.png"));
setY(-10f);

addListener(new InputB(this));
}
}
