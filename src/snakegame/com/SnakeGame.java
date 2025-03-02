package snakegame.com;

import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame(){
        super("Snake Game");

        add(new Board());
        pack();

        setSize(500,400);
        setLocationRelativeTo(null);
        setResizable(false);


    }
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
