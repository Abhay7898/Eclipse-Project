package arrayProgram;

import java.util.Arrays;

public class MergeTwoArrayInOneArray {
	public static void main(String[] args) {
		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79, 45 };
		int arrayB[] = { -9, -3, 0, 5, 19,20 };
		int frist=0;
		int nextIndex=0;
		int newArray[]=new int [arrayA.length+arrayB.length];
		for (int i = 0; i < newArray.length; i++) {
			if(frist!=arrayA.length) {
				newArray[i]=arrayA[frist];
				frist++;
			}else {
			newArray[i]=arrayB[nextIndex];
			nextIndex++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
