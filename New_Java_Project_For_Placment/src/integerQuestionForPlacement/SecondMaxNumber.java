package integerQuestionForPlacement;

import java.util.Arrays;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 78, 5, 6, 7, 8, 9, 10 };
		int firstMax = num[0];
		int secoundMax = num[1];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > firstMax) {
				secoundMax = firstMax;
				firstMax = num[i];
			}
		}
		System.out.println(secoundMax);
		
		
		
		
		Arrays.sort(num);
		System.out.println(num[num.length-2]);

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		System.out.println(num[num.length - 2]);
	}
}
