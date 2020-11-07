package string.calculator.service;

public class StringCalculator {

	public int Add(String Number) {
		int sum = 0;
		char x = ' ';
		String subNum = "";
		if (Number.equals(" ")) {
			return 0;
		}
		for (int i = 0; i < Number.length(); i++) {
			x = Number.charAt(i);
			if (x != ',') {
				subNum += x;
			} else {
				sum += Integer.parseInt(String.valueOf(subNum));
				subNum = "";
			}
		}
		if (!subNum.equals(""))
			sum += Integer.parseInt(String.valueOf(subNum));
		return sum;
	}
}
