package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class JetpackJoyride extends JPanel implements ActionListener {
    private int playerX = 50, playerY = 250, playerWidth = 50, playerHeight = 50;
    private boolean flying = false;
    private int gravity = 2, lift = -15, velocity = 0;
    private int score = 0;
    private Timer timer;
    private ArrayList<Rectangle> lasers;
    private Random rand = new Random();
    private boolean gameOver = false;

//    public JetpackJoyride() {
//        setPreferredSize(new Dimension(800, 400));
//        setBackground(Color.BLACK);
//        setFocusable(true);
//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//                    flying = true;
//                }
//                if (e.getKeyCode() == KeyEvent.VK_R && gameOver) {
//                    resetGame();
//                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//                    flying = false;
//                }
//            }
//        });
//
//        lasers = new ArrayList<>();
//        timer = new Timer(20, this);
//        timer.start();
//    }

//    private void resetGame() {
//        playerY = 250;
//        score = 0;
//        lasers.clear();
//        flying = false;
//        velocity = 0;
//        gameOver = false;
//        timer.start();
//    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // O‘yinchi (Jetpack)
//        g.setColor(Color.YELLOW);
//        g.fillOval(playerX, playerY, playerWidth, playerHeight);
//
//        // Lazerlari
//        g.setColor(Color.RED);
//        for (Rectangle laser : lasers) {
//            g.fillRect(laser.x, laser.y, laser.width, laser.height);
//        }
//
//        // Score
//        g.setColor(Color.WHITE);
//        g.setFont(new Font("Arial", Font.BOLD, 20));
//        g.drawString("Score: " + score, 650, 50);
//
//        // Game Over
//        if (gameOver) {
//            g.setColor(Color.RED);
//            g.setFont(new Font("Arial", Font.BOLD, 30));
//            g.drawString("GAME OVER!", 300, 200);
//            g.setFont(new Font("Arial", Font.BOLD, 20));
//            g.drawString("Press 'R' to Restart", 320, 250);
//        }
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (flying) {
//            velocity = lift;
//        } else {
//            velocity += gravity;
//        }
//
//        playerY += velocity;
//        if (playerY > 350) {
//            playerY = 350;
//        }
//        if (playerY < 0) {
//            playerY = 0;
//        }
//
//        for (int i = 0; i < lasers.size(); i++) {
//            Rectangle laser = lasers.get(i);
//            laser.x -= 5;
//            if (laser.x + laser.width < 0) {
//                lasers.remove(i);
//                score++;
//            }
//            if (new Rectangle(playerX, playerY, playerWidth, playerHeight).intersects(laser)) {
//                timer.stop();
//                gameOver = true;
//            }
//        }
//
//        if (rand.nextInt(100) < 2 && !gameOver) {
//            int laserHeight = rand.nextInt(100) + 50;
//            int laserY = rand.nextInt(300);
//            lasers.add(new Rectangle(800, laserY, 30, laserHeight));
//        }
//
//        repaint();
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Jetpack Joyride Game");
//        JetpackJoyride game = new JetpackJoyride();
//        frame.add(game);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//    }
}