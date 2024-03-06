package stringQuestionForPlacement;

public class NextCharacterAndNextNumber {
	public static void main(String[] args) {
		String s = "I3 A2M N7O4T A1B8H3AY G1AR9H0W4A6L1";
		char charArray[] = s.toCharArray();
		s="";
		for (int i = 0; i < charArray.length; i++) {
			int assci=charArray[i];
			if(assci==' ') {
				s+=charArray[i];
				continue;
			}
			if (assci==122){
				charArray[i]=97;
				s+=charArray[i];
				continue;
			}
			if(assci==57) {
				charArray[i]=(char)48;
				s+=charArray[i];
				continue;
			}
			charArray[i]=(char)(assci+1);
			s+=charArray[i];
		}
		System.out.println(s);
	}
}