package com.balitechy.spacewar.main.factory;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.GameStyle;
import com.balitechy.spacewar.main.interfaces.IBackgroundRender;
import com.balitechy.spacewar.main.interfaces.IBulletRender;
import com.balitechy.spacewar.main.interfaces.IPlayerRender;
import com.balitechy.spacewar.main.models.vectorial.BackgroundVectorial;
import com.balitechy.spacewar.main.models.vectorial.BulletVectorial;
import com.balitechy.spacewar.main.models.vectorial.PlayerVectorial;

public class GameVectorFactory implements GameStyle {
    public Game game;
    
    @Override
    public IPlayerRender createPlayer(double x, double y, Game game) {
        return new PlayerVectorial(x, y, game);
    }

    @Override
    public IBackgroundRender createBackground() {
        return new BackgroundVectorial();
    }

    @Override
    public IBulletRender createBullet(double x, double y, Game game) {
        return new BulletVectorial(x, y, game);
    }
}
