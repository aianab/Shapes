package shapes;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
		
	public int getY() {
		return y;
	}
	
	
	public Point move(int newX, int newY){
		this.x = this.x + newX;
		this.y = this.y + newY;
		return this ; 
	}
	
}
