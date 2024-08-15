package com.balitechy.spacewar.main.models.abstractModels;

import java.awt.Graphics;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.IPlayerRender;

public abstract class AbstractPlayer implements IPlayerRender {
    protected double x;
	protected double y;

	private double velX;
	private double velY;

	public static final int WIDTH = 56;
	public static final int HEIGHT = 28;

	protected Game game;

	public AbstractPlayer(double x, double y, Game game) {
		this.x = x;
		this.y = y;
		this.game = game;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}

	public abstract void shoot();
	
	public void tick() {
		x += velX;
		y += velY;

		// To avoid player go outside the arena.
		if (x <= 0)
			x = 0;
		if (x >= (Game.WIDTH * Game.SCALE) - WIDTH)
			x = (Game.WIDTH * Game.SCALE) - WIDTH;
		if (y <= 0)
			y = 0;
		if (y >= (Game.HEIGHT * Game.SCALE) - HEIGHT)
			y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
	}

	public abstract void renderPlayer(Graphics g);
}
