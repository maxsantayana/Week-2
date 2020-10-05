import acm.program.*;
import java.awt.*;
import acm.graphics.*;

public class RobottFace extends GraphicsProgram {
 
 
 private static final int HEAD_WIDTH = 100;
 private static final int HEAD_HEIGHT = 150;
 private static final int EYE_RADIUS = 10;
 private static final int MOUTH_WIDTH = 80;
 private static final int MOUTH_HEIGHT = 15;

 public void run() {
 
	 
GRect head = new GRect(getWidth() / 2 - HEAD_WIDTH /2, getHeight() / 2 - HEAD_HEIGHT /2, HEAD_WIDTH, HEAD_HEIGHT);

head.setFillColor(Color.gray);
head.setFilled(true);
head.setColor(Color.black);

add(head);


GOval eye = new GOval(getWidth()/2-30, getHeight()/2-30, EYE_RADIUS, EYE_RADIUS);
 
eye.setFillColor(Color.yellow);
eye.setFilled(true);
eye.setColor(Color.black);

add(eye);

GOval eye2 = new GOval(getWidth()/2+20, getHeight()/2-30, EYE_RADIUS, EYE_RADIUS);

eye2.setFillColor(Color.yellow);
eye2.setFilled(true);
eye2.setColor(Color.black);
add(eye2);

GRect mouth = new GRect(getWidth()/2-40, getHeight()/2+10, MOUTH_WIDTH, MOUTH_HEIGHT);
mouth.setFillColor(Color.yellow);
mouth.setFilled(true);
mouth.setColor(Color.black);
add(mouth);
} 
 
 }