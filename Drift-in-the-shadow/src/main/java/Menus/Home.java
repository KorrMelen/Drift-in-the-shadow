package Menus;

import Main.Input;
import Main.Setting;

import java.awt.*;

public class Home implements Menu{

    public boolean quitTheGame = false;

    private class tag {
        static final String Play = "Play";
        static final String Setting = "Setting";
        static final String Quit = "Quit";
    }

    private Button playButton = new Button(tag.Play,Setting.width/2-125, Setting.height/2-100,250,30,"Let's play a game") ;
    private Button settingButton = new Button(tag.Setting,Setting.width/2-125,Setting.height/2-50,250,30,"Setting");
    private Button quitButton = new Button(tag.Quit,Setting.width/2-125,Setting.height/2,250,30,"Quit the game");
    private Button[] buttons = new Button[]{
            this.playButton,
            this.settingButton,
            this.quitButton
    };

    public Home() {
    }

    @Override
    public Menu update(Input _inputs) {
        Menu result = this;
        try {
            for (Point pos : _inputs.clicksPositions()) {
                for (Button button : this.buttons) {
                    if (button.isClicked(pos.x, pos.y))
                       switch (button.tag)
                       {
                           case tag.Play: result = new GameConfig();break;
                           case tag.Setting: result = new Option();break;
                           case tag.Quit: quitTheGame = true;
                       }
                }
            }
        }catch (Exception ex){

        }
        return result;
    }

    @Override
    public void draw(Graphics _graphics) {
        for (Button button:this.buttons) {
            button.draw(_graphics);
        }
    }
}
