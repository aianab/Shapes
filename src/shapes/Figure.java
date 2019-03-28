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
	
	Figure addShape(Drawable o) throws NullPointerException{
		if(o == null) throw new NullPointerException();
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
		snegovik.addShape(bigCircle);
		
		Circle middleCircle = new Circle(70, new Point(400, 270));
		snegovik.addShape(middleCircle);
		
		Circle smallCircle = new Circle(45, new Point(400, 385));
		snegovik.addShape(smallCircle);
		
		Circle nose = new Circle(6, new Point(400, 385));
		nose.setColor(Color.ORANGE);
		nose.setSolid(true);
		snegovik.addShape(nose);
		
		Circle leftEye = new Circle(6, new Point(385, 400));
		leftEye.setColor(Color.BLACK);
		leftEye.setSolid(true);
		snegovik.addShape(leftEye);
		
		
		Circle rightEye = new Circle(6, new Point(415, 400));
		rightEye.setColor(Color.BLACK);
		rightEye.setSolid(true);
		snegovik.addShape(rightEye);
		
		Circle buttonBreast1 = new Circle(6, new Point(400, 300));
		buttonBreast1.setColor(Color.BLACK);
		buttonBreast1.setSolid(true);
		snegovik.addShape(buttonBreast1);
		
		Circle buttonBreast2 = new Circle(6, new Point(400, 240));
		buttonBreast2.setColor(Color.BLACK);
		buttonBreast2.setSolid(true);
		snegovik.addShape(buttonBreast2);
		
		Circle buttonBottom1 = new Circle(6, new Point(400, 150));
		buttonBottom1.setColor(Color.BLACK);
		buttonBottom1.setSolid(true);
		snegovik.addShape(buttonBottom1);
		
		Circle buttonBottom2 = new Circle(6, new Point(400, 100));
		buttonBottom2.setColor(Color.BLACK);
		buttonBottom2.setSolid(true);
		snegovik.addShape(buttonBottom2);
		
		Circle buttonBottom3 = new Circle(6, new Point(400, 50));
		buttonBottom3.setColor(Color.BLACK);
		buttonBottom3.setSolid(true);
		snegovik.addShape(buttonBottom3);
		
		Line leftHand = new Line(new Point(330,270), new Point(280,300));
		snegovik.addShape(leftHand);
		
		Line rigtHand = new Line(new Point(470,270), new Point(520,300));
		snegovik.addShape(rigtHand);
		
		Line HatUnderline = new Line(new Point(355,430), new Point(445,430));
		snegovik.addShape(HatUnderline);
		
		Rectangle hat = new Rectangle(new Point(400, 445), 60, 30);
		snegovik.addShape(hat);
		
		snegovik.draw();
		
		return snegovik;	
	}
	
	private void removeShapes() {
		for (Drawable drawable : shapes) {
			polygon.getWhiteBoard().removeShape(drawable);
		}
	}

}
