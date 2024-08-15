package com.balitechy.spacewar.main.controllers;

import java.awt.Graphics;
import java.util.LinkedList;

import com.balitechy.spacewar.main.models.abstractModels.AbstractBullet;

public class ControllerBullet {
	private LinkedList<AbstractBullet> bl = new LinkedList<>();

	public void tick() {
		for (int i = 0; i < bl.size(); i++) {
			if (bl.get(i).getY() < 0) {
				removeBullet(bl.get(i));
			} else {
				bl.get(i).tick();
			}
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < bl.size(); i++) {
			bl.get(i).renderBullet(g);
		}
	}

	public void addBullet(AbstractBullet bullet) {
		bl.add(bullet);
	}

	public void removeBullet(AbstractBullet bullet) {
		bl.remove(bullet);
	}
}

