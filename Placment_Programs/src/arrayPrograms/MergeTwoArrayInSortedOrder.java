package arrayPrograms;

import java.util.Arrays;

public class MergeTwoArrayInSortedOrder {
	public static void main(String[] args) {
		
		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79 };
		int arrayB[] = { -9, -3, 0, 5, 19 };
		
		int newArray[]=new int[arrayA.length+arrayB.length];
		
		int secondindex=0;
		
		for (int i = 0; i < newArray.length; i++) {
				if (i<arrayA.length) {
					newArray[i]=arrayA[i];
				} else {
					newArray[i]=arrayB[secondindex];
					secondindex++;
				}
		}
		
		//Arrays.sort(newArray);
		
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i+1; j < newArray.length; j++) {
				if (newArray[i]>newArray[j]) {
					int temp=newArray[j];
					newArray[j]=newArray[i];
					newArray[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
