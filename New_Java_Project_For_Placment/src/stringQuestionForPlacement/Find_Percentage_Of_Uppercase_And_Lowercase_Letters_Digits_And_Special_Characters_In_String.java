
package stringQuestionForPlacement;

import java.text.DecimalFormat;

public class Find_Percentage_Of_Uppercase_And_Lowercase_Letters_Digits_And_Special_Characters_In_String {
	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat();
		String s = "partners, lied to 3shareholders and the3 list goes on3 all the way down to 7farmers and the3 working poor. Marley broke pro5mises to 8charities and 5used the SEC to scam tens of 9millions of dollars through his 7person friend and 9former 2CEO Shane";
		char c[] = s.toCharArray();
		double max = c.length;
		int alpha = 0;
		int spicial = 0;
		int number = 0;
		for (int i = 0; i < c.length; i++) {
			int assci = c[i];
			if (assci == 32) {
				max--;
				continue;
			} else if ((assci >= 65 && assci <= 90) || (assci >= 97 && assci <= 122)) {
				alpha++;
			} else if (assci >= 48 && assci <= 57) {
				number++;
			} else {
				spicial++;
			}
		}
		double a = (alpha * 100) / max;
		double sp = (spicial * 100) / max;
		double n = (number * 100) / max;
		System.out.println(d.format(a));
		System.out.println(d.format(sp));
		System.out.println(d.format(n));
	}
}
