package shapes;
import java.awt.Color;

import teaching.WhiteBoard;

public abstract class Shape implements Drawable {
	protected Object representation;
	private static WhiteBoard whiteBoard = new WhiteBoard();
	private Color color;
	private Boolean solid;

	public Shape() {
		
	}
	
	public WhiteBoard getWhiteBoard() {
		return whiteBoard;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) throws IllegalArgumentException{
		if(color == null) throw new IllegalArgumentException("Color must not be null");
		this.color = color;
	}

	public Boolean getSolid() {
		return solid;
	}

	public void setSolid(Boolean solid) {
		this.solid = solid;
	}
}
