package calculatorApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorAppTest {

	@Test
	public void testAddNumbers() {
		assertEquals(3, Calculator.add(1, 2));
	}
	
	@Test
	public void testSubstractNumbers() {
		assertEquals(-1, Calculator.subtract(1, 2));
	}
	
	@Test
	public void testMultiplyNumbers() {
		assertEquals(2, Calculator.multiply(1, 2));
	}
	
	@Test
	public void testDivideNumbers() {
		assertEquals(0, Calculator.divide(1, 2));
	}

}
