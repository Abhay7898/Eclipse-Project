package TestInteger;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] num = { 1, 3, 4, 5, 7, 17, 8, 9, 10, 12, 14, 15 };
		Arrays.sort(num);
		for (int i = 0; i < num[num.length - 1]; i++) {
			boolean flage = false;
			for (int j = 0; j < num.length; j++) {
				if (num[j] == i) {
					flage = true;
					break;
				}
			}
			if (!flage) {
				System.out.println(i);
			}
		}
	}
}
