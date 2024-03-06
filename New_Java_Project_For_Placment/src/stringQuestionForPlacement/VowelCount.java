package stringQuestionForPlacement;

public class VowelCount {
	public static void main(String[] args) {
		String s="i am not abhay garhwal";
		char ch[]=s.toCharArray();
		int count=0;
		//char vowel[]={'a','e','i','o','u'};
		for(int i=0;i<ch.length;i++) {
			/*
			 * for (int j = 0; j < vowel.length; j++) { if(ch[i]==vowel[j]) { count++; } }
			 */
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
