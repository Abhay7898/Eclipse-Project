package stringQuestionForPlacement;

public class SeparateNumberAndCharacterFormString {
	public static void main(String[] args) {
		String s="I3 A2M N7O4T A1B8H3AY G1AR9H0W4A6L1";
		char c[]=s.toCharArray();
		String number="";
		String alpha="";
		for(int i=0;i<c.length;i++) {
			int assci=c[i];
			if((assci>=65&&assci<=90)||(assci>=97&&assci<=122)) {
				alpha+=(char)assci;
			}else {
				number+=(char)assci;
			}
		}
		System.out.println(alpha);
		System.out.println(number);
	}
}
