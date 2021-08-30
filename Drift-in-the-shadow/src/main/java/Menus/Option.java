package Menus;

import Main.Input;
import Main.Setting;

import javax.swing.*;
import java.awt.*;

public class Option extends JPanel {
    public Frame frame;

    public Option(Frame _frame){
        this.frame=_frame;
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        this.setBounds(0,0, Setting.width,Setting.height);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        TextArea widthArea = new TextArea("Largeur");
        widthArea.setBounds(0,0,100,20);
        TextField widthField = new TextField(Integer.toString(Setting.width));
        widthField.setBounds(0,100,100,20);
        this.add(widthArea);
        this.add(widthField);
    }
}
