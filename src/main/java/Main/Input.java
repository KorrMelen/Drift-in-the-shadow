package Main;

import java.util.HashMap;
import java.util.ArrayList;
import java.awt.Point;

public class Input {
  ArrayList<Point> clicks = new ArrayList();
  HashMap<Character,Boolean> keys = new HashMap();
  boolean shift = false;
  boolean ctrl = false;
  boolean esc = false;

  public void clear() {
    clicks = new ArrayList();
  }

  public void click(Point p) {
    clicks.add(p);
  }

  public void press(char c) {
    keys.put(c,true);
  }

  public void release(char c) {
    keys.put(c,false);
  }

  public boolean isKeyPressed(char c) {
    return keys.get(c) != null;
  }

  public Point[] clicksPositions() {
    return (Point[]) clicks.toArray();
  }
}
