import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import acm.graphics.*;

public class drawinglines extends GraphicsProgram {
	public void run() { addMouseListeners();}
	
	public void mousePressed(MouseEvent Z) {
	
	double x = Z.getX();
	double y = Z.getY();
	
	line = new GLine(x, y, x, y);
	add(line);
	}
public void mouseDragged(MouseEvent Z) {
double x = Z.getX();
double y = Z.getY();
line.setEndPoint(x, y);
	}
public GLine line;
	}
 