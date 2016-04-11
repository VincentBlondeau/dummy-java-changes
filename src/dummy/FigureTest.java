package dummy;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigureTest {

	@Test
	public void testIsRectangle() {
		Figure f = new Rectangle();
		assertTrue(f.isRectangle());
	}
	
	@Test
	public void testFigureIsNotRectangle() {
		Figure f = new Figure();
		assertFalse(f.isRectangle());
	}
	
	@Test
	public void testIsSquare() {
		Figure f = new Square();
		assertTrue(f.isSquare());
	}
	
	@Test
	public void testFigureIsNotSquare() {
		Figure f = new Figure();
		assertFalse(f.isSquare());
	}

	
	@Test
	public void testHasSidesParallel() {
		Figure f = new Rectangle();
		assertFalse(f.hasSidesParallel());
	}
	
	
	@Test
	public void testLength() {
		Figure f = new Figure();
		assertEquals(f.getLength(),10);
	}
	
	@Test
	public void testHeight() {
		Figure f = new Figure();
		assertEquals(f.getHeight(),10);
	}
	
	@Test
	public void testSurface() {
		Figure f = new Figure();
		assertEquals(f.surface(),20);
	}
	
}
