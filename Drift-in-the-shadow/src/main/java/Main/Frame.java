package Main;

import Menus.Home;
import Menus.Menu;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

class Frame extends JFrame implements KeyListener, MouseListener {
    ArrayList<Menu> menuStack = new ArrayList<>();
    Menu currentMenu = null;
    volatile Input inputs = new Input();

    Frame(){
        this.setSize(new Dimension(Setting.width ,Setting.height));
        this.setResizable(true);
        //this.setContentPane(this);
        //this.pack();
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Home(this));
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    
    @Override
    public void keyPressed(KeyEvent e) {
      inputs.press(e.getKeyChar());
      switch(e.getKeyCode()) {
          case 16 : inputs.shift = true; break;
          case 17 : inputs.ctrl = true; break;
          case 27 : inputs.esc = true; break;
      }
    }


    @Override
    public void keyReleased(KeyEvent e) {
      inputs.release(e.getKeyChar());
      switch(e.getKeyCode()) {
          case 16 : inputs.shift = false; break;
          case 17 : inputs.ctrl = false; break;
          case 27 : inputs.esc = false; break;
      }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
      inputs.click(e.getPoint());
    }
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

}
