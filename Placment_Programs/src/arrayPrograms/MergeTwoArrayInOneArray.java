package arrayPrograms;

import java.util.Arrays;

public class MergeTwoArrayInOneArray {
	public static void main(String[] args) {
		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79, 45 };
		int arrayB[] = { -9, -3, 0, 5, 19,20 };
		
		int newArray[]=new int[arrayA.length+arrayB.length];
		
		int secondIndex=0;
		for (int i = 0; i < newArray.length; i++) {
			if (i<arrayA.length) {
				newArray[i]=arrayA[i];
			}else {
			newArray[i]=arrayB[secondIndex];
			secondIndex++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
