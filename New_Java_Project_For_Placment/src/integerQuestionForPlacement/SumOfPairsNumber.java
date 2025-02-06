package integerQuestionForPlacement;

import java.util.Arrays;

public class SumOfPairsNumber {
	public static void main(String[] args) {
		int num[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int[] intArray = new int[num.length / 2];
		int n = 0;
		
		for (int i = 0; i <= num.length / 2 + 2; i = i + 2) {
			intArray[n++] = num[i] + num[i + 1];
		}
		System.out.println(num.length / 2 + 2);
		System.out.println(Arrays.toString(intArray));
	}
}
