package integerQuestionForPlacement;

public class FistNonRepeatedCharInString {
	public static void main(String[] args) {
		String s = "ttrgggrrrrxrrrvfggggdddddwwww";
		char ch[]= s.toCharArray();
		char lastChar = ch[0];
		for(int i=0;i<ch.length;i++) {
			char c = ch[i];
			if(c == lastChar&&i!=0) {
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
