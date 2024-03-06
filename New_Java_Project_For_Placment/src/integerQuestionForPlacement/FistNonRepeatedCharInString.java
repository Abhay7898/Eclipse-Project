package integerQuestionForPlacement;

public class FistNonRepeatedCharInString {
	public static void main(String[] args) {
		String s = "strrreeoesttttssysss";
		char ch[]= s.toCharArray();
		char lastChar = Character.MIN_VALUE;
		for(int i=0;i<ch.length;i++) {
			char c = ch[i];
			if(c == lastChar) {
				continue;
			}
			boolean flage = true;
			for(int j =i+1;j<ch.length;j++){
				if(c ==ch[j]) {
					flage = false;
					break;
				}
			}
			lastChar = c;
			if(flage) {
				System.out.println(c);
				break;
			}
		}
	}
}
