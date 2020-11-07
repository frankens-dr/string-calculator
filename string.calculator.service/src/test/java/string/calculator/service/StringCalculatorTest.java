package string.calculator.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testForNoNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.Add(""));
		assertEquals(0, stringCalculator.Add(" "));
	}
	
	@Test
	public void testForOneNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.Add("1"));
		assertEquals(5, stringCalculator.Add("5"));
		assertEquals(22, stringCalculator.Add("22"));
	}
	
	@Test
	public void testForMoreThanOneNumbers() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.Add("1,2"));
		assertEquals(7, stringCalculator.Add("1,2,4"));
		assertEquals(22, stringCalculator.Add("1,11,10"));
	}
}
