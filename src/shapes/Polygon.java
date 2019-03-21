package shapes;

import java.util.ArrayList;

public class Polygon extends Shape {
	private ArrayList<Point> points = new ArrayList<>();
	
	public Polygon() {
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Drawable move(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	
	public ArrayList<Point> getPoints() {
		return this.points;
	}
	
}
