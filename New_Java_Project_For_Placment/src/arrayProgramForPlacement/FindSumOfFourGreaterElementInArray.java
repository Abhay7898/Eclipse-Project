package arrayProgramForPlacement;

import java.util.Arrays;

public class FindSumOfFourGreaterElementInArray {
	public static int findSumOfFourGreatestElementInArray(int array[]) {
		int sum = 0;
		if (array.length < 4) {
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			System.out.println(Arrays.toString(array));
			return sum;
		} else {
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						int tem = array[j];
						array[j] = array[i];
						array[i] = tem;
					}
				}
			}
			if (array.length < 5) {
				for (int i = 0; i < array.length; i++) {
					sum += array[i];
				}
			} else {
				for (int i = array.length - 1; i >= array.length - 4; i--) {
					sum += array[i];
				}
			}
			System.out.println(Arrays.toString(array));
			return sum;
		}
	}
	public static void main(String[] args) {
		int array[] = { -4, 5, 6};
		System.out.println(findSumOfFourGreatestElementInArray(array));
	}
}
