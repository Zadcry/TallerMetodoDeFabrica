package com.balitechy.spacewar.main.factory;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.GameStyle;
import com.balitechy.spacewar.main.interfaces.IBackgroundRender;
import com.balitechy.spacewar.main.interfaces.IBulletRender;
import com.balitechy.spacewar.main.interfaces.IPlayerRender;
import com.balitechy.spacewar.main.models.sprite.BackgroundSprite;
import com.balitechy.spacewar.main.models.sprite.BulletSprite;
import com.balitechy.spacewar.main.models.sprite.PlayerSprite;

public class GameSpriteFactory implements GameStyle {
    public Game game;

    @Override
    public IPlayerRender createPlayer(double x, double y, Game game) {
        return new PlayerSprite(x, y, game);
    }

    @Override
    public IBackgroundRender createBackground() {
        return new BackgroundSprite();
    }

    @Override
    public IBulletRender createBullet(double x, double y, Game game) {
        return new BulletSprite(x, y, game);
    }
}
