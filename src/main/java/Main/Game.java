package Main;

import java.awt.*;
import javax.swing.*;
import Menus.*;

class Game {
  ArrayList<Menu> menuStack = new ArrayList();
  Menu currentMenu = null;

  Game(){
    switchMenu(new Home());
  }

  void switchMenu(Menu menu) {
    if menu == null {
      currentMenu = menuStack.remove(menuStack.size()-1);
    } else {
      menuStack.add(currentMenu);
      currentMenu = menu;
    }
  }
      

  public void update(Input inputs){
    next = currentMenu.update(inputs);
    switchMenu(next);
  }

  public void draw(Graphics g){
    currentMenu.draw(g);
  }
}
