package integerQuestionForPlacement;

public class DuplicateNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 6, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			boolean flage = false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flage = true;
					a[j] ='*';
				}
			}
			if (flage && a[i] != '*') {
				System.out.println(a[i]);
			}
		}
	}
}
