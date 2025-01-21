package arrayProgramForPlacement;

import java.util.Arrays;

public class Negetive {
	public static void main(String[] args) {
		int a[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int newA[] = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				newA[index] = a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(newA));
		System.out.println(Arrays.toString(a));
	}
}
