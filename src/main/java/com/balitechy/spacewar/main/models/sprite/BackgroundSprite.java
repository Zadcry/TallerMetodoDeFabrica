package com.balitechy.spacewar.main.models.sprite;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.models.abstractModels.AbstractBackground;

public class BackgroundSprite extends AbstractBackground {
    
    
    @Override
    public void renderBackground(Graphics g, Canvas c) {
        try {
            BufferedImage background = null;
            SpritesImageLoader bg;
            bg = new SpritesImageLoader("/bg.png");
            bg.loadImage();
            background = bg.getImage(0, 0, 640, 480);
            g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
