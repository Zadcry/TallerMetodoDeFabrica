package com.balitechy.spacewar.main.models.vectorial;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.interfaces.IBackgroundRender;

public class BackgroundVectorial implements IBackgroundRender {
    @Override
    public void renderBackground(Graphics g, Canvas c) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        
        g.setColor(Color.BLACK);

        int diameter = 220;
        int x = 0;
        int y = 0;

        g.drawOval(x, y, diameter, diameter);
    }
}
