package integerQuestionForPlacement;

public class Find_Longest_Substring_Without_Repeating_Characters {
	public static void main(String[] args) {
		// output:- a2novice
		String s = "java2novice";
		String sub = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean flage = true;
			char one = ch[i];
			for (int j = i + 1; j < ch.length; j++) {
				if (one == ch[j]) {
					sub = "";
					flage = false;
					break;
				}
			}
			if (flage) {
				sub += one;
			}
		}
		System.out.println(sub);

	}
}
