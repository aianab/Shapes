package shapes;

public class Line extends Polygon {
	private Point p1;
	private Point p2;
	
	public Line(Point p1, Point p2) throws IllegalArgumentException{
		if(p1 == null || p2 == null) throw new IllegalArgumentException("Starting and ending points in class Line must be declared");
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void draw() {
		getWhiteBoard().removeShape(this);
		getWhiteBoard().drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
	
	public Drawable move(int x, int y) {
		p1 = new Point(p1.getX() + x, p1.getY() + y);
		p2 = new Point(p2.getX() + x, p2.getY() + y);
		draw();
		return this;
	}
}
