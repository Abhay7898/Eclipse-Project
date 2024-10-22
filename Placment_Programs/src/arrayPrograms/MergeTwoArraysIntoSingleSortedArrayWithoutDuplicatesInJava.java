package arrayPrograms;

import java.util.Arrays;

public class MergeTwoArraysIntoSingleSortedArrayWithoutDuplicatesInJava {
	public static void main(String[] args) {
		int array1[] = { 7, -5, 3, 8, -4, 11, -19, 21,32};
		int array2[] = { 6, 13, -7, 0, 11, -4, 3, -5 };
		
		int second=0;
		int newArray[]=new int[array1.length+array2.length];
		
		//To marge into One Array
		for (int i = 0; i < newArray.length; i++) {
			if (i<array1.length) {
				newArray[i]=array1[i];
			} else {
				newArray[i]=array2[second];
				second++;
			}
		}
		
		// For Shorting  
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i+1; j < newArray.length; j++) {
				if (newArray[i]>newArray[j]) {
					int temp=newArray[i];
					newArray[i]=newArray[j];
					newArray[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
	}
}
