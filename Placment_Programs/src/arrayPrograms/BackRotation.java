package arrayPrograms;

import java.util.Arrays;

public class BackRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int index = 3;
		int last = a.length - 1;

		while (index < last) {
			int temp = a[last];
			a[last] = a[index];
			a[index] = temp;
			index++;
			last--;
		}

		/*
		 * for (int index = 3; index < last; index++) { int temp = a[last]; a[last] =
		 * a[index]; a[index] = temp; last--; }
		 */

		System.out.println(Arrays.toString(a));
	}
}
