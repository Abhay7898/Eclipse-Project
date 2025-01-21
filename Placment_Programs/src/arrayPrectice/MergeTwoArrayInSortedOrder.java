package arrayPrectice;

import java.util.Arrays;

public class MergeTwoArrayInSortedOrder {
	public static void main(String[] args) {
		int arrayA[] = { -7, 12, 17, 29, 41, 56, 79 };
		int arrayB[] = { -9, -3, 0, 5, 19 };
		int newArray[]= new int [arrayA.length+arrayB.length];
		int j=0;
		
		//to marge
		for (int i = 0; i < newArray.length; i++) {
			if (i<arrayA.length) {
				newArray[i]=arrayA[i];
			} else {
				newArray[i]=arrayB[j];
				j++;
			}
		}
		
		//For sorting
		for (int i = 0; i < newArray.length; i++) {
			for (int k = i+1; k < newArray.length; k++) {
				if (newArray[i]<newArray[k]) {
					int temp=newArray[i];
					newArray[i]=newArray[k];
					newArray[k]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
