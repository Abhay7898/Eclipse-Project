package stringQuestionForPlacement;

public class CharacterWithRemovWithGivenArrays {
	public static void main(String[] args) {
		char charArry[] = { 'h', 'e', 'o' };
		String s = "hello world*";
		String remove = "";
		char stringArray[] = s.toCharArray();
		s = "";
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < charArry.length; j++) {
				if (charArry[j] == stringArray[i]) {
					remove += stringArray[i];
					stringArray[i] = '*';
				}
			}
		}
		for (int k = 0; k < stringArray.length; k++) {
			if (stringArray[k] != '*') {
				s += stringArray[k];
			}
		}

		System.out.println(s);
		System.out.println(remove);
	}
}
