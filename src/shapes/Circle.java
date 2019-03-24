package shapes;

import java.awt.Color;

import teaching.WhiteBoard;

public class Circle extends Shape{
	private int radius;
	private Point center;
	
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}

	@Override
	public void draw() {
		getWhiteBoard().drawCircle(center.getX(), center.getY(), radius);
	}
	
	public void draw(Color color, boolean solid) {
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
