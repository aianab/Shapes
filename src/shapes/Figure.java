package shapes;
import java.awt.Color;
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
	
	public static Figure snowMan() {
		Figure snegovik = new Figure();
		Circle bigCircle = new Circle(100, new Point(400, 100));
		bigCircle.draw();
		
		Circle middleCircle = new Circle(70, new Point(400, 270));
		middleCircle.draw();
		
		Circle smallCircle = new Circle(45, new Point(400, 385));
		smallCircle.draw();
		
		Circle nose = new Circle(6, new Point(400, 385));
		nose.draw(Color.ORANGE, true);
		
		Circle leftEye = new Circle(6, new Point(385, 400));
		leftEye.draw(Color.black, true);
		
		Circle rightEye = new Circle(6, new Point(415, 400));
		rightEye.draw(Color.black, true);
		
		Circle buttonBreast1 = new Circle(6, new Point(400, 300));
		buttonBreast1.draw(Color.black, true);
		
		Circle buttonBreast2 = new Circle(6, new Point(400, 240));
		buttonBreast2.draw(Color.black, true);
		
		Circle buttonBottom1 = new Circle(6, new Point(400, 150));
		buttonBottom1.draw(Color.black, true);
		
		Circle buttonBottom2 = new Circle(6, new Point(400, 100));
		buttonBottom2.draw(Color.black, true);
		
		Circle buttonBottom3 = new Circle(6, new Point(400, 50));
		buttonBottom3.draw(Color.black, true);
		
		Line leftHand = new Line(new Point(330,270), new Point(280,300));
		leftHand.draw();
		
		Line rigtHand = new Line(new Point(470,270), new Point(520,300));
		rigtHand.draw();
		
		Line HatUnderline = new Line(new Point(355,430), new Point(445,430));
		HatUnderline.draw();
		
		Rectangle hat = new Rectangle(new Point(400, 445), 60, 30);
		hat.draw();
		
		return snegovik;	
	}
	
	private void removeShapes() {
		for (Drawable drawable : shapes) {
			polygon.getWhiteBoard().removeShape(drawable);
		}
	}

}
