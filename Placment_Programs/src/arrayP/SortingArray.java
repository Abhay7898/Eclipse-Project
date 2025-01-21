package arrayP;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int a[] = { -7, 12, 17, 29, 41, 56, 79, 45 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] >a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
