package ui;

import domain.GamePanel;

import javax.swing.*;

public class GameFrame extends JFrame{

    GamePanel gamePlay = new GamePanel();
    JFrame obj = new JFrame();

    public GameFrame(){
        obj.setBounds(10,10,1200,500);
        obj.setTitle("Need For Spear");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setBounds(10,10,1200,500);

        obj.setVisible(true);
    }

}
