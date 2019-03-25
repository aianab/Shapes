package shapes;

import java.awt.Color;

public interface Drawable {
	void draw();
	Drawable move(int x, int y);
}
