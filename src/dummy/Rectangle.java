package dummy;

public class Rectangle extends Figure {

	public Rectangle() {
		color.setColor("Green");
	}
	
	int numberOfRightAngles() {
		return 4;
	}
	
	boolean isRectangle(){
		return true;
	}
	
	boolean hasSidesParallel() {
		return true;
	}

	
}
