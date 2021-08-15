package Menus;

import Main.Input;
import Main.Setting;

import java.awt.*;

public class Button {
    private int x;
    private int y;
    private int width;
    private int height;
    private String label;
    private int[] margin;
    private Font font;
    private int borderSize;

    Button(int _posX,int _posY,int _width, int _height,String _label){
        this.x=_posX;
        this.y=_posY;
        this.width=_width;
        this.height=_height;
        this.label=_label;
        this.margin = new int[]{10,7};
        this.borderSize = 10;
        this.font = new Font("Courier", Font.BOLD, 20);
    }

    public void draw(Graphics _graphics){
        _graphics.setColor(Color.white);
        _graphics.drawRoundRect(this.x, this.y, this.width, this.height,borderSize,borderSize);
        _graphics.setFont(font);
        _graphics.setColor(Color.RED);
        _graphics.drawString(this.label, this.x+margin[0], this.y+this.height-margin[1]);
    }

    public void changeFont(Font _font){
        this.font = _font;
    }

    public void changeMarginX(int x){
        this.margin[0]=x;
    }

    public void changeMarginY(int y){
        this.margin[1]=y;
    }

    public void changeMargin(int x,int y){
        this.changeMarginX(x);
        this.changeMarginY(y);
    }

    public void changeBorderSize(int _large){
        this.borderSize=_large;
    }

    public Boolean isClicked(int _posX, int _posY){
        return this.x<=_posX && this.y<=_posY && _posX<=this.x+this.width && _posY<=this.y+this.height;
    }
}
