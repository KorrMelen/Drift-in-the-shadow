package Menus;

import Main.Input;
import Main.Setting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Home extends JPanel {

    public boolean quitTheGame = false;
    public Frame frame;
    private Button playButton = new Button("Jouer") ;
    private Button settingButton = new Button("Option");
    private Button quitButton = new Button("Quitter");
    private Button[] buttons = new Button[]{
            this.playButton,
            this.settingButton,
            this.quitButton
    };

    public Home(Frame _frame) {
        this.setBounds(0,0,Setting.width,Setting.height);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.frame = _frame;
        playButton.setBounds(this.getWidth()/2-100,this.getHeight()/2-150,100,30);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.removeAll();
                frame.add(new GameConfig());
                frame.repaint();
            }
        });
        settingButton.setBounds(this.getWidth()/2-100,this.getHeight()/2-100,100,30);
        settingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.removeAll();
                frame.add(new Option());
                frame.repaint();
            }
        });
        quitButton.setBounds(this.getWidth()/2-100,this.getHeight()/2-50,100,30);
        quitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        for (Button button:this.buttons) {
            this.add(button) ;
        }
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
    }
}
