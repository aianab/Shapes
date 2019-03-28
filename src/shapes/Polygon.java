package shapes;

import java.util.ArrayList;

import teaching.WhiteBoard;

public class Polygon extends Shape {
	private ArrayList<Point> points = new ArrayList<>();
	
	public Polygon() {
		
	}

	@Override
	public void draw() {
		getWhiteBoard().removeShape(this);
		double[] x = new double[points.size()];
		double[] y = new double[points.size()];
		for (int i=0; i<x.length; i++) {
			x[i] = points.get(i).getX();
			y[i] = points.get(i).getY();
		}
		getWhiteBoard().drawPolygon(x, y);
	}

	@Override
	public Drawable move(int x, int y) {
		for(int i = 0; i < points.size(); i++) {
			Point p = points.get(i);
			points.set(i, new Point(p.getX() + x, p.getY() + y));
		}
		draw();
		return this;
	}
	
	public void setPoints(ArrayList<Point> points) throws PolygonShapeException {
		if (points.size() < 2) throw new PolygonShapeException("Number of points must be at least two");
		this.points = points;
	}
	
	public ArrayList<Point> getPoints() {
		return this.points;
	}
	
}
