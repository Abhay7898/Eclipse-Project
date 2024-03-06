package integerQuestionForPlacement;

public class FrequencyCountOnAlphaCountValueWithAlpha {
	public static void main(String[] args) {
		// in : aasdffaaacc
		// output : 2a1s1d2f3a2c
		String input = "aasdffaaacc";
		String out = "";
		char ch[] = input.toCharArray();
		char firstchar = Character.MIN_VALUE;
		for(int i = 0; i< ch.length; i++) {
			int cout = 1;
			char c = ch[i];
			if(c == firstchar) {
				continue;
			}
			for(int j = i + 1; j< ch.length; j++) {
				if(c == ch[j]) {
					cout ++;
				}else {
					break;
				}
			}
			out += cout + Character.toString(c);
			firstchar = c;
		}
		System.out.println(out);
	}
}
