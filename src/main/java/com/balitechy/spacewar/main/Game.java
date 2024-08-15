package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

import com.balitechy.spacewar.main.controllers.ControllerBullet;
import com.balitechy.spacewar.main.factory.GameSpriteFactory;
import com.balitechy.spacewar.main.factory.GameVectorFactory;
import com.balitechy.spacewar.main.interfaces.GameStyle;
import com.balitechy.spacewar.main.interfaces.IBackgroundRender;
import com.balitechy.spacewar.main.interfaces.IPlayerRender;
import com.balitechy.spacewar.main.models.abstractModels.AbstractPlayer;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 320;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static final int SCALE = 2;
    public final String TITLE = "Space War 2D";

    private boolean running = false;
    private Thread thread;

    // Factories and game components
    private GameStyle gameStyle;
    private IPlayerRender player;
    private ControllerBullet bullets;
    private IBackgroundRender background;
	private SpritesImageLoader sprites;

    public void init() {
        requestFocus();

        sprites = new SpritesImageLoader("/sprites.png");
        
		try {
			sprites.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}

        background = gameStyle.createBackground();
        player = gameStyle.createPlayer((WIDTH * SCALE - AbstractPlayer.WIDTH) / 2, HEIGHT * SCALE - 50, this);
        bullets = new ControllerBullet();

        // Add keyboard listener
        addKeyListener(new InputHandler(this));
    }

	public SpritesImageLoader getSprites() {
		return sprites;
	}

	public ControllerBullet getBullets() {
		return bullets;
	}

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_RIGHT:
                player.setVelX(5);
                break;

            case KeyEvent.VK_LEFT:
                player.setVelX(-5);
                break;

            case KeyEvent.VK_UP:
                player.setVelY(-5);
                break;

            case KeyEvent.VK_DOWN:
                player.setVelY(5);
                break;

            case KeyEvent.VK_SPACE:
                player.shoot();
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_RIGHT:
                player.setVelX(0);
                break;

            case KeyEvent.VK_LEFT:
                player.setVelX(0);
                break;

            case KeyEvent.VK_UP:
                player.setVelY(0);
                break;

            case KeyEvent.VK_DOWN:
                player.setVelY(0);
                break;
        }
    }

    private synchronized void start() {
        if (running) return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    private synchronized void stop() {
        if (!running) return;

        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(1);
    }

    @Override
    public void run() {
        init();

        long lastTime = System.nanoTime();
        final double numOfTicks = 60.0;
        double ns = 1000000000 / numOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println(updates + "ticks, fps " + frames);
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }

    public void tick() {
        player.tick();
        bullets.tick();
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        //////////////////////////////////
        background.renderBackground(g, this);
        player.renderPlayer(g);
        bullets.render(g);
        /////////////////////////////////
        g.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Elige el estilo del juego:");
        System.out.println("1. Vectorial");
        System.out.println("2. Sprite");
        int choice = scanner.nextInt();

        Game game = new Game();

        switch (choice) {
            case 1:
                game.gameStyle = new GameVectorFactory();
                break;
            case 2:
                game.gameStyle = new GameSpriteFactory();
                break;
            default:
                System.out.println("Opción no válida, utilizando el estilo vectorial por defecto.");
                game.gameStyle = new GameVectorFactory();
                break;
        }
		

        game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

        JFrame frame = new JFrame(game.TITLE);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        game.start();
    }
}
