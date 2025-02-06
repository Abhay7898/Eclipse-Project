package stringQuestionForPlacement;

public class LongestWordWichDoesNotIncludeNumberInIt {
	public static void main(String[] args) {
		String s = "Have the function Longest4Wordsen take the sen parameter being passed and return the";
		String sArray[] = s.split("\\s");
		s = "";
		for (int i = 0; i < sArray.length; i++) {
			char wordArray[] = sArray[i].toCharArray();
			String word = "";
			for (int j = 0; j < wordArray.length; j++) {
				if (Character.isAlphabetic(wordArray[j])) {
					word += wordArray[j];
				} else {
					word = "";
				}
			}
			s += word + " ";
		}
		String newArray[] = s.split("\\s");
		s = "";
		int check = 0;
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				if (newArray[i].length() < newArray[j].length()) {
					if (check < newArray[j].length()) {
						check = newArray[j].length();
						s = newArray[j];
					}
				}
			}
		}
		System.out.println(s);
	}
}
