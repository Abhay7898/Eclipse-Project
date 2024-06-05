package testArrays;

import java.util.Arrays;

public class MergeTwoArrayInSortedOrder {
	public static void main(String[] args) {

		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79, 45 };
		int arrayB[] = { -9, -3, 0, 5, 19, 20 };
		int len = arrayA.length + arrayB.length;
		int index = 0;
		int newArray[]=new int[len];
		for (int i = 0; i < len; i++) {
			if(i<arrayA.length) {
				newArray[i]=arrayA[i];
			}
			else {
				newArray[i]=arrayB[index];
				index++;
			}
		}
		System.out.println(Arrays.toString(newArray));
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i+1; j < newArray.length; j++) {
				if(newArray[i]<newArray[j]) {
					int temp=newArray[j];
					newArray[j]=newArray[i];
					newArray[i]=temp;
					}
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}