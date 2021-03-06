package dummy;

public class AbstractFigure {

	Color color = new Color("Blue");
	int length;
	int height;

	AbstractFigure() {
		length = 10;
		height = 10;
	}

	boolean hasSidesParallel() {
		return false;
	}

	public String getColor() {
		return color.getColor();
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	boolean isRectangle() {
		return false;
	}

	boolean isSquare() {
		return false;
	}

	int surface() {
		return length + height;
	}

}
