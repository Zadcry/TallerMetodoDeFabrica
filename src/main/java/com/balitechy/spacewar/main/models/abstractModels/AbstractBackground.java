package com.balitechy.spacewar.main.models.abstractModels;

import java.awt.Canvas;
import java.awt.Graphics;

import com.balitechy.spacewar.main.interfaces.IBackgroundRender;

public abstract class AbstractBackground implements IBackgroundRender {
    public abstract void renderBackground(Graphics g, Canvas c);
}
