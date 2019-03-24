package shapes;
import teaching.*;
public class Rectangle extends Polygon{
	private int lengthX;
	private int lengthY;
	private Point point;
	
	public Rectangle(Point point, int lx, int ly) {
		this.lengthX = lx;
		this.lengthY = ly;
		this.point = point;
		
	}
	
	@Override
	public Drawable move(int x, int y) {
		this.point = new Point(this.point.getX()+x, this.point.getY()+y);
		draw();
		return this;
	}
	
	public void draw() {
		getWhiteBoard().removeShape(this);
		this.getWhiteBoard().drawRectangle(point.getX(), point.getY(), this.lengthX, this.lengthY);
	}
	
}
