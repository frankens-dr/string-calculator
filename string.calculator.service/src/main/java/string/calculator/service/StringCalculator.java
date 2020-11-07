package string.calculator.service;

public class StringCalculator {

	private int calledCount;

	StringCalculator() {
		calledCount = 0;
	}

	public int Add(String Number) {
		calledCount++;
		int sum = 0;
		char x = ' ', x1 = ' ';
		String subNum = "";
		if (Number.equals(" ")) {
			return 0;
		}
		for (int i = 0; i < Number.length(); i++) {
			x = Number.charAt(i);
			if (i + 1 < Number.length())
				x1 = Number.charAt(i + 1);
			if (checkFordelimeters(x, x1)) {
				if (x == '-') {
					throw new RuntimeException("negatives not allowed");
				}
				subNum += x;
			} else {
				if (subNum != "" && Integer.parseInt(subNum) <= 1000)
					sum += Integer.parseInt(String.valueOf(subNum));
				subNum = "";
			}
		}
		if (!subNum.equals(""))
			sum += Integer.parseInt(String.valueOf(subNum));
		return sum;
	}

	public boolean checkFordelimeters(char x, char x1) {
		if (x != '\n' && x != '/' && x != ';' && x != '\\' && x != 'n' && x1 != 'n' && x != ',' && x != '*' && x != '['
				&& x != ']' && x != '%') {
			return true;
		}
		return false;
	}

	public int GetCalledCount() {
		return calledCount;
	}
}
