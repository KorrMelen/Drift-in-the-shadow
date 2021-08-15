import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Frame extends JPanel implements KeyListener {
    JFrame frame = new JFrame();
    static int width = 1280;
    static int height = 720;

    Frame() {
        this.setPreferredSize(new Dimension(width,height));
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
