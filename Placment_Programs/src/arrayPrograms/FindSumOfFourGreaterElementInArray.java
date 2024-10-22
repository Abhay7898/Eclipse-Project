package arrayPrograms;

import java.util.Arrays;

public class FindSumOfFourGreaterElementInArray {
	public static int sumOFGraterElements(int array[],int elements) {
		int sum=0;
		Arrays.sort(array);
		if (elements>1) {
			for (int i =array.length-1; i>=array.length-elements; i--) {
				sum+=array[i];
			}
			return sum;
		}
		return 0;
	}

	public static void main(String[] args) {
		int array[] = { -4,5,6,7,7};
		System.out.println(sumOFGraterElements(array,4));
	}
}
