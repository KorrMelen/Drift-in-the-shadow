package Menus;

import Main.Input;
import Main.Setting;

import java.awt.*;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.*;

public class Home implements Menu{

    private Button[] buttons = new Button[]{
            new Button(Setting.width/2-125, Setting.height/4-30,250,30,"Let's play a game")
    };

    @Override
    public Menu update(Input _inputs) {
        return this;
    }

    @Override
    public void draw(Graphics _graphics) {
        for (Button button:this.buttons) {
            button.draw(_graphics);
        }
    }
}
