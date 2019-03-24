package shapes;
import java.util.HashSet;
import java.util.Set;

import teaching.*;
public class Figure implements Drawable{
	
	private Set<Drawable> shapes = new HashSet<Drawable>();
	
	private Polygon polygon;
	
	Figure(){
		polygon = new Polygon();
	}
	
	Figure addShape(Drawable o) {
		shapes.add(o);
		
		return this;
		}
	
	@Override
	public void draw() {
		this.removeShapes();
		for (Drawable drawable : shapes) {
			drawable.draw();
		}
	}
	

	@Override
	public Drawable move(int x, int y) {
		for (Drawable drawable : shapes) {
			drawable.move(x, y);
		}
		return this;
	}
	
	public Figure snowMan() {
		//Circle bigCircle = new Circle();
		
		return null;
	}
	
	private void removeShapes() {
		for (Drawable drawable : shapes) {
			polygon.getWhiteBoard().removeShape(drawable);
		}
	}

}
