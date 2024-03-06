package integerQuestionForPlacement;

public class MissingNumber {
	public static void main(String[] args) {
		int[] n = { 1, 3, 4, 5, 7 ,17,8, 9, 10, 12, 14, 15};

		for (int i = 1; i < n[n.length - 1]; i++) {
			boolean flage = true;
			for (int j = 0; j < n.length; j++) {
				if (i == n[j]) {
					flage = false;
					break;
				}
			}
			if (flage) {
				System.out.println(i);
			}
		}
	}
}
