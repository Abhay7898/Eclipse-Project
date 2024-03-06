package integerQuestionForPlacement;

public class DuplicateNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 6, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			boolean flage = false;
			for (int j = i + 1; j < a.length; j++) {
				if (num == a[j]) {
					flage = true;
					a[j] = 0;
				}
			}
			if (flage && num != 0) {
				 System.out.println(num);
			 }
		 }
	}
}
