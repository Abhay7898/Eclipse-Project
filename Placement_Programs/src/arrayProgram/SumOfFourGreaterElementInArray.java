package arrayProgram;

import java.util.Arrays;

public class SumOfFourGreaterElementInArray {
	public static void main(String[] args) {
		int array[] = { -7, 12, 17, 29, 41, 56, 79, 45 };
		int sum=0;
		if (array.length<4) {
			for (int i = 0; i < array.length; i++) {
				sum+=array[i];
			}
		}else {
			if (array.length<5) {
				for (int i = 0; i < array.length; i++) {
					sum+=array[i];
				}
			} else {
				Arrays.sort(array);
				for (int i =array.length-1; i >=array.length-4; i--) {
					sum+=array[i];
				}
			}
		}
		System.out.println(sum);
	}
}
