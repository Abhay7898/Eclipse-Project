package stringQuestionForPlacement;

public class FindFirstRepeatedAndNon_RepeatedCharacterInAString {
	public static void main(String[] args) {
		String s = "JavaConceptOfTheDay";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean flage=false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[i]);
					flage=true;
					break;
				}
			}
			if(flage) {
				break;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			boolean flage=false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] != ch[j]) {
					System.out.println(ch[i]);
					flage=true;
					break;
				}
			}
			if(flage) {
				break;
			}
		}
	}
}
