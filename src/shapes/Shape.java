package shapes;
import java.awt.Color;

import teaching.*;

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

	public void setColor(Color color) {
		this.color = color;
	}

	public Boolean getSolid() {
		return solid;
	}

	public void setSolid(Boolean solid) {
		this.solid = solid;
	}
	
}
