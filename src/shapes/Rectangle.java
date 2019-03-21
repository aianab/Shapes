package shapes;
import teaching.*;
public class Rectangle extends Polygon {
	private int lengthX;
	private int lengthY;
	private Point point;
	
	public Rectangle(Point point, int lx, int ly) {
		this.lengthX = lx;
		this.lengthY = ly;
		this.point = point;
	}
	
	public void draw() {
		this.getWhiteBoard().drawRectangle(point.getX(), point.getY(), this.lengthX, this.lengthY);
	}
	
}
