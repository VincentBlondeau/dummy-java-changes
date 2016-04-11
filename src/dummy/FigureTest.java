package dummy;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigureTest {

	@Test
	public void testIsRectangle() {
		AbstractFigure f = new Rectangle();
		assertTrue(f.isRectangle());
	}
	
	@Test
	public void testFigureIsNotRectangle() {
		AbstractFigure f = new AbstractFigure();
		assertFalse(f.isRectangle());
	}
	
	@Test
	public void testIsSquare() {
		AbstractFigure f = new Square();
		assertTrue(f.isSquare());
	}
	
	@Test
	public void testFigureIsNotSquare() {
		AbstractFigure f = new AbstractFigure();
		assertFalse(f.isSquare());
	}

	
	@Test
	public void testHasSidesParallel() {
		AbstractFigure f = new Rectangle();
		assertFalse(f.hasSidesParallel());
	}
	
	
	@Test
	public void testLength() {
		AbstractFigure f = new AbstractFigure();
		assertEquals(f.getLength(),10);
	}
	
	@Test
	public void testHeight() {
		AbstractFigure f = new AbstractFigure();
		assertEquals(f.getHeight(),10);
	}
	
	@Test
	public void testSurface() {
		AbstractFigure f = new AbstractFigure();
		assertEquals(f.surface(),20);
	}
	
}
