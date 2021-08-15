package Menus;

import Main.Input;
import Main.Setting;

import java.awt.*;
import javax.swing.*;

public class Home implements Menu{

    @Override
    public Menu update(Input _inputs) {
        return this;
    }

    @Override
    public void draw(Graphics _graphics) {

        _graphics.drawRoundRect(Setting.width/2-1, Setting.height/2-1, 30, 50, 10, 10);
        _graphics.setColor(Color.RED);
        _graphics.drawString("Play a game", Setting.width/2-1, Setting.height/2-1);
    }
}
