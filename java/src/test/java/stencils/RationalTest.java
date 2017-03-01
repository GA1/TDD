package stencils;

import org.junit.Test;

import static org.junit.Assert.*;


public class RationalTest {


	Rational r;

	@Test
	public void test010() {
		r = new Rational(2, 1);
		assertTrue(r.equals(r));
	}

	@Test
	public void test020() {
		r = new Rational(2, 1);
		assertFalse(r.equals(null));
	}
	
}
