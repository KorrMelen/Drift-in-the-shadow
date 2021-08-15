package Menus;
import Main.*;

import java.awt.Graphics;

public interface Menu {
    public Menu update(Input _inputs);

    public void draw(Graphics _graphics);
}
