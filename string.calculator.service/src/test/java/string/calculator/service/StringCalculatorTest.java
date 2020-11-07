package string.calculator.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testForNoNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.Add(""));
		assertEquals(0, stringCalculator.Add(" "));
		assertEquals(2, stringCalculator.GetCalledCount());
	}
	
	@Test
	public void testForOneNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.Add("1"));
		assertEquals(5, stringCalculator.Add("5"));
		assertEquals(22, stringCalculator.Add("22"));
		assertEquals(3, stringCalculator.GetCalledCount());
	}
	
	@Test
	public void testForMoreThanOneNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.Add("1,2"));
		assertEquals(7, stringCalculator.Add("1,2,4"));
		assertEquals(22, stringCalculator.Add("1,11,10"));
		assertEquals(3, stringCalculator.GetCalledCount());
	}
	
	@Test
	public void testForMoreThanOneNumberAndMultipleDelimiters() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(7, stringCalculator.Add("//;\n1;2\n4"));
		assertEquals(6, stringCalculator.Add("//[***]\\n1***2***3"));
		assertEquals(22, stringCalculator.Add("1\n11\n10"));
		assertEquals(3, stringCalculator.GetCalledCount());;
	}
	
	@Test
	public void testForNegativeNumbers() {
		StringCalculator stringCalculator = new StringCalculator();
		try {
			stringCalculator.Add("1,-2");
		} catch (Exception e) {
			assertEquals("negatives not allowed", e.getMessage());
		}
		try {
			stringCalculator.Add("//;\\\\n;5\\\\n-3;//9");
		} catch (Exception e) {
			assertEquals("negatives not allowed", e.getMessage());
		}
		assertEquals(2, stringCalculator.GetCalledCount());
	}
	
	@Test
	public void testForNumbersGreaterThanThousand() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1003, stringCalculator.Add("//;\\n;5000\\n3;//1000"));
		assertEquals(11, stringCalculator.Add("1\n1100\n10"));
		assertEquals(2, stringCalculator.GetCalledCount());
	}
}
