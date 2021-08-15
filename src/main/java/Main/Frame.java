package Main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Frame extends JPanel implements KeyListener, MouseListener {
    JFrame frame = new JFrame();
    Game game = new Game();
    volatile Input inputs = new Input();
    private int width;
    private int height;

    Frame(){
        this.setPreferredSize(new Dimension(Setting.width ,Setting.height));
        frame.setResizable(true);
        frame.setContentPane(this);
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(this);
        this.addMouseListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {
        while(true) { 
        if (inputs.esc) {
            close();
        }
        game.update(inputs); 
        inputs.clear();
            frame.repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void close() {
        // TODO call a menu to close instead
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        game.draw(g);
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
