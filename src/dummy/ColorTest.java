package dummy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {

	@Test
	public void testColor() {
		Color c = new Color();
		c.setColor("Purple");
		assertEquals(c.getColor(),"Purple");
	}
	
	@Test
	public void testColorRectangle() {
		Figure f = new Rectangle();
		assertEquals(f.getColor(),"Green");
	}
	
	@Test
	public void testColorSquare() {
		Figure f = new Square();
		assertEquals(f.getColor(),"Black");
	}
	
}
