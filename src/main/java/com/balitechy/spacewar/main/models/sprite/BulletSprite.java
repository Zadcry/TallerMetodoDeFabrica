package com.balitechy.spacewar.main.models.sprite;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.models.abstractModels.AbstractBullet;

public class BulletSprite extends AbstractBullet {
    private BufferedImage image;

    public BulletSprite (double x, double y, Game game) {
        super(x, y, game);
        image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
    }
    
    @Override
    public void renderBullet(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
