package shapes;

import java.awt.Color;
import java.util.IllegalFormatCodePointException;

import teaching.WhiteBoard;

public class Circle extends Shape{
	private int radius;
	private Point center;
	
	public Circle(int radius, Point center) throws IllegalArgumentException{
		if(radius < 0) throw new IllegalArgumentException("Radius must be positive");
		if(center == null) throw new IllegalArgumentException("Center must be declared");
		this.radius = radius;
		this.center = center;	
	}
	

	@Override
	public void draw() {
		if(getColor() != null) {
			draw(getColor(), getSolid());
		} else {
			getWhiteBoard().drawCircle(center.getX(), center.getY(), radius);
		}
	}
	
	public void draw(Color color, boolean solid) throws IllegalArgumentException{
		if(color == null) throw new IllegalArgumentException();
		getWhiteBoard().removeShape(this);
		getWhiteBoard().drawCircle(center.getX(), center.getY(), radius, color, solid);
	}

	@Override
	public Drawable move(int x, int y) {
		this.center = new Point(x, y);
		draw();
		return this;
	}

}
