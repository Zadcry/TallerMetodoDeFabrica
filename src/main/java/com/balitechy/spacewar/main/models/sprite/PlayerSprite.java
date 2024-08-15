package com.balitechy.spacewar.main.models.sprite;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.models.abstractModels.AbstractBullet;
import com.balitechy.spacewar.main.models.abstractModels.AbstractPlayer;

public class PlayerSprite extends AbstractPlayer {
    private BufferedImage image;

    public PlayerSprite (double x, double y, Game game) {
        super(x, y, game);
        image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
    }

    @Override
    public void renderPlayer(Graphics g) {
        g.setColor(Color.white);
		g.drawImage(image, (int) x, (int) y, null);
    }

    @Override
    public void shoot() {
        AbstractBullet bullet = new BulletSprite(x + (WIDTH / 2) - 5, y - 18, game);
        game.getBullets().addBullet(bullet);
    }
}
