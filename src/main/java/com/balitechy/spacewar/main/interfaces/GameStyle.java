package com.balitechy.spacewar.main.interfaces;

import com.balitechy.spacewar.main.Game;

public interface GameStyle {
    IPlayerRender createPlayer(double x, double y, Game game);
    IBackgroundRender createBackground();
    IBulletRender createBullet(double x, double y, Game game);
}
