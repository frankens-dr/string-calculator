package string.calculator.service;

public class StringCalculator {

	public int Add(String Number) {
		int sum = 0;
		char x = ' ', x1 = ' ';
		String subNum = "";
		if (Number.equals(" ")) {
			return 0;
		}
		for (int i = 0; i < Number.length(); i++) {
			x = Number.charAt(i);
			if (x != ',' && x != '\n' && x != '/' && x != ';' && x != '\\' && x != 'n' && x1 != 'n') {
				if (x == '-') {
					throw new RuntimeException("negatives not allowed");
				}
				subNum += x;
			} else {
				if (!subNum.equals(""))
					sum += Integer.parseInt(String.valueOf(subNum));
				subNum = "";
			}
		}
		if (!subNum.equals(""))
			sum += Integer.parseInt(String.valueOf(subNum));
		return sum;
	}
}
