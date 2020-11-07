package string.calculator.service;

public class StringCalculatorService {

	public int add(String Number) {
		int sum = 0;
		char x = ' ';
		if (Number.equals(" ")) {
			return 0;
		}
		for (int i = 0; i < Number.length(); i++) {
			x = Number.charAt(i);
			if (x != ',') {
				sum += Integer.parseInt(String.valueOf(x));
			}
		}
		return sum;
	}
}
