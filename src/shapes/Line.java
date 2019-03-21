package shapes;

public class Line extends Polygon {
	private Point p1;
	private Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void draw() {
		getWhiteBoard().drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
	
	public Drawable move(int x, int y) {
		getWhiteBoard().removeShape(this);
		p1 = new Point(p1.getX() + x, p1.getY() + y);
		p2 = new Point(p2.getX() + x, p2.getY() + y);
		return this;
	}
}
