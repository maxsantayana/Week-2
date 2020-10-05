import acm.program.*;
import java.awt.Color;
import acm.graphics.*;
import acm.util.*;

public class randomcircles extends GraphicsProgram {
	private static final int TEN_CIRCLES = 10;
	RandomGenerator z = new RandomGenerator();
	
	
	// run starting at 0, if less than 10, run again whilst adding 1 each time 
	public void run() {
	for (int i = 0; i < TEN_CIRCLES; i++) {
	
		
	//radius is random between 5 and 50
	double r = z.nextDouble(5, 50);
	//x cord is random between point 0 and 2 times the radius away from far side
	double x = z.nextDouble(0, getWidth() - 2*r);
	//y cord is random between point 0 and 2 times the radius away from far side
	double y = z.nextDouble(0, getHeight() - 2*r);
	//color is set to randomize on rColor
	Color rColor = z.nextColor();
	//create circle w/ random cord
	GOval circy = new GOval(x, y, r, r);
	//fills circle with random color and adds
	circy.setFilled(true);
	circy.setFillColor(rColor);
	add(circy);
	}}}
	