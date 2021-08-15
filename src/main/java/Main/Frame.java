package Main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Frame extends JPanel implements KeyListener {
    JFrame frame = new JFrame();
    Game game = new Game();
    Input inputs = new Input();

    Frame(){
        this.setPreferredSize(new Dimension(Setting.width ,Setting.height));
        frame.setResizable(true);
        frame.setContentPane(this);
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void close() {
        // TODO call a menu to close instead
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        game.update(inputs); // FIXME put update outside of paintcomponents
        game.draw(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    
    @Override
    public void keyPressed(KeyEvent e) {
      System.out.println(e.getKeyCode());
        switch(e.getKeyCode()) {
            case 27 : close(); break;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {}
}
