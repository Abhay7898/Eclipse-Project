package stringProgram;

public class StringToNumber {
	public static void main(String[] args) {
		String s = "16484";
		char ch []=s.toCharArray();
		int number=0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			number=number*10+((int)c-48);
		}
		System.out.println(number);
	}
}
