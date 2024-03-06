package integerQuestionForPlacement;

import java.util.Arrays;

public class MoveAllZeroToEndWithProperOrderWithString {

	public static void main(String[] args) {

		// output= {2,3,5,3,7,5,2,0,0,0,0}
		int a[] = { 2, 3, 0, 5, 3, 0, 0, 7, 5, 0, 2 };
		String s = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				 //s = s.concat(a[i]);
				s += a[i];
				a[i] = 0;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			a[i] = Integer.parseInt(Character.toString(s.charAt(i)));
		}
		System.out.println(s);
		System.out.println(Arrays.toString(a));
	}
}
