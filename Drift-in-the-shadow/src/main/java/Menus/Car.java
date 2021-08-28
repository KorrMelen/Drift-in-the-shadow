package Menus;

import lombok.Data;

import java.awt.*;


@Data

public class Car {
    private int x;
    private int y;
    private int width;
    private int height;
    private String label;
    private Point margin;
    private Font font;
    private int borderSize;

    Car(int _posX,int _posY,int _width, int _height,String _label){
        this.x=_posX;
        this.y=_posY;
        this.width=_width;
        this.height=_height;
        this.label=_label;
        this.margin = new Point(10,7);
        this.borderSize = 10;
        this.font = new Font("Courier", Font.BOLD, 20);
    }

    public void draw(Graphics _graphics){
        _graphics.setColor(Color.white);
        _graphics.drawRoundRect(this.x, this.y, this.width, this.height,borderSize,borderSize);
        _graphics.setFont(font);
        _graphics.setColor(Color.RED);
        _graphics.drawString(this.label, this.x+this.margin.x, this.y+this.height-this.margin.y);
    }
}
