package string.calculator.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		StringCalculatorService stringCalculator = new StringCalculatorService();
		assertEquals(0, stringCalculator.add(""));
		assertEquals(0, stringCalculator.add(" "));
		assertEquals(1, stringCalculator.add("1"));
	}
}
