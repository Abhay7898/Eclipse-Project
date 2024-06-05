package arrayProgramForPlacement;

import java.util.Arrays;

public class MergeTwoArraysIntoSingleSortedArrayWithoutDuplicatesInJava {
	public static void main(String[] args) {
		int array1[] = { 7, -5, 3, 8, -4, 11, -19, 21 };
		int array2[] = { 6, 13, -7, 0, 11, -4, 3, -5 };
		int count = 0;
		int index = 0;
		int len = array1.length + array2.length;
		int newArray[] = new int[len];
		//To Marge
		for (int i = 0; i < len; i++) {
			if (i < array1.length) {
				newArray[i] = array1[i];
				count++;
			} else {
				newArray[count] = array2[index];
				count++;
				index++;
			}
		}
		//To find Duplicate
		count = 0;
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				if (newArray[i] == newArray[j]) {
					count++;
				}
			}
		}
		//For Shorting
		for (int i = 0; i < newArray.length; i++) {

			for (int j = i + 1; j < newArray.length; j++) {
				if (newArray[i] > newArray[j]) {
					int tem = newArray[j];
					newArray[j] = newArray[i];
					newArray[i] = tem;
				}
			}
		}
		System.out.println(Arrays.toString(newArray));
		//to Avoid Duplicate
		array1=new int[len-count];
		array1[0]=newArray[0];
		for (int i=0;i<newArray.length;i++) {
			for (int j = i+1; j < newArray.length; j++) {
				if(newArray[i]!=newArray[j]) {
					
				}
			}
		}
		System.out.println(array1.length);
		System.out.println(count);
		System.out.println(Arrays.toString(newArray));
	}
}
