package stringQuestionForPlacement;

public class StringToUpperCase {
	public static void main(String[] args) {
		String s = "Abhay Garhwal";
		char ch[] = s.toCharArray();
		s = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				s += ch[i];
			} else if (ch[i] == 32) {
				s += ch[i];
			} else {
				int j = ch[i] - 32;
				s += (char) j;
			} 

		}
		System.out.println(s);
	}
}
