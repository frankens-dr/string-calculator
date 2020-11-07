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
	public void testForMoreThanOneNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.Add("1,2"));
		assertEquals(7, stringCalculator.Add("1,2,4"));
		assertEquals(22, stringCalculator.Add("1,11,10"));
	}
	
	@Test
	public void testForMoreThanOneNumberAndMultipleDelimiters() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(7, stringCalculator.Add("//;\n1;2\n4"));
		assertEquals(17, stringCalculator.Add("//;\\n;5\\n3;//9"));
		assertEquals(22, stringCalculator.Add("1\n11\n10"));
	}
}
