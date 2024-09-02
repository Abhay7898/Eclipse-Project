package patternPrograms;

public class Pattern28 {
	/*
	J
	J A
	J A V
	J A V A
	J A V A J
	J A V A J 2
	J A V A J 2 E
	J A V A J 2 E E
	 */
	public static void main(String[] args) {
		String s="JAVAJ2EE";
		char ch[]=s.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(ch[j]+" ");
			}
			System.out.println();
		}
	}
}
