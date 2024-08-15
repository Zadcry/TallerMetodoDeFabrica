package com.balitechy.spacewar.main;

import com.balitechy.spacewar.main.models.abstractModels.AbstractBullet;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Bullet extends AbstractBullet {
	
	private double x;
	private double y;
	public static final int WIDTH = 11;
	public static final int HEIGHT = 21;
	private BufferedImage image;
	
	public Bullet(double x, double y, Game game){
        this.x = x;
		this.y = y;
		image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
	}
	
	public void tick(){
		y -= 5;
	}
	
	public void render(Graphics g){
		g.drawImage(image, (int) x, (int) y, null);
	}
	
	public double getY(){
		return y;
	}

	@Override
	public void renderBullet(Graphics g) {

	}
}
