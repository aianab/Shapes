package shapes.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import shapes.Point;
import shapes.Polygon;
import shapes.PolygonShapeException;

public class PolygonTest {
	@Test
	public void setPointsTest() {
		try {
		Polygon polygon = new Polygon();
		polygon.setPoints(new ArrayList <Point>(Arrays.asList(new Point(10, 50))));
		}catch(PolygonShapeException e) {
			assert true;
		}
		

	}

}
