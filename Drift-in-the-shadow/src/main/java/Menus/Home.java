package Menus;

import Main.Input;
import Main.Setting;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Home extends Menu {

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
        this.frame = _frame;
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.removeAll();
                frame.add(new GameConfig());
                frame.repaint();
            }
        });
        quitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
    }

    @Override
    public Menu update(Input _inputs) {
        Menu result = this;
        try {

        }catch (Exception ex){

        }
        return result;
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        for (Button button:this.buttons) {
            this.add(button) ;
        }
    }
}
