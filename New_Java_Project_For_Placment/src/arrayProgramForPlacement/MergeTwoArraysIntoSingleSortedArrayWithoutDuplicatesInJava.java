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
		count=0;
		int n[]=new int [count];
		for(int i=0;i<newArray.length;i++) {
			for (int j = i+1; j < newArray.length; j++) {
				if(newArray[i]>newArray[j]) {
					int tem=newArray[j];
					newArray[j]=newArray[i];
					newArray[i]=tem;
				}
				if (newArray[i]==newArray[j]) {
					newArray[j]=0;
					
				}
			}
			if(newArray[i]!=0) {
			count++;	
			}
			n=new int[count];
			if(newArray[i]!=0) {
				n[i]=newArray[i];
			}
		}
		System.out.println(n.length);
		System.out.println(count);
		System.out.println(Arrays.toString(newArray));
	}
}
