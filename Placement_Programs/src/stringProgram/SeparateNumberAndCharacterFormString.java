package stringProgram;

public class SeparateNumberAndCharacterFormString {
	public static void main(String[] args) {
		String s="I3 A2M N7O4T A1B8H3AY G1AR9H0W4A6L1";
		char word[]=s.toCharArray();
		String alpha="";
		String num="";
		for (int i = 0; i < word.length; i++) {
			if (word[i]>=48&&word[i]<=57) {
				num+=word[i]+",";
			} else {
				alpha+=word[i];
			}
		}
		System.out.println(alpha);
		System.out.println(num);
	}
}
