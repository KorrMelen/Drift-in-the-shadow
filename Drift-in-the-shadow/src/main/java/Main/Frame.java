package Main;

import Menus.Home;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.EventListener;

class Frame extends JFrame  {
    ArrayList<Menu> menuStack = new ArrayList<>();
    Menu currentMenu = null;
    volatile Input inputs = new Input();

    Frame(){
        this.setSize(new Dimension(Setting.width ,Setting.height));
        this.setResizable(true);
        //this.setContentPane(this);
        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Home(this));
        this.setVisible(true);
    }
}
