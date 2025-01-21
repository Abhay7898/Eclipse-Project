package arrayPrectice;

import java.util.Arrays;

public class ReversOfArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int frist = 0;
		int last = a.length - 1;

		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[last];
			a[last] = temp;
			last--;
		}

		while (frist < a.length / 2) {
			int temp = a[frist];
			a[frist] = a[last];
			a[last] = temp;
			frist++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
