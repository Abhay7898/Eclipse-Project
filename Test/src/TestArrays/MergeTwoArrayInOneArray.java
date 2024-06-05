package TestArrays;

import java.util.Arrays;

public class MergeTwoArrayInOneArray {
	public static void main(String[] args) {
		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79, 45 };
		int arrayB[] = { -9, -3, 0, 5, 19,20 };
		int index=0;
		int len=arrayA.length+arrayB.length;
		int newArray[]=new int[len];
		for(int i=0;i<len;i++) {
			if(i<arrayA.length) {
				newArray[i]=arrayA[i];
			}else {
				newArray[i]=arrayB[index];
				index++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
