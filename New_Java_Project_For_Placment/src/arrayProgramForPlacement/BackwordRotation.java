package arrayProgramForPlacement;

import java.util.Arrays;

public class BackwordRotation {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 1,2,3,3,4,8,7,6,5,4
		int index = 3;
		int last = a.length - 1;
		for (int i = index; i < last; i++) {
			int tem = a[last];
			a[last] = a[index];
			a[index] = tem;
			index++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	}
}
