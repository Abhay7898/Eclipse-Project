package stringProgram;

public class VowelCount {
	public static void main(String[] args) {
		String s="i am not abhay garhwal";
		char ch[]=s.toLowerCase().toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
