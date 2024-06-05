package stringProgram;

public class ToReplaceCharacter {
	public static void main(String[] args) {
		String s="ABABABABA";
		System.out.println(s.toString());
		s=s.replace('B', '*');
		s=s.replace('A','B');
		s=s.replace('*','A');
		System.out.println(s);
		
		System.out.println('a' + 'b' + 'c');
	}
}
