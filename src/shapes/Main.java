package shapes;
import teaching.*;
public class Main {
	public static void main(String ...args) {
		
		Point centerPoint = new Point(50,50);
		Rectangle rect = new Rectangle(centerPoint, 100, 200);
		WhiteBoard wb = new WhiteBoard();
		wb.drawRectangle(50, 50, 100, 150);
	}
}
